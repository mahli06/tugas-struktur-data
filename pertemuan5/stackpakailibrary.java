/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author Asus A409
 */
import java.util.Stack;

public class stackpakailibrary {
    public static void main(String[] args) {
        // Membuat objek Stack
        Stack<Integer> stack = new Stack<>();

        // Menambahkan elemen ke stack (push)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Isi stack: " + stack);

        // Mengambil elemen teratas tanpa menghapus (peek)
        System.out.println("Elemen teratas (peek): " + stack.peek());

        // Menghapus elemen teratas (pop)
        int removed = stack.pop();
        System.out.println("Elemen yang di-pop: " + removed);

        System.out.println("Isi stack setelah pop: " + stack);

        // Cek apakah stack kosong
        System.out.println("Apakah stack kosong? " + stack.isEmpty());
    }

}
