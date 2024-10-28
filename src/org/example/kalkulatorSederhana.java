package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 *<p>
 * Kelas <code>KalkulatorSederhana</code> adalah kalkulator sederhana yang dapat melakukan
 * operasi dasar aritmetika seperti penjumlahan, pengurangan, perkalian, dan pembagian.
 * Kelas ini mengimplementasikan antarmuka <code>kalkulatorwawa</code> dan mewarisi kelas
 * <code>Kalkulatorwawok</code>.
 * </p>
 *
 * <p>
 * Pengguna dapat memasukkan dua angka dan memilih operasi aritmetika yang diinginkan.
 * Jika operasi tidak valid atau terdapat pembagian dengan nol, pesan kesalahan akan
 * ditampilkan.
 * </p>

 */
class KalkulatorSederhana extends Kalkulatorwawok implements kalkulatorwawa {
    /**
     * Konstanta <code>ww</code> digunakan sebagai nilai awal untuk hasil kalkulasi.
     */
    public static final int ww = 0;

    /**
     * <p>
     * Metode utama yang menginisialisasi program kalkulator sederhana.
     * Pengguna diminta untuk memasukkan dua angka dan memilih operasi aritmetika.
     * </p>
     * @param args argument perintah(tidak di gunakan)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();
        System.out.println("Pilih operasi: +, -, *, /");
        char operasi = scanner.next().charAt(0);
        KalkulatorSederhana ks = new KalkulatorSederhana();
        double hasil = ww;

        if (operasi == '+') {
            hasil = ks.plus(new terserah(angka1, angka2));
        } else if (operasi == '-') {
            hasil = ks.kurang(angka1, angka2);
        } else if (operasi == '*') {
            hasil = ks.kali(angka1, angka2);
        } else if (operasi == '/') {
            if (angka2 != 0) {
                hasil = ks.bagi(angka1, angka2);
            } else {
                System.out.println("Error: Pembagian dengan nol.");
                return;
            }
        } else {
            System.out.println("Operasi tidak valid.");
            return;
        }

        System.out.println("Hasil: " + hasil);
        System.out.println("rajwaa");
        scanner.close();
    }

    /**
     * <p>
     * Menjumlahkan dua angka yang diwakili oleh objek <code>terserah</code>.
     * </p>
     *
     * @param terserah objek yang berisi dua angka yang akan dijumlahkan
     * @return hasil penjumlahan dari dua angka
     */

    public double plus(terserah terserah) { return terserah.a() + terserah.b(); }

    /**
     * <p>
     * Mengurangi dua angka.
     * </p>
     *
     * @param a angka pertama
     * @param b angka kedua
     * @return hasil pengurangan <code>a - b</code>
     */

    public double kurang(double a, double b) { return a - b; }
    /**
     * <p>
     * Mengalikan dua angka.
     * </p>
     *
     * @param a angka pertama
     * @param b angka kedua
     * @return hasil perkalian <code>a * b</code>
     */

    public double kali(double a, double b) { return a * b; }

    /**
     * <p>
     * Membagi dua angka.
     * </p>
     *
     * @param a angka pertama (pembilang)
     * @param b angka kedua (penyebut)
     * @return hasil pembagian <code>a / b</code>
     * @throws ArithmeticException jika <code>b</code> sama dengan 0
     */
    sout
    public double bagi(double a, double b) { return a/b;}
}
