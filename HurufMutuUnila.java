/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hurufmutuunila;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class HurufMutuUnila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       for(int i=0; true; i++){
           System.out.print("Masukkan nilai : ");
           int nilai = input.nextInt();
           String huruf_mutu;
           
           if(nilai>=76){
              huruf_mutu = "A";
              //System.out.println("A");
           }
           else if(nilai >= 71){
               huruf_mutu = "B+";
              //System.out.println("B+");
           }
           else if(nilai >= 66){
               huruf_mutu = "B";
           }
           else if(nilai >= 61){
               huruf_mutu = "C+";
           }
           else if(nilai >= 56){
               huruf_mutu = "C";
           }
           else if(nilai >= 50){
               huruf_mutu = "D";
           }
           else{
               huruf_mutu = "E";
           }
           
           switch(huruf_mutu){
            case "A":
                System.out.println("Lulus! Huruf Mutu A");
                break;
            case "B+":
                System.out.println("Lulus! Huruf Mutu B+");
                break;
            case "B":
                System.out.println("Lulus! Huruf Mutu B");
                break;
            case "C+":
                System.out.println("Lulus! Huruf Mutu C+");
                break;
            case "C":
                System.out.println("Lulus! Huruf Mutu C");
                break;
            case "D":
                System.out.println("Lulus Bersyarat*! Huruf Mutu D");
                break;
            case "E":
                System.out.println("Tidak Lulus! Huruf Mutu E");
                break;
            default:
                System.out.println("Huruf Mutu tidak sesuai");
           }
       }
           
    }
    
    
}
