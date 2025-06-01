/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsstrukturdata2k25;

/**
 *
 * @author Asus A409
 */
public class Membalik_Elemen_Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        // Cetak elemen dari belakang (dibalik)
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}