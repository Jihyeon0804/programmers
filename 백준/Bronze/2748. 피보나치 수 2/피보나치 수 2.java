import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        
        BigInteger[] fibo = new BigInteger[x + 1];
        
        fibo[0] = BigInteger.ZERO;
        fibo[1] = BigInteger.ONE;
        
        for (int i = 2; i <= x; i++) {
            fibo[i] = fibo[i - 1].add(fibo[i - 2]);
        }
        
        System.out.println(fibo[x]);
    }
}