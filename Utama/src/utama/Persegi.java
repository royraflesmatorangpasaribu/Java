/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utama;

public class Persegi {
    private double sisi;
    private double luas;
    
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public double getLuas() {
        return luas;
    }
    
    void hitungLuas(){
        this.luas = this.sisi * this.sisi;
    }
}
