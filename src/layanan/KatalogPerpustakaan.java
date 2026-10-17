package layanan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import model.Koleksi;
import eksepsi.*;

public class KatalogPerpustakaan {
    private List<Koleksi> daftar = new ArrayList<>();

    public void tambahKoleksi(Koleksi k) {
        daftar.add(k);
    }

    public List<Koleksi> getDaftar() {
        return daftar;
    }

    public void cetakStatus() {
        for (Koleksi k : daftar) {
            System.out.println(k.deskripsi());
        }
    }


    public void urut(Comparator<Koleksi> comp) {
        daftar.sort(comp);
    }


    public void pinjam(String kode) throws KoleksiSedangDipinjamException, KoleksiTidakLayakException {
        for (Koleksi k : daftar) {
            if (k.getKodeKoleksi().equalsIgnoreCase(kode)) {
                if (k.isDipinjam()) {
                    throw new KoleksiSedangDipinjamException(kode);
                }
                if (!k.layakDipinjam()) {
                    throw new KoleksiTidakLayakException(kode);
                }
                k.setDipinjam(true);
                System.out.println("Berhasil meminjam: " + k.getJudul());
                return;
            }
        }
        System.out.println("Koleksi tidak ditemukan.");
    }
}