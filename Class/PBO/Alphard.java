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
public class Alphard extends Mobil{
    private long beli;
    private long laba;
    private long asuransi;
    
    public Alphard(){
        
    }
    
    public Alphard(String namaMobil, String warnaMobil, int tahun, long beli, long laba, long asuransi){
        super(namaMobil, warnaMobil, tahun);
        this.beli = beli;
        this.laba = laba;
        this.asuransi = asuransi;
    }
    
    @Override
    public long jual(){
        return beli + laba + asuransi;
    }

    public long getBeli() {
        return beli;
    }

    public void setBeli(long beli) {
        this.beli = beli;
    }

    public long getLaba() {
        return laba;
    }

    public void setLaba(long laba) {
        this.laba = laba;
    }

    public long getAsuransi() {
        return asuransi;
    }

    public void setAsuransi(long asuransi) {
        this.asuransi = asuransi;
    }
   
    
}
