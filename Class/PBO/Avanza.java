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
public class Avanza extends Mobil{
    private long beli;
    private long laba;
    private long diskon;
    
    public Avanza(){
        
    }
    
    public Avanza(String namaMobil, String warnaMobil, int tahun, long beli, long laba, long diskon){
        super(namaMobil, warnaMobil, tahun);
        this.beli = beli;
        this.laba = laba;
        this.diskon = diskon;
    }
    
    @Override
    public long jual(){
        long besarDiskon = (beli + laba) * diskon/100;
        long hargaSebelumDiskon = beli + laba;
        return hargaSebelumDiskon - besarDiskon;
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

    public long getDiskon() {
        return diskon;
    }

    public void setDiskon(long diskon) {
        this.diskon = diskon;
    }
    
    
}
