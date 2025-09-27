package Model;

import Interface.Transaksi;

public class Saham extends AsetInvestasi implements Transaksi {
    private String perusahaan;

    public Saham(String nama, double nilai, String perusahaan) {
        super(nama, nilai, "Saham");
        this.perusahaan = perusahaan;
    }

    public String getPerusahaan() { return perusahaan; }
    public void setPerusahaan(String perusahaan) { this.perusahaan = perusahaan; }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Perusahaan: " + perusahaan);
    }

    @Override
    public void beli(double jumlah) {
        System.out.println("Membeli saham " + perusahaan + " senilai Rp" + jumlah);
    }

    @Override
    public void jual(double jumlah) {
        System.out.println("Menjual saham " + perusahaan + " senilai Rp" + jumlah);
    }

    @Override
    public void infoAset() {
    System.out.println("Ini merupakan Aset Saham Perusahaan " + perusahaan);
    }
}

