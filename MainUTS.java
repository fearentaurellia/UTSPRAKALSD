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
}
} 