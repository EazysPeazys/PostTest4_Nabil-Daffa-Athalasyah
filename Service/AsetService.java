package Service;

import java.util.ArrayList;
import java.util.Scanner;
import Model.AsetInvestasi;
import Model.Saham;
import Model.Obligasi;

public class AsetService {
    private final ArrayList<AsetInvestasi> daftarAset = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    public void tambahAset() {
        System.out.println("\n== Tambah Aset ==");
        System.out.print("Masukkan pilihan jenis aset (1. Saham 2. Obligasi 3. Reksa Dana 4. Crypto 5. Emas 6. Properti): ");
        int jenis = sc.nextInt();
        sc.nextLine();

        System.out.print("Silahkan masukkan nama aset: ");
        String nama = sc.nextLine();

        System.out.print("Silahkan masukkan nilai aset: ");
        double nilai = sc.nextDouble();
        sc.nextLine();

        AsetInvestasi aset;
        if (jenis == 1) {
            System.out.print("Silahkan masukkan nama perusahaan: ");
            String perusahaan = sc.nextLine();
            aset = new Saham(nama, nilai, perusahaan) {};
        } else {
            System.out.print("Silahkan masukkan bunga obligasi: ");
            double bunga = sc.nextDouble();
            sc.nextLine();
            aset = new Obligasi(nama, nilai, bunga) {};
        }

        daftarAset.add(aset);
        System.out.println("===| Aset berhasil ditambahkan! |===");
    }

    public void lihatAset() {
        System.out.println("===| Daftar Aset |===");
        if (daftarAset.isEmpty()) {
            System.out.println("Tidak ada aset yang terdaftar");
            return;
        }
        int i = 1;
        for (AsetInvestasi a : daftarAset) {
            System.out.println("Aset ke-" + (i++));
            a.infoAset();
            System.out.println();
        }
    }

    public void cariAset() {
        System.out.println("\n== Cari Aset ==");
        System.out.println("1. Cari berdasarkan Nama");
        System.out.println("2. Cari berdasarkan Nilai");
        System.out.print("Pilih metode pencarian: ");
        int pilihan = sc.nextInt();
        sc.nextLine();

        switch (pilihan) {
            case 1 -> {
                System.out.print("Masukkan nama aset: ");
                String nama = sc.nextLine();
                cariAset(nama); // overloading
            }
            case 2 -> {
                System.out.print("Masukkan nilai aset: ");
                double nilai = sc.nextDouble();
                sc.nextLine();
                cariAset(nilai); // overloading
            }
            default -> System.out.println("Pilihan tidak valid.");
        }
    }

    public void cariAset(String nama) {
        boolean found = false;
        for (AsetInvestasi a : daftarAset) {
            if (a.getNama().equalsIgnoreCase(nama)) {
                a.infoAset();
                System.out.println();
                found = true;
            }
        }
        if (!found) System.out.println("Maaf, aset dengan nama '" + nama + "' tidak ditemukan.");
    }

    public void cariAset(double nilai) {
        boolean found = false;
        for (AsetInvestasi a : daftarAset) {
            if (a.getNilai() == nilai) {
                a.infoAset();
                System.out.println();
                found = true;
            }
        }
        if (!found) System.out.println("Maaf, aset dengan nilai " + nilai + " tidak ditemukan.");
    }

    public void hapusAset() {
        lihatAset();
        if (daftarAset.isEmpty()) return;
        System.out.print("Silahkan masukkan nomor aset yang ingin dihapus: ");
        int idx = sc.nextInt();
        sc.nextLine();
        if (idx >= 1 && idx <= daftarAset.size()) {
            daftarAset.remove(idx - 1);
            System.out.println("===| Aset berhasil dihapus |===");
        } else {
            System.out.println("Maaf Nomor tidak valid, Silahkan Coba Lagi!");
        }
    }

    public void ubahAset() {
        lihatAset();
        if (daftarAset.isEmpty()) return;
        System.out.print("Silahkan masukkan nomor aset yang ingin diubah: ");
        int idx = sc.nextInt();
        sc.nextLine();
        if (idx >= 1 && idx <= daftarAset.size()) {
            AsetInvestasi a = daftarAset.get(idx - 1);
            System.out.print("Silahkan masukkan nama baru: ");
            String nama = sc.nextLine();
            if (!nama.trim().isEmpty()) a.setNama(nama);

            System.out.print("Silahkan masukkan nilai baru: ");
            double nilai = sc.nextDouble();
            sc.nextLine();
            if (nilai > 0) a.setNilai(nilai);

            switch (a) {
                case Saham saham -> {
                    System.out.print("Silahkan masukkan perusahaan: ");
                    String p = sc.nextLine();
                    if (!p.trim().isEmpty()) saham.setPerusahaan(p);
                }
                case Obligasi obligasi -> {
                    System.out.print("Silahkan masukkan nilai bunga: ");
                    double b = sc.nextDouble();
                    sc.nextLine();
                    if (b >= 0) obligasi.setBunga(b);
                }
                default -> {
                }
            }

            System.out.println("===| Aset berhasil diperbarui! |===");
        } else {
            System.out.println("Maaf Nomor tidak valid! Silahkan Coba Lagi!");
        }
    }
}
