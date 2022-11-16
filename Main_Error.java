/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum12roy;

/**
 *
 * @author Praktikan
 * 
 */
import java.util.ArrayList;
public class Praktikum12Roy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> nilai = new ArrayList<Integer>();
//        nilai.add(70);
//        nilai.add(75);
//        nilai.add(80);
        
        System.out.println(nilai.get(0));
        Mahasiswa mhs1 = new Mahasiswa("Roy Rafles M P", "2117051058", nilai);
        try{
            System.out.println("Nilai rata-rata : " + mhs1.nilaiRataRata());
        }
        
        catch(Exception e){
        System.out.println(e);
        }
        System.out.println("Tidak Eror");
        
        
       
    }
    
}
