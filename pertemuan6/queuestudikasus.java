/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author Asus A409
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queuestudikasus {
    public static void main(String[] args) {
        Queue<String> antrian = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("=== Simulasi Antrian Bank ===");
        System.out.println("Perintah: tambah [nama], layani, lihat, exit");

        while (true) {
            System.out.print("\n> ");
            input = scanner.nextLine();

            if (input.startsWith("tambah ")) {
                String nama = input.substring(7).trim();
                antrian.offer(nama);
                System.out.println(nama + " masuk ke dalam antrian.");
            } else if (input.equals("layani")) {
                if (antrian.isEmpty()) {
                    System.out.println("Tidak ada nasabah dalam antrian.");
                } else {
                    String nama = antrian.poll();
                    System.out.println("Melayani nasabah: " + nama);
                }
            } else if (input.equals("lihat")) {
                if (antrian.isEmpty()) {
                    System.out.println("Antrian kosong.");
                } else {
                    System.out.println("Nasabah dalam antrian: " + antrian);
                }
            } else if (input.equals("exit")) {
                System.out.println("Keluar dari sistem antrian.");
                break;
            } else {
                System.out.println("Perintah tidak dikenal.");
            }
        }

        scanner.close();
    }
 
}
