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
public class KijangInnova extends Mobil{
    private long beli;
    private long laba;
    
    public KijangInnova(){
        
    }
    
    public KijangInnova(String namaMobil, String warnaMobil, int tahun, long beli, long laba){
        super(namaMobil, warnaMobil, tahun);
        this.beli = beli;
        this.laba = laba;
    }
    
    @Override
    public long jual(){
        return beli + laba;
    }

    public float getBeli() {
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
    
}
