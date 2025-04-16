/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus A409
 */
public class perulangan_DO_WHILE {
    static int copys = 5; // VARIABEL UNTUK JUMBLAH KOPY
    static int counter = 0;
    static String text = "Perulangan do while";
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       System.out.println("Text = " + text + " Akan Di copy sebanyak = " + copys);
       do{
            counter++;
            System.out.println((counter) + "." + text);
       }while(counter < copys);
    }
}
