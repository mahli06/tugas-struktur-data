/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus A409
 */
public class perulangan_FOR {
    static int copys = 5; // VARIABEL UNTUK JUMBLAH KOPY
    static String text = "Haii, Semoga Success Selalu!! ";
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {;
       System.out.println("Text = " + text + " Akan Di copy sebanyak = " + copys);
       for(int i = 0; i<copys; i++){
           System.out.println((i+1) + "." + text);
       }
    }
}
