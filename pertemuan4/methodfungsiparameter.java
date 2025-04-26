/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author Asus A409
 */
public class methodfungsiparameter {
    public static void main(String[] args) {
        methodfungsiparameter mahasiswa = new methodfungsiparameter();
        mahasiswa.simpan_nilai("yanto", 90, 78, 100);
        mahasiswa.simpan_nilai("maridi", 80, 40, 100); 
        
        methodfungsiparameter Kalkulator = new methodfungsiparameter();
        double rata2_yanto = Kalkulator.hitung_rata2("yanto", 90, 78, 100);
        System.out.println("Nilai Rata Rata nya Adalah " + rata2_yanto + "\n");
        
        double rata2_maridi = Kalkulator.hitung_rata2("maridi", 80, 40, 100);
        System.out.println("Nilai Rata Rata nya Adalah " + rata2_maridi + "\n");
        
    }
    
    public void simpan_nilai(String nama, int ipa, int mtk, int struktur_data){
        int[] kumpulan_nilai = {ipa, mtk, struktur_data};
        String[] matkul = {"IPA ", "MTK ", "Struktuk Data "};
        for(int i=0; i<matkul.length; i++){
          System.out.println("Nilai " +  matkul[i] + nama + " : " + kumpulan_nilai[i]);
        }
        System.out.println("\n");
    }
    
    public double hitung_rata2 (String nama, int ipa, int mtk, int struktur_data){
        int[] kumpulan_nilai = {ipa, mtk, struktur_data};
        double jumblah = 0;
        double rata2;
        for(int i = 0; i<kumpulan_nilai.length; i++){
            jumblah += kumpulan_nilai[i];
        }
        rata2 = jumblah/kumpulan_nilai.length;
        System.out.println("Nama : " + nama);;
        return rata2;
    }
    
}
