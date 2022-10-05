/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roy_praktikum7;

/**
 *
 * @author Praktikan
 */
public class Roy_Praktikum7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa();
        
        System.out.println("");
        
        mhs.setNama("Roy Rafles M.P");
        mhs.setNpm("2117051058");
        
        System.out.println(mhs.getNama());
        System.out.println(mhs.getNpm());
        
        
        
        //int result = mhs.sumValue();
        //int result = mhs.sumValue(5, 8)
        
       // System.out.println(result);
        mhs.hitungNA(80,80,80);
        mhs.printData("Ilmu Komputer");
        
        
        
        
    }
    
}
