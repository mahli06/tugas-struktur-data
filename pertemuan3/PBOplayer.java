/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author Asus A409 
 */

public class PBOplayer {
    String nama;
    int level;
    int hp;

    public PBOplayer(String nama, int level, int hp) {
        this.nama = nama;
        this.level = level;
        this.hp = hp;
    }

    public void serang() {
        System.out.println(nama + " menyerang musuh!");
    }

    public void tampilkanStatus() {
        System.out.println("Nama Player: " + nama);
        System.out.println("Level: " + level);
        System.out.println("HP: " + hp);
    }

    public static void main(String[] args) {
        PBOplayer player = new PBOplayer("Tejo", 10, 100);
        player.serang();
        player.tampilkanStatus();
    }
}
