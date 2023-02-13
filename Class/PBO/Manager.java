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
public class Manager extends Jabatan{
    private String fasilitasManager;
    private double uangTunjanganManager;
    private double gajiPokokManager;
    
    public Manager(String jabatannya, String pt, String fasilitasManager, double uangTunjanganManager, double gajiPokokManager){
        super(jabatannya, pt);
        this.fasilitasManager = fasilitasManager;
        this.uangTunjanganManager = uangTunjanganManager;
        this.gajiPokokManager = gajiPokokManager; 
    }
    
    public Manager(){
        
    }

    public String getFasilitasManager() {
        return fasilitasManager;
    }

    public void setFasilitasManager(String fasilitasManager) {
        this.fasilitasManager = fasilitasManager;
    }

    public double getUangTunjanganManager() {
        return uangTunjanganManager;
    }

    public void setUangTunjanganManager(double uangTunjanganManager) {
        this.uangTunjanganManager = uangTunjanganManager;
    }

    public double getGajiPokokManager() {
        return gajiPokokManager;
    }

    public void setGajiPokokManager(double gajiPokokManager) {
        this.gajiPokokManager = gajiPokokManager;
    }
    
    @Override
    public double pendapatan(){
        return uangTunjanganManager + gajiPokokManager;
    }
    
    
}
