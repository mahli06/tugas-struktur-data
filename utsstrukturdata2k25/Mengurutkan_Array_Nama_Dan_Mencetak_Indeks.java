/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsstrukturdata2k25;

/**
 *
 * @author Asus A409
 */
import java.util.Arrays;

public class Mengurutkan_Array_Nama_Dan_Mencetak_Indeks {
    public static void main(String[] args) {
        String[] names = {"Luffy", "Zoro", "Ussop", "Nami"};
        String[] sortedNames = names.clone();
        Arrays.sort(sortedNames);
        for (String name : sortedNames) {
            for (int i = 0; i < names.length; i++) {
                if (names[i].equals(name)) {
                    System.out.println(name + " awalnya di indeks ke-" + i);
                    break;
                }
            }
        }
    }
}
