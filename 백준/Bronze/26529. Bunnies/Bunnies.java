import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            System.out.println(Fibo(x));
        }
    }
    
    public static int Fibo(int n) {
         if (n <= 1) {
            return 1;
        }

        int m = 1;
        int k = 1;
        int l = 0;
        
        for (int i = 2; i <= n; i++) {
            l = m + k;
            m = k;
            k = l;
        }
        return l;
    }
}