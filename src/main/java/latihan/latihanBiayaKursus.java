/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author USER
 */
public class latihanBiayaKursus {
    public static void main(String[] args) {

        // variabel
        String kode = "JAVA-BSC";
        String nama = "Java Desktop Fundamental";

        double biaya = 2_252_000;
        double registrasi = 500_000;
        double diskon;

        boolean aktif = true;

        // menentukan diskon
        if (biaya >= 750_000) {
            diskon = 0.15;
        } else {
            diskon = 0.05;
        }

        double potongan = biaya * diskon;
        double total = biaya - potongan + registrasi;

        // menentukan status
        String status;

        if (total > 780_000) {
            status = "MAHAL";
        } else {
            status = "TERJANGKAU";
        }

        System.out.println("Kode       : " + kode);
        System.out.println("Kursus     : " + nama);
        System.out.println("Aktif      : " + aktif);
        System.out.printf("Biaya      : Rp%,.0f%n", biaya);
        System.out.printf("Diskon     : Rp%,.0f%n", potongan);
        System.out.printf("Registrasi : Rp%,.0f%n", registrasi);
        System.out.printf("Total      : Rp%,.0f%n", total);
        System.out.println("Status     : " + status);
    }
}
