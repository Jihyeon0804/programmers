import java.util.Scanner;
// import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        
        long[] fibo = new long[x + 1];
        
        fibo[0] = 0;
        fibo[1] = 1;
        
        for (int i = 2; i <= x; i++) {
            // fibo[i] = fibo[i - 1].add(fibo[i - 2]);
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        
        System.out.println(fibo[x]);
    }
}