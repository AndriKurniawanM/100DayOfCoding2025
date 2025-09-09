import java.util.Date;

public class Day2 {

    public static void main(String[] args) {

        // Soal 1: Menggunakan System.out.println()
        System.out.println("--- SOAL 1 ---");
        System.out.println("Saya akan bertahan selama 100 Hari Ngoding, dan akan menjadi anggota resmi ISC");
        System.out.println(); // Memberi jarak baris baru

        // Soal 2: Menggunakan System.out.print()
        System.out.println("--- SOAL 2 ---");
        System.out.print("Selamat telah menjadi ");
        System.out.print("anggota ISC");
        System.out.println(""); // Memberi 2x baris baru agar rapi

        // Soal 3: Menggunakan System.out.printf()
        System.out.println("--- SOAL 3 ---");

        // Data diri
        String nama = "Andri";
        String nim = "D0224313";
        char kelas = 'B';
        int umur = 20;
        double tinggiBadan = 165.5;
        Date tanggalSekarang = new Date();

        // Mencetak tabel menggunakan printf , pakai |
        System.out.printf("| %-5s : %-18s |%n", "Nama", nama);
        System.out.printf("| %-5s : %-18s |%n", "NIM", nim);
        System.out.printf("| %-5s : %-18c |%n", "Kelas", kelas);
        System.out.printf("| %-5s : %-18d |%n", "Umur", umur);
        System.out.printf("| %-5s : %-18.1f |%n", "TB", tinggiBadan);
        System.out.printf("| %-5s : %-18tF |%n", "Tgl", tanggalSekarang);
    }
}
