import java.util.Scanner;

public class num3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please, enter 3 numbers");
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        func(a,b,c);
    }

    public static void func(int x, int y, int z) {
        if ((x + y > z) && (y + z > x) && (x + z > y)) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }

}