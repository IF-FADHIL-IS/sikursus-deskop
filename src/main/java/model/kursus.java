/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author USER
 */
public class kursus {
    
    // State atau atribut
    private String kode;
    private String nama;
    private String level;
    private double biaya;

    // Constructor kosong
    public kursus() {
    }

    // Constructor lengkap
    public kursus(String kode, String nama,
                  String level, double biaya) {
        this.kode = kode;
        this.nama = nama;
        this.level = level;
        this.biaya = biaya;
    }

    // Getter
    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public String getLevel() {
        return level;
    }

    public double getBiaya() {
        return biaya;
    }

    // Menghitung diskon
    public double hitungDiskon() {
        if (biaya >= 750000) {
            return biaya * 0.15;
        } else {
            return biaya * 0.05;
        }
    }

    // Menghitung total biaya
    public double hitungTotal(double registrasi) {
        return biaya - hitungDiskon() + registrasi;
    }
}
