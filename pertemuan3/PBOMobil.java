/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author Asus A409
 */

public class PBOMobil {
    String merk;
    String warna;
    int kecepatan;

    public PBOMobil(String merk, String warna, int kecepatan) {
        this.merk = merk;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    public void nyalakanMesin() {
        System.out.println("Mesin mobil " + merk + " dinyalakan.");
    }

    public void tampilkanInfo() {
        System.out.println("Mobil Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan Maksimal: " + kecepatan + " km/h");
    }

    public static void main(String[] args) {
        PBOMobil mobil = new PBOMobil("Toyota", "Hitam", 180);
        mobil.nyalakanMesin();
        mobil.tampilkanInfo();
    }
}
