/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author Asus A409
 */
public class methodprosedureparameter {
    public static void main(String[] args) {
        methodprosedureparameter mahasiswa = new methodprosedureparameter();
        mahasiswa.simpan_nilai("yanto", 90, 80, 100);
        mahasiswa.simpan_nilai("maridi", 89, 90, 100);
        mahasiswa.simpan_nilai("painem", 96, 50, 100);
    }
    
    public void simpan_nilai(String nama, int ipa, int mtk, int struktur_data){
        int[] kumpulan_nilai = {ipa, mtk, struktur_data};
        String[] matkul = {"IPA ", "MTK ", "Struktuk Data "};
        for(int i=0; i<matkul.length; i++){
          System.out.println("Nilai " +  matkul[i] + nama + " : " + kumpulan_nilai[i]);
        }
        System.out.println("\n");
    }
    
}
