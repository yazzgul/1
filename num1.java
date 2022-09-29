import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("please, enter a number from 1 to 1000");
        x = scanner.nextInt();
        func(x);

    }

    public static void func (int a) {
        int m = 0;
        for (int i = 2; i < a; i++) {
            if ( a%i == 0 ) {
                break;
            }
            m = i;
        }
        if ((m  == a - 1) | (a == 2)) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }

}