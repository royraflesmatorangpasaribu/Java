//abstrak class
//blue print suatu class
abstract class Hewan{
    //abstract method
    public abstract void Suara(); //jika tidak menggunakan abstract dia akan menjadi method biasa
    public abstract void Makan();
    
}
//mengovewrite method yang di atas
class Kucing extends Hewan{
    @Override
    public void Suara(){
        System.out.println("Kucing : meong... meong");
    }
    @Override
    public void Makan(){
        System.out.println("Kucing makan ikan");
    }
}


class Anjing extends Hewan{
    @Override
    public void Suara(){
        System.out.println("Anjing : gong... gong...");
    }
    @Override
    public void Makan(){
        System.out.println("Anjing makan Tulang");
    }
}

public class KelompokAbstract {
    public static void main(String[] SalsaBilaJuu){
        Kucing Salju = new Kucing();
        Anjing Snowman = new Anjing();
    
        Salju.Suara();
        Salju.Makan();
        Snowman.Suara();
        Snowman.Makan(); 
    }
    
}
