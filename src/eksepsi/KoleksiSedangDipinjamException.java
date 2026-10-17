package eksepsi;

public class KoleksiSedangDipinjamException extends PustakaException {
    public KoleksiSedangDipinjamException(String kode) {
        super("Koleksi dengan kode " + kode + " sedang dipinjam.");
    }
}