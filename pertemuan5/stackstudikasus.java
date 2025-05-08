/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author Asus A409
 */
import java.util.Stack;
import java.util.Scanner;

public class stackstudikasus {
    private Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();
    private String currentPage = "Home";

    public void openPage(String url) {
        backStack.push(currentPage);
        currentPage = url;
        forwardStack.clear(); // reset forward stack saat membuka halaman baru
        System.out.println("Membuka: " + currentPage);
    }

    public void goBack() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Kembali ke: " + currentPage);
        } else {
            System.out.println("Tidak ada halaman sebelumnya.");
        }
    }

    public void goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Maju ke: " + currentPage);
        } else {
            System.out.println("Tidak ada halaman setelahnya.");
        }
    }

    public void tampilkanStatus() {
        System.out.println("\nHalaman saat ini: " + currentPage);
        System.out.println("Back Stack: " + backStack);
        System.out.println("Forward Stack: " + forwardStack);
    }

    public static void main(String[] args) {
        stackstudikasus browser = new stackstudikasus();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Simulasi Browser (Home page dimulai).");
        System.out.println("Perintah: buka [url], back, forward, exit");

        while (true) {
            System.out.print("\n> ");
            input = scanner.nextLine();

            if (input.startsWith("buka ")) {
                String url = input.substring(5);
                browser.openPage(url);
            } else if (input.equals("back")) {
                browser.goBack();
            } else if (input.equals("forward")) {
                browser.goForward();
            } else if (input.equals("exit")) {
                System.out.println("Keluar dari browser.");
                break;
            } else {
                System.out.println("Perintah tidak dikenal.");
            }

            browser.tampilkanStatus();
        }

        scanner.close();
    }
    
}
