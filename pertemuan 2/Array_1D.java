/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus A409
 */
public class Array_1D {
    public static void main(String[] args) {
        String[] barang = {"Iidomie Seblak", "Indomie Korean Spaicy", "Indomie Goreng", "Indomie Pecel", "Indomie Sate", "Indomie Kare Bebek"};
        System.out.println("Daftar produk toko : ");
        for(int i = 0; i<barang.length; i++){
            System.out.println((i+1) + ". " + barang[i]);
        }
    }
}

