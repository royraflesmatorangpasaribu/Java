public class Searching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, cari;
        n = input.nextInt();
        int[] a = new int[n];
        boolean cek = false;
        
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        
        cari = input.nextInt();
        
        for(int i = 0; i < n; i++){
            if(cari == a[i]){
                System.out.println("Nilai ditemukan");
                cek = true;
            }
        }
        if(cek == false){
                System.out.println("Nilai tidak ditemukan"); 
           }
    }   
}
