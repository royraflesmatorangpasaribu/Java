import java.util.Scanner;
public class UtpNo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double F, c;
        F = input.nextDouble();
        c = (F - 32)* 5/9;
        System.out.printf("%.2f",c);
        if(c <24){
            System.out.println("\nDingin");
        }
        else if(c>=24 && c<=32 ){
            System.out.println("\nNormal");
        }
        else{
            System.out.println("\nPanas");
        }
    }
}
