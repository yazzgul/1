import java.util.Scanner;

public class kr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int k;
        int max;
        max = 1;
        int d;
        d = 1;
        while(true) {
            n = scanner.nextInt();
            k = scanner.nextInt();

            if ( (n == k) || (n == n) || (k == k) ) {
                d++;

                if (d >= max) {
                    max = d;
                }
            }
            if ( (n > 10) || (n < 0) || (k > 10) || (k < 0) ) {
                break;
            }
        }
        System.out.println(max);

    }
}