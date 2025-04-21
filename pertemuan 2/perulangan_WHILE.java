/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertumuan2;

/**
 *
 * @author x260
 */
import java.util.Random;

public class perulangan_WHILE {
    static int gaca =0;
    static int hasil;
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       
        System.out.println("Undian Kupon Gratis......");
        String[] kupon = {"Diskon 50 %", "2. zoonk", "3. zoonk", "Makan Gratis", "4. zoonk", "5. zoonk", "Minum Gratis"};
        Random rand = new Random();
        while(gaca <= 50){
            hasil = rand.nextInt(7);
            System.out.println("Gaca Kupon Anda : " + kupon[hasil]);
            gaca++;
        }
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Anda dapat  kupon : " + kupon[hasil]);
        System.out.println("-----------------------------------------------------------------------------------");
    }
}
