package layanan;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import model.Koleksi;

public class EksporKatalog {
    public static void ekspor(String namaFile, List<Koleksi> daftar) {
        // Penutupan otomatis try-with-resources (M7)
        try (PrintWriter pw = new PrintWriter(new FileWriter(namaFile))) {
            for (Koleksi k : daftar) {
                pw.println(k.deskripsi());
            }
            System.out.println("File berhasil diekspor ke " + namaFile);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan berkas: " + e.getMessage());
        }
    }
}