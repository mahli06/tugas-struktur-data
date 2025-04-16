/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus A409
 */
public class Array {
    public static void main(String[] args) {  
        int[][] nilai = {
            {85, 90, 50}, 
            {78, 88, 40},
            {92, 95, 31}  
        };
        
        String[]matkul ={"MTK", "IPA", "PKN"};
        for(int siswa = 0; siswa<nilai.length; siswa++){
            System.out.println("Siswa ke 0" + (siswa+1) + ": ");
            for(int i= 0; i<nilai[siswa].length; i++){
                System.out.println("  " + matkul[i] + ": " + nilai[siswa][i]);
            }
            
        }
    }
}
