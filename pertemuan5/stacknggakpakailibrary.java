/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author Asus A409
 */
public class stacknggakpakailibrary {
    private int[] stack;
    private int top;
    private int kapasitas;

    // Constructor
    public stacknggakpakailibrary(int ukuran) {
        kapasitas = ukuran;
        stack = new int[kapasitas];
        top = -1;
    }

    // Menambahkan elemen ke stack (push)
    public void push(int nilai) {
        if (top == kapasitas - 1) {
            System.out.println("Stack penuh. Tidak bisa menambahkan " + nilai);
            return;
        }
        stack[++top] = nilai;
        System.out.println(nilai + " ditambahkan ke stack.");
    }

    // Menghapus elemen teratas dari stack (pop)
    public int pop() {
        if (top == -1) {
            System.out.println("Stack kosong. Tidak ada yang bisa di-pop.");
            return -1;
        }
        int nilai = stack[top--];
        System.out.println(nilai + " di-pop dari stack.");
        return nilai;
    }

    // Melihat elemen teratas tanpa menghapus (peek)
    public int peek() {
        if (top == -1) {
            System.out.println("Stack kosong.");
            return -1;
        }
        return stack[top];
    }

    // Mengecek apakah stack kosong
    public boolean isEmpty() {
        return top == -1;
    }

    // Mengecek apakah stack penuh
    public boolean isFull() {
        return top == kapasitas - 1;
    }

    // Menampilkan isi stack
    public void tampilkanStack() {
        if (isEmpty()) {
            System.out.println("Stack kosong.");
            return;
        }

        System.out.print("Isi stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // Main method untuk uji coba
    public static void main(String[] args) {
        stacknggakpakailibrary stack = new stacknggakpakailibrary(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.tampilkanStack();

        System.out.println("Elemen teratas: " + stack.peek());

        stack.pop();
        stack.tampilkanStack();
    }

}
