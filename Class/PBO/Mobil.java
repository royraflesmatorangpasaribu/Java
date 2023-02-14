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
public class Mobil {
    private String namaMobil;
    private String warnaMobil;
    private int tahun;

    public Mobil(String namaMobil, String warnaMobil, int tahun) {
        this.namaMobil = namaMobil;
        this.warnaMobil = warnaMobil;
        this.tahun = tahun;
    }
    
   public Mobil(){
       
   }

    public String getNamaMobil() {
        return namaMobil;
    }

    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }

    public String getWarnaMobil() {
        return warnaMobil;
    }

    public void setWarnaMobil(String warnaMobil) {
        this.warnaMobil = warnaMobil;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
   
   public long jual(){
       return 0;
   }
}
