public class Pemain {
    public String warna;
    public double ukuran;
    public int posX;
    public int posY;
    public int v;
    
    public Pemain(){
        this.warna = "Hitam";
        this.ukuran = 10;
        this.posX = 100;
        this.posY = 100;
        this.v = 1;
    }
    
    public Pemain(String warna, double ukuran, int posX, int posY, int v){
        this.warna = warna;
        this.ukuran = ukuran;
        this.posX = posX;
        this.posY = posY;
        this.v = v;
    }
    
    public Pemain(String warna, double ukuran){
        this.warna = warna;
        this.ukuran = ukuran;
        this.posX = 100;
        this.posY = 100;
        this.v = 1;
    }
    
    public void kiri(){
        this.posX -= v;
        if(this.posX < 0){
            this.posX = 0;
        }
    }
    
    public void kanan(){
        this.posX += v;
        if(this.posX > 200){
            this.posX = 200;
        }
    }
    
    public void atas(){
        this.posY -= v;
        if(this.posY < 0){
            this.posY = 0;
        }
    }
    
    public void bawah(){
        this.posY += v;
        if(this.posY > 200){
            this.posY = 200;
        }
    }
}
