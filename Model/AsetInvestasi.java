package Model;

public abstract class AsetInvestasi {
    private String nama;
    private double nilai;
    private String jenis;

    public AsetInvestasi(String nama, double nilai, String jenis) {
        this.nama = nama;
        this.nilai = nilai;
        this.jenis = jenis;
    }

    // Getter
    public String getNama() { 
        return nama; 
    }
    
    public double getNilai() { 
        return nilai; 
    }
    
    public String getJenis() { 
        return jenis; 
    }

    // Setter
    public void setNama(String nama) { 
        this.nama = nama; 
    }
    
    public void setNilai(double nilai) { 
        this.nilai = nilai; 
    }
    
    public void setJenis(String jenis) { 
        this.jenis = jenis; 
    }

    // Abstract
    public abstract void infoAset();
}
