/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ilham_project;

import java.util.Scanner;

/**
 *
 * @author user
 */

public class KasKelas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM KAS KELAS ===");
        System.out.print("Masukkan jumlah siswa: ");
        int n = input.nextInt();

        // Array untuk menyimpan data
        String[] nama = new String[n];
        int[] iuran = new int[n];

        // Input data siswa dan iuran
        for (int i = 0; i < n; i++) {
            System.out.println("\nSiswa ke-" + (i+1));
            System.out.print("Nama siswa : ");
            nama[i] = input.next();
            System.out.print("Iuran kas  : ");
            iuran[i] = input.nextInt();
        }

        // Hitung total kas & cari yang bayar paling banyak
        int total = 0;
        int max = iuran[0];
        String namaMax = nama[0];

        for (int i = 0; i < n; i++) {
            total += iuran[i];
            if (iuran[i] > max) {
                max = iuran[i];
                namaMax = nama[i];
            }
        }

        double rata = (double) total / n;

        // Tampilkan hasil
        System.out.println("\n=== DATA KAS KELAS ===");
        for (int i = 0; i < n; i++) {
            System.out.println(nama[i] + " membayar Rp " + iuran[i]);
        }

        System.out.println("-------------------------");
        System.out.println("Total kas    : Rp " + total);
        System.out.println("Rata-rata    : Rp " + rata);
        System.out.println("Pembayaran tertinggi : " + namaMax + " (Rp " + max + ")");

        // Percabangan tambahan (contoh)
        if (total >= 500000) {
            System.out.println("Kas kelas sudah cukup untuk kegiatan bersama!");
        } else {
            System.out.println("Kas kelas masih kurang, ayo semangat menabung!");
        }

        input.close();
    }
}
    
