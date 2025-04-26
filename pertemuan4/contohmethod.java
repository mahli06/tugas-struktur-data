/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author Asus A409
 */
public class contohmethod {
    public static void main(String[] args) {
        contohmethod lingkaran = new contohmethod();
        lingkaran.luas_lingkaran();
        double hasil_luas = lingkaran.fungsi_luas_lingkaran();
        System.out.println("Hasil Luas Lingkaran dari funsi : " + hasil_luas);
    } 
    
     // berikut adalah contoh method prosedure ciri ciri = awalan void
    public void luas_lingkaran(){
        double jari2 = 24;
        double phi = 3.14;
        double luas = phi*jari2*jari2;
        System.out.println("Hasil Luas Lingkaran dari prosedure: " + luas);
    }
    
    // berikut adalah contoh method fungsi ciri ciri = awalan tipe data dengan ada nilai balik return
    public double fungsi_luas_lingkaran(){
        double jari2 = 24;
        double phi = 3.14;
        double luas = phi*jari2*jari2;
        return luas;
    }

}
