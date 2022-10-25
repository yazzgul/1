import java.util.Scanner;
public class kr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int a;
        a = 2;
        for (int k = 2 ; k <= n; k++) {
            a = a * 2;
        }
        System.out.println(a);
    }
}