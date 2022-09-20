import java.util.Scanner;
public class bubble {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int n, i, j, temp;
        n = input.nextInt();
        int[] a = new int[n];
        
        for(i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
     
	for(i=0; i<n; i++){
		for(j=n-1; j>=i+1; j--){
			if(a[j]<a[j-1]){
                            temp=a[j];
                            a[j]=a[j-1];
                            a[j-1]=temp;
			}
		}
	}
        
        for(i=0; i<n; i++){
            System.out.print(a[i]+" ");
	}
    }
    
}
