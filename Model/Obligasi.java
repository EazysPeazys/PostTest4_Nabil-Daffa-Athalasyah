package Model;

public class Obligasi extends AsetInvestasi {
    private double bunga;

    public Obligasi(String nama, double nilai, double bunga) {
        super(nama, nilai, "Obligasi");
        this.bunga = bunga;
    }

    public double getBunga() { return bunga; }
    public void setBunga(double bunga) { this.bunga = bunga; }

    @Override
    public void infoAset() {
    System.out.println("Ini merupakan Aset Obligasi" + bunga + "%");
    }
}
