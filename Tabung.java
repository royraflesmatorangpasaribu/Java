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
public class Tabung {
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
