
import java.util.*;

public class SiakadMain {
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

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa m : mhs) {
                        m.tampilMahasiswa();
                    }
                    break;

                case 2:
                    System.out.println("Daftar Mata Kuliah:");
                    for (MataKuliah m : mk) {
                        m.tampilMataKuliah();
                    }
                    break;

                case 3:
                    System.out.println("Data Penilaian:");
                    for (Penilaian p : penilaian) {
                        p.tampilPenilaian();
                    }
                    break;

                case 4:
                    System.out.println("Data Penilaian (Diurutkan Berdasarkan Nilai Akhir):");

                    for (int i = 0; i < penilaian.length - 1; i++) {
                        for (int j = 0; j < penilaian.length - i - 1; j++) {
                            if (penilaian[j].nilaiAkhir < penilaian[j + 1].nilaiAkhir) {
                                Penilaian temp = penilaian[j];
                                penilaian[j] = penilaian[j + 1];
                                penilaian[j + 1] = temp;
                            }
                        }
                    }

                    for (Penilaian p : penilaian) {
                        p.tampilPenilaian();
                    }
                    break;

                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cariNIM = sc.nextLine();
                    boolean ditemukan = false;
                    for (Mahasiswa m : mhs) {
                        if (m.NIM.equals(cariNIM)) {
                            m.tampilMahasiswa();
                            ditemukan = true;
                        }
                    }
                    if (!ditemukan)
                        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);
        sc.close();
    }
}