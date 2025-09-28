package Model;

public class Saham extends AsetInvestasi {
    private String perusahaan;

    public Saham(String nama, double nilai, String perusahaan) {
        super(nama, nilai, "Saham");
        this.perusahaan = perusahaan;
    }

    public String getPerusahaan() {
        return perusahaan;
    }

    public void setPerusahaan(String perusahaan) {
        this.perusahaan = perusahaan;
    }

    @Override
    public void infoAset() {
        System.out.println("Ini merupakan Aset Saham.");
        System.out.println("Nama Aset: " + getNama());
        System.out.println("Nilai Aset: " + getNilai());
        System.out.println("Perusahaan: " + perusahaan);
    }
}
