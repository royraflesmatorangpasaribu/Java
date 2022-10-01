import java.util.Scanner;
public class Praktikum4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, sum;
        n = input.nextInt();
        int[] a = new int[n];
        
        for(i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        
        sum = 0;
        for(int num : a){
            sum = sum+num;
        }
        
        System.out.print(sum); 
    }
    
}
