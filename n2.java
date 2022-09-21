import java.util.Scanner;

public class n2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int s = 0;
        while (true) {
            x = scanner.nextInt();
            s += x;
            if (x == 0) {
                break;
            }
        }
        System.out.println(s);
    }
}