package Service;

import java.util.ArrayList;
import java.util.Scanner;
import Model.AsetInvestasi;
import Model.Saham;
import Model.Obligasi;

public class AsetService {
    private ArrayList<AsetInvestasi> daftarAset = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void tambahAset() {
        System.out.println("\n== Tambah Aset ==");
        System.out.print("Masukkan jenis aset (1=Saham, 2=Obligasi): ");
        int jenis = sc.nextInt();
        sc.nextLine(); // buang newline

        System.out.print("Silahkan masukkan nama aset: ");
        String nama = sc.nextLine();

        System.out.print("Silahkan masukkan nilai aset: ");
        double nilai = sc.nextDouble();
        sc.nextLine();

        AsetInvestasi aset;
        if (jenis == 1) {
            System.out.print("Silahkan masukkan nama perusahaan: ");
            String perusahaan = sc.nextLine();
            aset = new Saham(nama, nilai, perusahaan);
        } else {
            System.out.print("Silahkan masukkan bunga obligasi (ex: 5.5): ");
            double bunga = sc.nextDouble();
            sc.nextLine();
            aset = new Obligasi(nama, nilai, bunga);
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
            a.tampilkanInfo(); // polymorphism + overriding
            System.out.println();
        }
    }

    public void cariAset() {
        System.out.print("Silahkan masukkan nama aset yang dicari: ");
        String keyword = sc.nextLine().toLowerCase();
        boolean found = false;
        for (AsetInvestasi a : daftarAset) {
            if (a.getNama().toLowerCase().contains(keyword)) {
                a.tampilkanInfo();
                System.out.println();
                found = true;
            }
        }
        if (!found) System.out.println("Maaf Aset tidak ditemukan.");
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

            if (a instanceof Saham) {
                System.out.print("Silahkan masukkan perusahaan: ");
                String p = sc.nextLine();
                if (!p.trim().isEmpty()) ((Saham) a).setPerusahaan(p);
            } else if (a instanceof Obligasi) {
                System.out.print("Silahkan masukkan nilai bunga: ");
                double b = sc.nextDouble();
                sc.nextLine();
                if (b >= 0) ((Obligasi) a).setBunga(b);
            }

            System.out.println("===| Aset berhasil diperbarui! |===");
        } else {
            System.out.println("Maaf Nomor tidak valid! Silahkan Coba Lagi!");
        }
    }
}
