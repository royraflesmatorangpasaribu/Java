/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utama;

/**
 *
 * @author RoyRaflesMatorangPasaribu
 */
public class Utama {
    public String atributNonStatic = "Atribut Bukan Static";
    static String atributStatic = "Atribut Static";
    public static void main(String[] args) {
        System.out.println(atributStatic);
        //System.out.println(atributNonStatic);
        staticMethod();
        Utama objek = new Utama();
        objek.bukanStaticMethod();
    }  
    
    public static void staticMethod(){
        System.out.println("Ini Static Method");
    }
    
    public void bukanStaticMethod(){
        System.out.println("Ini Bukan Static Method");
        staticMethod();
    }
    public static class SayHello {
    public static void katakan(){
        System.out.println("say hello!!");
    }
}
}
