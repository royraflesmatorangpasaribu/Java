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
