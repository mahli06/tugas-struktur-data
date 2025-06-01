/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsstrukturdata2k25;

/**
 *
 * @author Asus A409
 */
public class Mengecek_Matriks_Identitas {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        boolean isIdentity = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0)) {
                    isIdentity = false;
                    break;
                }
            }
        }
        System.out.println("Matriks identitas: " + isIdentity);
    }
}
