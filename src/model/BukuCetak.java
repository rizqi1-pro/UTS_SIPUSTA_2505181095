package model;

public class BukuCetak extends Koleksi implements Terarsip {
    private int jumlahHalaman;
    private String rak;
    private boolean sedangDiperbaiki;

    public BukuCetak(String kode, String judul, int tahun, int jumlahHalaman, String rak, boolean sedangDiperbaiki) {
        super(kode, judul, tahun);
        this.jumlahHalaman = jumlahHalaman;
        this.rak = rak;
        this.sedangDiperbaiki = sedangDiperbaiki;
    }

    @Override
    public boolean layakDipinjam() {
        return !sedangDiperbaiki;
    }

    @Override
    public String nomorRak() { return rak; }

    @Override
    public int lokasiLantai() { return 1; }

    @Override
    public String deskripsi() {
        return super.deskripsi() + " | " + jumlahHalaman + " hal | " + ringkasanArsip() + " | Layak: " + layakDipinjam();
    }
}