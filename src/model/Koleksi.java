package model;

public abstract class Koleksi {
    protected String kodeKoleksi;
    protected String judul;
    protected int tahunTerbit;
    protected boolean dipinjam;

    public Koleksi(String kodeKoleksi, String judul, int tahunTerbit) {
        this.kodeKoleksi = kodeKoleksi;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    public String getKodeKoleksi() { return kodeKoleksi; }
    public String getJudul() { return judul; }
    public boolean isDipinjam() { return dipinjam; }
    public void setDipinjam(boolean dipinjam) { this.dipinjam = dipinjam; }

    
    public abstract boolean layakDipinjam();

    
    public String deskripsi() {
        return kodeKoleksi + " - " + judul + " (" + tahunTerbit + ")";
    }
}