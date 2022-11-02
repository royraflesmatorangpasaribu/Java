/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum10_roy;

/**
 *
 * @author Praktikan
 */
public class Praktikum10_Roy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunDatar bd = new BangunDatar("Hitam");
        System.out.println("Warna bangun datar: " + bd.getWarna());
        System.out.println();
        
//        Lingkaran lingkaran = new Lingkaran("Merah", 26.0);
//        System.out.println("Warna bangun datar: " + lingkaran.getWarna());
//        System.out.println("Luas Lingkaran: " + lingkaran.luas());
//        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());
//        System.out.println();
//        
//        SegiTiga segiTiga = new SegiTiga("Kuning", 15, 7);
//        System.out.println("Warna bangun datar: " + segiTiga.getWarna());
//        System.out.println("Luas Segi Tiga: " + segiTiga.luas());
//        System.out.println("Keliling Segi Tiga: " + segiTiga.keliling());
//        System.out.println();
//        
//        SegiEmpat segiEmpat = new SegiEmpat("Hijau", 10);
//        System.out.println("Warna bangun datar: " + segiEmpat.getWarna());
//        System.out.println("Luas Segi Empat: " + segiEmpat.luas());
//        System.out.println("Keliling Segi Empat: " + segiEmpat.keliling());
//        System.out.println();
        
        //Polymorphism
        BangunDatar lingkaran = new Lingkaran("Merah", 26.0);
        System.out.println("Warna bangun datar: " + lingkaran.getWarna());
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());
        System.out.println();
        
        BangunDatar segiTiga = new SegiTiga("Kuning", 15, 7);
        System.out.println("Warna bangun datar: " + segiTiga.getWarna());
        System.out.println("Luas Segi Tiga: " + segiTiga.luas());
        System.out.println("Keliling Segi Tiga: " + segiTiga.keliling());
        System.out.println();
        
        BangunDatar segiEmpat = new SegiEmpat("Hijau", 10);
        System.out.println("Warna bangun datar: " + segiEmpat.getWarna());
        System.out.println("Luas Segi Empat: " + segiEmpat.luas());
        System.out.println("Keliling Segi Empat: " + segiEmpat.keliling());
        System.out.println();
    }
    
}
