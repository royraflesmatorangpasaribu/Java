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
public class Jabatan {
    private String jabatannya;
    private String pt;
    
    public Jabatan(String jabatannya, String pt){
        this.jabatannya = jabatannya;
        this.pt = pt;
    }
    public Jabatan(){
        
    }

    public String getJabatannya() {
        return jabatannya;
    }

    public void setJabatannya(String jabatannya) {
        this.jabatannya = jabatannya;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }
    
    public double pendapatan(){
        return 0;
    }
    public void DataKaryawan(){
        System.out.println("Nama PT : " + getPt());
        System.out.println("Nama Jabatan : " + getJabatannya());
    }
}
