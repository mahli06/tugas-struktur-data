/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author Asus A409
 */
import java.util.LinkedList;
import java.util.Queue;

public class queuedenganlibrary {
    public static void main(String[] args) {
        // Membuat Queue menggunakan LinkedList
        Queue<String> antrian = new LinkedList<>();

        // Menambahkan elemen ke antrian (enqueue)
        antrian.offer("A");
        antrian.offer("B");
        antrian.offer("C");

        System.out.println("Isi antrian: " + antrian);

        // Melihat elemen paling depan (peek)
        System.out.println("Elemen di depan: " + antrian.peek());

        // Menghapus elemen dari antrian (dequeue)
        System.out.println("Mengambil dari antrian: " + antrian.poll());
        System.out.println("Isi antrian setelah poll: " + antrian);

        // Cek apakah antrian kosong
        System.out.println("Apakah antrian kosong? " + antrian.isEmpty());
    }
  
}
