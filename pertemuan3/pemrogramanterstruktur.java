/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author Asus A409 
 */

import java.util.Scanner;
public class pemrogramanterstruktur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = input.nextDouble();

        double luas = Math.PI * r * r;

        System.out.printf("Luas lingkaran adalah: %.2f\n", luas);
    }
}
