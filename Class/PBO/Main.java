/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roy;

/**
 *
 * @author ASUS
 */
public class Praktikum10_Roy {

    public static void main(String[] args) {

        Mobil car = new Mobil("Rush", "Merah", 2022);
        System.out.println("Nama Kendaraan   : " + car.getNamaMobil());
        System.out.println("Warna Kendaraan  : " + car.getWarnaMobil());
        System.out.println("Tahun Kendaraan  : " + car.getTahun());
        System.out.println("");
        
        System.out.println("");
        System.out.println("JUAL MOBIL BEKAS / BARU");
        KijangInnova car1 = new KijangInnova("Kijang Innova", "Putih", 2019, 295000000, 5000000);
        System.out.println("Nama Kendaraan   : " + car1.getNamaMobil());
        System.out.println("Warna Kendaraan  : " + car1.getWarnaMobil());
        System.out.println("Tahun Kendaraan  : " + car1.getTahun());
        System.out.println("Harga Jual       : " + car1.jual());
        
        System.out.println("");
        System.out.println("JUAL MOBIL BEKAS / BARU");
        Alphard car2 = new Alphard("Toyota Alphard", "Hitam", 2020, 700000000, 5000000, 10000000);
        System.out.println("Nama Kendaraan   : " + car2.getNamaMobil());
        System.out.println("Warna Kendaraan  : " + car2.getWarnaMobil());
        System.out.println("Tahun Kendaraan  : " + car2.getTahun());
        System.out.println("Biaya Asuransi   : " + car2.getAsuransi());
        System.out.println("Harga Jual       : " + car2.jual());
        
        System.out.println("");
        System.out.println("JUAL MOBIL BEKAS / BARU");
        Avanza car3 = new Avanza("Avanza Veloz", "Silver", 2021, 189000000, 2000000, 15);
        System.out.println("Nama Kendaraan   : " + car3.getNamaMobil());
        System.out.println("Warna Kendaraan  : " + car3.getWarnaMobil());
        System.out.println("Tahun Kendaraan  : " + car3.getTahun());
        System.out.println("Diskon           : " + car3.getDiskon());
        System.out.println("Harga Jual       : " + car3.jual());
        

    }
    
}
