/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchprogram.java;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SearchProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n, cari;
        n = input.nextInt();
        int[] a = new int[n];
        boolean cek = false;
        
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        
        cari = input.nextInt();
        
        for(int i = 0; i < n; i++){
            if(cari == a[i]){
                System.out.println("Nilai ditemukan");
                cek = true;
            }
        }
        if(cek == false){
                System.out.println("Nilai tidak ditemukan"); 
           }
    }   
}
