package com.mycompany.tugaspbokelabstract;

//blue print dari suatu kelas
abstract class Hewan{
    //method abstract = tidak memiliki body
    public abstract void Suara();
    public abstract void Makan();
}

class Kucing extends Hewan{
    @Override
    public void Suara(){
        System.out.println("Kucing Meong...meong");
    }
    @Override
    public void Makan(){
        System.out.println("Kucing Makan Ikan");
    }
}

class Anjing extends Hewan{
    @Override
    public void Suara(){
        System.out.println("Anjing Guk...guk..guk");
    }
    @Override
    public void Makan(){
        System.out.println("Anjing Makan Tulang");
    }
}
public class TugasPboKelAbstract {

    public static void main(String[] args) {
        Kucing Salju = new Kucing();
        Anjing Snowman = new Anjing();
        
        Salju.Suara();
        Salju.Makan();
        Snowman.Suara();
        Snowman.Makan();
        
    }
}
