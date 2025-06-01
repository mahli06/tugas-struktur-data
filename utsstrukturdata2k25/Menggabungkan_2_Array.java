/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsstrukturdata2k25;

/**
 *
 * @author Asus A409
 */
import java.util.Arrays; // Tambahkan ini

public class Menggabungkan_2_Array {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        
        int[] combined = new int[array1.length + array2.length];
        
        // Menyalin array pertama ke array gabungan
        System.arraycopy(array1, 0, combined, 0, array1.length);
        
        // Menyalin array kedua ke array gabungan setelah array pertama
        System.arraycopy(array2, 0, combined, array1.length, array2.length);
        
        // Mencetak hasil penggabungan
        System.out.println(Arrays.toString(combined));
    }
}
