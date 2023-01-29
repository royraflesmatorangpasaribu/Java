class Lingkaran {
    private double radius;
    private Titik titikPusat;

    public Lingkaran(double radius, Titik titikPusat) {
        this.radius = radius;
        this.titikPusat = titikPusat;
    }

    public double getRadius() {
        return radius;
    }

    public Titik getTitikPusat() {
        return titikPusat;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setTitikPusat(Titik titikPusat) {
        this.titikPusat = titikPusat;
    }
    
    public double luas(){
        return Math.PI*this.radius*this.radius;
    }
    
    public double keliling(){
        return 2*Math.PI*this.radius;
    }
}
class Titik {
    private int x;
    private int y;

    public Titik(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    
     public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double distance(Titik o){
        return Math.sqrt(Math.pow(o.getX() - this.x, 2) + Math.pow(o.getY() - this.y, 2));
    }
}
