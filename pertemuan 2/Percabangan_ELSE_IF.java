/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus A409
 */
public class Percabangan_ELSE_IF {
    public static void main(String[] args) {
//        Contoh Percabangan dengan IF dan ELSE UNTUK CONVERSI NILAI MAHASISWA
        int nilaimahasiswa = 40;
        char nilai_conversi;
        
        if(nilaimahasiswa >= 90){
            nilai_conversi = 'A';
        }else if(nilaimahasiswa >= 80){
            nilai_conversi = 'B';
        }else if(nilaimahasiswa >= 70){
            nilai_conversi = 'C';
        }else if(nilaimahasiswa >= 60){
            nilai_conversi = 'D';
        }else{
            nilai_conversi = 'F';
        }
        
        System.out.println("Nilai anda adalah " + nilaimahasiswa);
        System.out.println("Grade anda adalah " +  nilai_conversi);
    }
}

