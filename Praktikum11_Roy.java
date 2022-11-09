/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum11_roy;

/**
 *
 * @author Praktikan
 */
public class Praktikum11_Roy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunDatar lingkaran = new Lingkaran ( 10, "Merah");
        BangunDatar segiTiga = new SegiTiga ( 13, 5, "Biru");
        BangunDatar segiEmpat = new SegiEmpat ( 5, "Hitam");
        
        BangunDatar[] bangunDatar = new BangunDatar[3];
        bangunDatar[0] = lingkaran;
        bangunDatar[1] = segiTiga;
        bangunDatar[2] = segiEmpat;
        
        for(int i = 0; i < 3; i++){
            bangunDatar[i].print();
        }
    }
    
}
