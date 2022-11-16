/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum12roy;

import java.util.ArrayList;

/**
 *
 * @author Praktikan
 */
public class Mahasiswa {
    private String nama;
    private String npm;
    private ArrayList<Integer> nilai = new ArrayList<Integer>();

    public Mahasiswa(String nama, String npm, ArrayList<Integer> nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public ArrayList<Integer> getNilai() {
        return nilai;
    }

    public void setNilai(ArrayList<Integer> nilai) {
        this.nilai = nilai;
    }
    
    public double nilaiRataRata(){
        int sum = 0;
        for (int i = 0; i < this.nilai.size(); i++){
            sum += this.nilai.get(i);
        }
        return sum/this.nilai.size();
    }
}
