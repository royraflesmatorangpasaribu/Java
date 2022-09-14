/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4roy;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Praktikum4Roy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int[] number = {1,3,5,7,9};
        //int[] number = {1,3,5,7}; 
        /*
        run:
        1
        3
        5
        7
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
	at praktikum4roy.Praktikum4Roy.main(Praktikum4Roy.java:22)
        Akan muncul error ArrayIndexOutOfBounds. Hal ini terjadi karena anda
        mencoba mengakses index diluar ukuran array.
        */
        
//        for(int i = 0; i < 5; i++){
//            System.out.println(number[i]);
//        }
        
        //cara mengatasi eror rubah batasnya
        
//        for(int i = 0; i < number.length; i++){
//            System.out.println(number[i]);
//        }
        
        //pada java bisa juga menggunakan for each untuk mengakses elemen array
        
//        for(int num:number){
//        System.out.println(num);
//        }
        
        //System.out.println(number);
        
        //membuat array dari input user
        /*
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[3];
        
        System.out.println("Nilai Matematika : ");
        nilai[0] = input.nextInt();
        System.out.println("Nilai Logika : ");
        nilai[1] = input.nextInt();
        System.out.println("Nilai Bahasa : ");
        nilai[2] = input.nextInt();
        
        System.out.println("Nilai Anda : ");
        for(int print:nilai){
            System.out.println(print + " ");
        }
        */
        
        //manipulasi elemen array
        /*
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[3];
        
        System.out.println("Nilai Matematika : ");
        nilai[0] = input.nextInt();
        System.out.println("Nilai Logika : ");
        nilai[1] = input.nextInt();
        System.out.println("Nilai Bahasa : ");
        nilai[2] = input.nextInt();
        
        System.out.println("Nilai Anda : ");
        for(int print:nilai){
            System.out.println(print + " ");
        }    
        //manipulasi
        nilai[1] = 86;
        System.out.println("Merubah nilai Indeks 1 ");
        for(int print:nilai){
            System.out.println(print + " ");
        } 
        */
        
       //Array Multidimensi
       int[][] nilai = {{90, 75, 80}, {80, 90, 80}, {70, 75, 95}};
       
       //cetak isi array menggunakan for each
       for(int[] i : nilai){
           for(int j : i){
               System.out.println(j);
           }
       }
       nilai[0][1] = 70;
       
        System.out.println("Nilai Setelah Di Manipulasi pada indeks 0, nilai pada indek 1");
        for(int[] i : nilai){
           for(int j : i){
               System.out.println(j);
           }
        }
        
    }
    
}
