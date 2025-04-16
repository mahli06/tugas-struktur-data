/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus A409
 */
public class Percabangan_SWICT_CASE {
    public static void main(String[] args) {        
        
        char menu = '2';
        System.out.println("Menu Makanan : ");
        System.out.println("1. Bebek Goreng");
        System.out.println("2. Soto Bebek");
        System.out.println("3. Bebek Tulang Lunak");
        System.out.println("4. Bebek Bakar");
        System.out.println("terimakasih snda memilih menu no : " + menu);
        
        switch(menu){
            case '1':
            System.out.println("Pilihan Anda : " + menu + ". Bebek Goreng (Rp.15.000)");
            break;
            case '2':
            System.out.println("Pilihan Anda : " + menu + ". Soto Bebek (Rp.13.000)");
            break;
            case '3':
            System.out.println("Pilihan Anda : " + menu + ". Bebek Tulang Lunak (Rp.20.000)");
            break;
            case '4':
            System.out.println("Pilihan Anda : " + menu + ". Bebek Bakar (Rp.25.000)");
            break;
        }
    }
}

