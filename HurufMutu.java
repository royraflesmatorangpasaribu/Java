/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum3roy;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TugasPraktikum3Roy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        char ulg;
        do{
            System.out.print("Masukkan Nilai : ");
            int nilai=input.nextInt();
            String huruf_mutu;
            
            if(nilai < 0 || nilai > 100){
                System.out.println("Input Tidak Sesuai");
                break;
            }
            
            if(nilai >= 76){
                huruf_mutu = "A";
            }
            else if(nilai >= 71 && nilai < 76){
                huruf_mutu = "B+";
            }
            else if(nilai >= 66 && nilai < 71){
                huruf_mutu = "B";
            }
            else if(nilai >=61 && nilai < 66){
                huruf_mutu = "C+";
            }
            else if(nilai >= 56 && nilai < 61){
                huruf_mutu = "C";
            }
            else if(nilai >= 50 && nilai < 56){
                huruf_mutu = "D";
            }
            else{
                huruf_mutu = "E";
            }
            
            System.out.println("Huruf Mutu Anda : "+huruf_mutu);
            
            switch(huruf_mutu){
                case "A":
                    System.out.println("Lulus! Dengan Predikat Sangat Baik");
                    break;
                case "B+":
                    System.out.println("Lulus! Dengan Predikat Baik");
                    break;
                case "B":
                    System.out.println("Lulus! Dengan Predikat Cukup Baik");
                    break;
                case "C+":
                    System.out.println("Lulus! Dengan Predikat Cukup");
                    break;
                case "C":
                    System.out.println("Lulus! Dengan Predikat Sedang");
                    break;
                case "D":
                    System.out.println("Lulus Bersyarat*! Dengan Predikat Sangat Kurang");
                    break;
                case "E":
                    System.out.println("Tidak Lulus! Dengan Predikat Gagal");
                    break;
                default:
                    System.out.println("Huruf Mutu tidak sesuai");    
            }
            
            System.out.println("Apakah Anda Ingin Mengulang(y/t)?");
            ulg = input.next().charAt(0);
            ulg = Character.toLowerCase(ulg);
        }
        while(ulg!= 't');
        System.out.println("Program Selesai");
    }
    
}
