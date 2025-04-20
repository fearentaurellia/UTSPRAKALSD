public class MainUTS {
    import java.util.*;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] mhs = {
                new Mahasiswa("22001", "Ali Rahman", "Informatika"),
                new Mahasiswa("22002", "Budi Santoso", "Informatika"),
                new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis")
        };

        MataKuliah[] mk = {
                new MataKuliah("MK001", "Struktur Data", 3),
                new MataKuliah("MK002", "Basis Data", 3),
                new MataKuliah("MK003", "Desain Web", 3)
        };

        Penilaian[] penilaian = {
                new Penilaian(mhs[0], mk[0], 80, 85, 90),
                new Penilaian(mhs[0], mk[1], 60, 75, 70),
                new Penilaian(mhs[1], mk[0], 75, 70, 80),
                new Penilaian(mhs[2], mk[1], 85, 90, 95),
                new Penilaian(mhs[2], mk[2], 80, 90, 65)
        };

        int pilihan;
        do {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
}
} 