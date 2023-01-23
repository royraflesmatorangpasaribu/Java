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
public class PersegiPanjang extends BidangDatar {
    String type = "Persegi Panjang";
    
    PersegiPanjang(String rumus){
        super(rumus);
    }
    
    @Override
    void cetak(){
        super.cetak();
        System.out.println("Nama Bidang datar\t: "+ this.type);
    }
}
