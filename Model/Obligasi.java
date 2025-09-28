package Model;

public abstract class Obligasi extends AsetInvestasi {
    private double bunga;

    public Obligasi(String nama, double nilai, double bunga) {
        super(nama, nilai, "Obligasi");
        this.bunga = bunga;
    }

    public double getBunga() {
        return bunga;
    }

    public void setBunga(double bunga) {
        this.bunga = bunga;
    }

    @Override
    public void infoAset() {
        System.out.println("Ini merupakan Aset Obligasi.");
        System.out.println("Nama Aset: " + getNama());
        System.out.println("Nilai Aset: " + getNilai());
        System.out.println("Bunga: " + bunga + "%");
    }

    // Overloading
    @Override
    public void infoAset(String keterangan) {
        System.out.println("Obligasi: " + getNama() + " (" + keterangan + ")");
    }

    public void infoAset(double tambahanNilai) {
        System.out.println("Obligasi " + getNama() + " dengan tambahan nilai: " + (getNilai() + tambahanNilai));
    }
}
