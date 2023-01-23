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
abstract class Hewan {
    public abstract void Suara(); // method asbtrak
    public abstract void Makan();
}

class Kucing extends Hewan{
    @Override
    public void Suara(){
        System.out.println("Suara Kucing : Meong...Meong...Meong");
    }
    public void Makan(){
        System.out.println("Kucing makan ikan");
    }
}
class Anjing extends Hewan{
    @Override 
    public void Suara(){
        System.out.println("Suara Anjing : Guk...Guk...Guk");
    }
    public void Makan(){
        System.out.println("Anjing makan Tulang");
    }
}
