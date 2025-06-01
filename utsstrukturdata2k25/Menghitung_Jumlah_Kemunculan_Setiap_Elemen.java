/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsstrukturdata2k25;

/**
 *
 * @author Asus A409
 */
import java.util.HashMap;

public class Menghitung_Jumlah_Kemunculan_Setiap_Elemen {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 2, 4, 1};
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int key : countMap.keySet()) {
            System.out.println(key + ": " + countMap.get(key));
        }
    }
}
