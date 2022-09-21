import java.util.Scanner;

public class n1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        String y = "no" ;
        while (true) {
            x = scanner.nextInt();
            if (x == 5) {
                y = "yes" ;
            }
            if (x == 0) {
                break;
            }
        }
        System.out.println(y);
    }
}