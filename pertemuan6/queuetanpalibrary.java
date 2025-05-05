/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author Asus A409
 */
public class queuetanpalibrary {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Konstruktor
    public queuetanpalibrary(int kapasitas) {
        capacity = kapasitas;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Menambahkan elemen ke antrian (enqueue)
    public void enqueue(int nilai) {
        if (isFull()) {
            System.out.println("Antrian penuh. Tidak bisa menambahkan " + nilai);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = nilai;
        size++;
        System.out.println(nilai + " ditambahkan ke antrian.");
    }

    // Menghapus elemen dari depan antrian (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak bisa dequeue.");
            return -1;
        }
        int nilai = queue[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println(nilai + " dikeluarkan dari antrian.");
        return nilai;
    }

    // Melihat elemen paling depan tanpa menghapus
    public int peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return -1;
        }
        return queue[front];
    }

    // Mengecek apakah antrian kosong
    public boolean isEmpty() {
        return size == 0;
    }

    // Mengecek apakah antrian penuh
    public boolean isFull() {
        return size == capacity;
    }

    // Menampilkan isi antrian
    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.print("Isi antrian: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

    // Main untuk uji coba
    public static void main(String[] args) {
        queuetanpalibrary antrian = new queuetanpalibrary(5);

        antrian.enqueue(10);
        antrian.enqueue(20);
        antrian.enqueue(30);
        antrian.tampilkanAntrian();

        antrian.dequeue();
        antrian.tampilkanAntrian();

        System.out.println("Elemen depan sekarang: " + antrian.peek());
    }
  
}
