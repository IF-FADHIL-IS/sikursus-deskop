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
public class latihanBidangDatar {
    public static void main(String[] args) {

        // variabel
        double panjang = 600;
        double lebar = 600;

        // menghitung luas
        double luas = panjang * lebar;

        // menghitung keliling
        double keliling = 2 * (panjang + lebar);

        // menampilkan hasil
        System.out.println("=== PERSEGI PANJANG ===");
        System.out.println("Panjang  : " + panjang + " cm");
        System.out.println("Lebar    : " + lebar + " cm");
        System.out.println("Luas     : " + luas + " cm2");
        System.out.println("Keliling : " + keliling + " cm");
    }    
}
