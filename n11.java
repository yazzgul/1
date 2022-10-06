import java.util.Scanner;

public class n11 {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please, enter a number");
        x = scanner.nextInt();
        System.out.println(func(x));

    }

    public static int func(int a) {
        int f = 1;
        if (a != 0) {
            for (int k = 1; k <= a; k += 1) {
                // System.out.println(f);
                f *= k;
            }
        }
        return Math.abs(f);
    }


}

//     public static int func(int a) {
//         int f = 1;
//         if (a != 0) {
//             for (int k = a; a > 0; a = a - 1) {
//                 System.out.println(f);
//                 f *= a;
//             }
//         }
//         return f;
//     }


// }