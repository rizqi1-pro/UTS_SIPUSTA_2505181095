import model.*;
import layanan.*;
import eksepsi.*;

public class Main {
    public static void main(String[] args) {
        KatalogPerpustakaan katalog = new KatalogPerpustakaan();

        // 6 Data Uji Wajib
        katalog.tambahKoleksi(new BukuCetak("BK-001", "Java How to Program", 2022, 620, "rak A-12", false));
        katalog.tambahKoleksi(new BukuCetak("BK-002", "Basis Data Relasional", 2021, 410, "rak B-04", true));
        katalog.tambahKoleksi(new Majalah("MJ-001", "Info Teknologi Edisi 88", 2026, 88, "Agustus", "rak B-04", true));
        katalog.tambahKoleksi(new Majalah("MJ-002", "Info Teknologi Edisi 87", 2026, 87, "Juli", "rak B-04", false));
        katalog.tambahKoleksi(new BerkasDigital("BD-001", "Panduan Pemrograman Java", 2024, 15, "unduh.polmed.ac.id/bd001"));
        katalog.tambahKoleksi(new BerkasDigital("BD-002", "Jurnal Rekayasa Perangkat", 2025, 8, "unduh.polmed.ac.id/bd002"));

        System.out.println("=== STATUS awal KATALOG ===");
        katalog.cetakStatus();

        System.out.println("\n=== SETELAH DIURUTKAN (LAYAK -> JUDUL) ===");
        katalog.urut(new UrutLayakLaluJudul());
        katalog.cetakStatus();

        System.out.println("\n=== UJI EKSEPSI ===");
        try {
            katalog.pinjam("BK-002"); // Akan melempar KoleksiTidakLayakException
        } catch (PustakaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n=== EKSPOR BERKAS ===");
        EksporKatalog.ekspor("katalog.txt", katalog.getDaftar());
    }
}