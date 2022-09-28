/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6roy;

/**
 *
 * @author Praktikan
 */
public class Praktikum6Roy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa();
        //contructure biasanya sama dengan nama class ditambah ()
        mhs.nama = "Roy Rafles Matorang Pasaribu";
        mhs.npm = "2117051058";
        
        System.out.println("Nama : " + mhs.nama);
        System.out.println("NPM : " + mhs.npm);
        
        //rubah
        //mhs.nilaiUas = 90;
       // mhs.nilaiUts = 90;
        
        mhs.insertNilaiUas(90);
        mhs.insertNilaiUts(90);
        
        //eror
        //System.out.println("Nilai Uas : " + mhs.nilaiUas);
        //System.out.println("Nilai Uts : " + mhs.nilaiUts);
        
        mhs.dataMhs();
    }
    
}

//jiks menggunakan di dalam 1 file tidak perlu menggunakan public
//class Mahasiswa{
//    String nama;
//    String npm;
//    double nilaiUas;
//    double nilaiUts;
//}
