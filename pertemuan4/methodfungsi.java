/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author Asus A409
 */
public class methodfungsi {
    public static void main(String[] args) {
        methodfungsi rata_rata = new methodfungsi();
        double nilai = rata_rata.rata_rata();
        System.out.println("Rata Rata Nilai dari fungsi = " + nilai);
    }
    
    // fungsi untuk menghitung nilai rata rata 
    public double rata_rata(){   
        int ipa = 100;
        int mtk = 95;
        int jawa = 98;
        
        int[] semua_nilai = {ipa, mtk, jawa};
        double jumblah = 0;
        double rata2;
        for(int i = 0; i<semua_nilai.length; i++){
            jumblah += semua_nilai[i];
        }
        rata2 = jumblah/semua_nilai.length;
        return rata2;
    }
    
}
