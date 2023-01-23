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
public class BidangDatar {
    String rumus;
    
    BidangDatar(String rumus){
        this.rumus = rumus;
    }
    
    void cetak(){
        System.out.println("Rumus Luas\t\t: "+ this.rumus);
    }
}
