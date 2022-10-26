/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum9_roy;

/**
 *
 * @author Praktikan
 */
public class Praktikum9_Roy {
    //nested class (gunakan keyword static)
    public static class Tabung {
    private static final double phi = 3.14;
    static double Volume;
    static double LuasPermukaan;
    
    public static double Volume(double r, double t){
        double volume = phi * r * r * t;
        return volume;
    }
    
    public static double LuasPermukaan(double r, double t){
        double LuasPermukaan = 2 * phi * r  * (r+t);
        return LuasPermukaan;
    }
}

    /**
     * @param args the command line arguments
     */
    
    public String atributBukanStatic = "Atribut Bukan Static";
    static String atributStatic = "Atribut Static";
    
    //method
    public void bukanStatic(){
        System.out.println("Bukan Static");
    }
    
    static void methodStatic(){
        System.out.println("Method Static");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(atributBukanStatic);
        //System.out.println(atributStatic);
        
//        Praktikum9_Roy test = new Praktikum9_Roy();
//        test.bukanStatic();
//        methodStatic();
        
        Praktikum9_Roy praktikum = new Praktikum9_Roy();
        System.out.println(praktikum.atributBukanStatic);
        System.out.println(atributStatic);
        praktikum.bukanStatic();
        methodStatic();
        
        double r = 13;
        double t = 30;
        double vol = Tabung.Volume(r,t);
        double lp = Tabung.LuasPermukaan(r, t);
        
        System.out.println(vol);
        System.out.println(lp);
    }
    
}
