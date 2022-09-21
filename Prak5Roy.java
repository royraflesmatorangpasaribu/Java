/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak5roy;

/**
 *
 * @author Praktikan
 */
public class Prak5Roy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String firstname = "Roy";
        String lastname = "Pasaribu";
        
        //memnaggil manual
        System.out.println(firstname);
        System.out.println(lastname);
        
        //menggabungkan dua buat string
        String fullname3 = "Roy" + " " + "Pasaribu";
        //System.out.println(fullname);
        
        String fullname2 = firstname + " " + lastname;
        System.out.println(fullname2);
        
        String fullname = firstname + lastname;
        
        //Method toUpper dan toLower
        String upper = fullname.toUpperCase();
        String lower = fullname.toLowerCase();
        
        System.out.println(upper);
        System.out.println(lower);
        
        //menghitung panjang string
        int panjang = fullname.length();
        
        System.out.println(panjang);
        
        //string 3
        System.out.println(fullname3.substring(4, 9));
        
        //indexOf = mencari substring di dalam string
        int idx = fullname3.indexOf("Pasar");
        System.out.println(idx);
        
    }
    
}
