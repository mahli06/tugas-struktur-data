/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author Asus A409
 */
public class Insertion_Shorting {
    public static void main(String[] args) {
        int[] arr = {22, 11, 99, 88, 9, 7, 42};

        // Panggil metode insertion sort
        sort(arr);

        // Cetak hasil pengurutan
        System.out.print("Hasil pengurutan: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Geser elemen yang lebih besar dari key ke satu posisi ke kanan
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
