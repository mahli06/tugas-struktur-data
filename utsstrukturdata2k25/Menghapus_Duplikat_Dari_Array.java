/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsstrukturdata2k25;

/**
 *
 * @author Asus A409
 */
import java.util.LinkedHashSet;
import java.util.Set;

public class Menghapus_Duplikat_Dari_Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> set = new LinkedHashSet<>();
        for (int i : array) {
            set.add(i);
        }
        System.out.println(set);
    }
}
