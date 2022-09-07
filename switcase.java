/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3pboroy;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Praktikum3PboRoy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nilai : ");
        int nilai = input.nextInt();
        char huruf_mutu;
        
        if(nilai >= 76){
            huruf_mutu = 'A';
        }
        else if(nilai >=71){
            huruf_mutu = 'B';
        }
        else if(nilai >=66){
            huruf_mutu = 'C';
        }
        else{
            huruf_mutu = 'D';
        }
        
        switch(huruf_mutu){
            case 'A':
                System.out.println("Sangat Baik");
                break;
            case 'B':
                System.out.println("Baik");
                break;
            case 'C':
                System.out.println("Cukup");
                break;
            case 'D':
                System.out.println("Kurang");
                break;
            default:
                System.out.println("Huruf Mutu tidak sesuai");
        }
    }
    
}
