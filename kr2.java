import java.util.Scanner;

public class kr2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int k;
        boolean vse1 = true;

        while (true) {
            n = scanner.nextInt();
            if (sod(n) == false) {
                vse1 = false;
            }
            if (n == 0) {
                break;
            }
        }
        
        if (vse1 == false) {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }

    public static boolean sod(int k) {
        boolean vsef;
        vsef = false;
        while(k != 0) {
                if ( (k%10 == 5) || (k%10 == 3) ) {
                    vsef = true;
                    k = k / 10;
                }
        }
        return vsef;

    }

}