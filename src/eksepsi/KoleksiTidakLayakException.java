package eksepsi;

public class KoleksiTidakLayakException extends PustakaException {
    public KoleksiTidakLayakException(String kode) {
        super("Koleksi dengan kode " + kode + " tidak layak dipinjam saat ini.");
    }
}