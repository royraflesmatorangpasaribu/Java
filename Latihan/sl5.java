class Orang{
    String nama;
    String alamat;
    Mobil mobil;
    
    public Orang(){

    }
    
    public Orang(String nama, String alamat, Mobil mobil){
        this.nama=nama;
        this.alamat=alamat;
        this.mobil=mobil;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }
    
    void print(){
        System.out.println("Nama: "+this.nama);
        System.out.println("Alamat: "+this.alamat);
        System.out.println("Mobil: "+this.mobil.merk);
        System.out.println("Warna: "+this.mobil.warna);
        System.out.println("Tahun Keluaran: "+this.mobil.tahun_keluaran);
        System.out.println("Harga: "+this.mobil.getHarga());
        System.out.println("Pajak: "+this.mobil.hitungPajak());
    }
}
class Mobil{
    String merk;
    String warna;
    int tahun_keluaran;
    String nomor_rangka;
    double harga;

    public Mobil(){

    }
    
    Mobil(String merk, String warna, int tahun_keluaran, String nomor_rangka, double harga){
        this.merk=merk;
        this.warna=warna;
        this.tahun_keluaran=tahun_keluaran;
        this.nomor_rangka=nomor_rangka;
        this.harga=harga;
    }

    public Mobil(String merk, String warna, int tahun_keluaran, double harga){
        this.merk=merk;
        this.warna=warna;
        this.tahun_keluaran=tahun_keluaran;
        this.harga=harga;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getTahunKeluaran() {
        return tahun_keluaran;
    }

    public void setTahunKeluaran(int tahun_keluaran) {
        this.tahun_keluaran = tahun_keluaran;
    }

    public String getNomor_rangka() {
    return nomor_rangka;
    }

    public void setNomor_rangka(String nomor_rangka) {
        this.nomor_rangka = nomor_rangka;
    }

    public long getHarga() {
        return (long)this.harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }


    long hitungPajak(){
        double pajak = 0;
        if(this.tahun_keluaran<2010){
            pajak=this.harga*0.025;
        }
        else if(this.tahun_keluaran>=2010&&this.tahun_keluaran<=2015){
            pajak=this.harga*0.05;
        }
        else if(this.tahun_keluaran>=2016&&this.tahun_keluaran<=2020){
            pajak=this.harga*0.1;
        }
        else if(this.tahun_keluaran>2020){
            pajak=this.harga*0.15;
        }
        return (long)pajak;
    }
}
