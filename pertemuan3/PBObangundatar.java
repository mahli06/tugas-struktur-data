/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author Asus A409 
 */

public class PBObangundatar {
    String nama;
    double panjang;
    double lebar;

    public PBObangundatar(String nama, double panjang, double lebar) {
        this.nama = nama;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public void tampilkanInfo() {
        System.out.println("Bangun Datar: " + nama);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }

    public static void main(String[] args) {
        PBObangundatar persegiPanjang = new PBObangundatar("Persegi Panjang", 5, 3);
        persegiPanjang.tampilkanInfo();
    }
}
