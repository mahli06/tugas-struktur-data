/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author Asus A409
 */
public class StackSederhana {
    private String[] stack;
    private int ukuran;
    private int top;

    // Inisialisasi stack dengan ukuran tertentu
    void inisialisasiUkuranStack(int ukuran) {
        this.ukuran = ukuran;
        stack = new String[ukuran];
        top = 0;
    }

    // Mengecek apakah stack kosong
    boolean isKosong() {
        return top == 0;
    }

    // Mengecek apakah stack penuh
    boolean isPenuh() {
        return top == ukuran;
    }

    // Menambahkan data ke stack
    void push(String data) {
        if (isPenuh()) {
            System.out.println("Maaf, data tidak bisa ditambahkan karena stack sudah penuh.");
        } else {
            stack[top] = data;
            top++;
            System.out.println("Data \"" + data + "\" berhasil ditambahkan ke dalam stack.");
        }
    }

    // Menghapus data paling atas dari stack (pop)
    void pop() {
        if (isKosong()) {
            System.out.println("Stack kosong, tidak ada data yang bisa dikeluarkan.");
        } else {
            top--;
            String data = stack[top];
            stack[top] = null; // Bersihkan referensi
            System.out.println("Data \"" + data + "\" telah dikeluarkan dari stack.");
        }
    }

    // Melihat data paling atas dari stack tanpa menghapus (peek)
    void peek() {
        if (isKosong()) {
            System.out.println("Stack kosong.");
        } else {
            System.out.println("Data paling atas di stack adalah: \"" + stack[top - 1] + "\"");
        }
    }

    // Mencari data dalam stack
    void cari(String data) {
        boolean ditemukan = false;
        int posisi = -1;

        for (int i = 0; i < top; i++) {
            if (data.equals(stack[i])) {
                ditemukan = true;
                posisi = i;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Data \"" + data + "\" ditemukan pada posisi ke-" + (posisi + 1));
        } else {
            System.out.println("Data \"" + data + "\" tidak ditemukan dalam stack.");
        }
    }

    // Menampilkan semua isi stack dari atas ke bawah
    void tampilkan() {
        System.out.println("============== Isi Stack ==============");
        if (isKosong()) {
            System.out.println("(Stack kosong)");
        } else {
            for (int i = top - 1; i >= 0; i--) {
                System.out.println("- " + stack[i]);
            }
        }
        System.out.println("========================================\n");
    }

    // Program utama
    public static void main(String[] args) {
        StackSederhana stack = new StackSederhana();

        // Inisialisasi stack
        stack.inisialisasiUkuranStack(6);

        // Tambah data
        stack.push("Telenan");
        stack.push("Pisau");
        stack.push("Wajan");
        stack.push("Sotel");
        stack.push("Piring");
        stack.push("Mangkok");

        // Tes stack penuh
        stack.push("Pisau");

        // Keluarkan satu data
        stack.pop();

        // Tampilkan isi stack
        stack.tampilkan();

        // Cari data
        stack.cari("Piring");
        stack.cari("Pisau");
    }

}
