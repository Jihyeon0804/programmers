import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    private static BigInteger[] fibo = new BigInteger[491];
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        fibo[0] = BigInteger.ZERO;
        fibo[1] = BigInteger.ONE;
        
        for (int i = 2; i <= 490; i++) {
            fibo[i] = fibo[i - 1].add(fibo[i - 2]);
        }
      
        while (true) {
            int x = scan.nextInt();
            if (x == -1)
                break;
            System.out.println("Hour " + x + ": " + fibo[x] + " cow(s) affected");
        }
        
        scan.close();
    }
}
