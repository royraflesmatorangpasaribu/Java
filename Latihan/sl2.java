import java.util.Scanner;
import java.text.DecimalFormat;
public class UtpNo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r,t;
        double luas;
        DecimalFormat dec = new DecimalFormat("0.000");
        r = input.nextInt();
        t = input.nextInt();
        luas = (Math.PI)*r*r*t;
        System.out.println(dec.format(luas/1000000));
    }
}
