package Model;

public abstract class AsetInvestasi {
    private final String nama;
    private final double nilai;
    private final String jenis;

    public AsetInvestasi(String nama, double nilai, String jenis) {
        this.nama = nama;
        this.nilai = nilai;
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public double getNilai() {
        return nilai;
    }

    public String getJenis() {
        return jenis;
    }

    // Abstract method
    public abstract void infoAset();

    // Overloading
    public void infoAset(String nama) {
        System.out.println("Info Aset (Nama): " + nama);
    }

    public void infoAset(String nama, double nilai) {
        System.out.println("Info Aset (Nama): " + nama);
        System.out.println("Info Aset (Nilai): " + nilai);
    }

    public void tampilkanJenis() {
        System.out.println("Jenis Aset: " + jenis);
    }

    public void setNama(String nama) {
        throw new UnsupportedOperationException("Tidak Diketahui");
    }

    public void setNilai(double nilai) {
        throw new UnsupportedOperationException("Tidak Diketahui");
    }
}
