import java.util.Scanner;

public class n22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please, enter two numbers");
        int x, y;
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println("-----");
        func(x, y);
        System.out.println("-----");
    }

    public static void func(int a, int b) {
        int k = 0;
        if (a < b) {
            for (k = a; k <= b; k++) {
                if (k % 3 == 0) {
                    System.out.println(k);
                }
            }
        }
        else {
            for (k = b; k <= a; k++) {
                if (k % 3 == 0) {
                    System.out.println(k);
                }
            }
        }

    }

}