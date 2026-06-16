// package Loops;
import java.util.Scanner;
public class DigitCount {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==0) n=1;
        int count = 0;
        while(n!=0){
            n= n/10; //   345/10=34  34/10=3 3/10=0
            count ++; //3
            // System.out.println(n);
        }
        System.out.println(count);
    }
}
