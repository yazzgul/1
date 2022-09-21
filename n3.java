import java.util.Scanner;

public class n3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int s = -1000000000;
        while(true) {
            x = scanner.nextInt();
            if(x > s) {
                s = x;
            }
            if (x == 0) {
                break;
            }
        }
        System.out.println(s);
    }
}