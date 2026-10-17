package model;

// Tidak mengimplementasikan Terarsip karena tidak ada rak fisik
public class BerkasDigital extends Koleksi {
    private int ukuranMB;
    private String tautanUnduh;

    public BerkasDigital(String kode, String judul, int tahun, int ukuranMB, String tautanUnduh) {
        super(kode, judul, tahun);
        this.ukuranMB = ukuranMB;
        this.tautanUnduh = tautanUnduh;
    }

    @Override
    public boolean layakDipinjam() {
        return true;
    }

    @Override
    public String deskripsi() {
        return super.deskripsi() + " | " + ukuranMB + " MB | Link: " + tautanUnduh + " | Layak: " + layakDipinjam();
    }
}