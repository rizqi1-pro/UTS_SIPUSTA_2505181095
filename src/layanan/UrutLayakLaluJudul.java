package layanan;

import java.util.Comparator;
import model.Koleksi;

public class UrutLayakLaluJudul implements Comparator<Koleksi> {
    @Override
    public int compare(Koleksi a, Koleksi b) {
        int bandingLayak = Boolean.compare(b.layakDipinjam(), a.layakDipinjam());
        if (bandingLayak != 0) {
            return bandingLayak;
        }
        return a.getJudul().compareToIgnoreCase(b.getJudul());
    }
}