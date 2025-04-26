/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author Asus A409
 */
public class methodprosedure {
    public static void main(String[] args) {
        methodprosedure rata_rata = new methodprosedure();
        rata_rata.rata_rata();
    }
    
    // prosedure meng hitutung rata rata
    public void rata_rata (){
        int ipa = 69;
        int mtk = 90;
        int jawa = 80;
        
        int[] semua_nilai = {ipa, mtk, jawa};
        double jumlah = 0;
        double rata2;
        for(int i = 0; i<semua_nilai.length; i++){
            jumlah += semua_nilai[i];
        }
        rata2 = jumlah/semua_nilai.length;
        System.out.println("Rata Rata Nilai = " + rata2);
    }
    
}
