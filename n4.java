import java.util.Scanner;

public class n4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean b = false, m = false, r = true;
        int x = scanner.nextInt();
        int y;
        while(true) {
            if (x == 0) {
                break;
            }
            y = scanner.nextInt();
            if (y == 0) {
                break;
            }
            if (y!=x) {
                r = false;
            }
            if (y>x) {
                b = true;
            }
            if(y<x) {
                m = true;
            }
            x = y;
        }
        if (r == true) {
            System.out.println("=");
        }
        if ( (m == true ) && (b == true) ) {
            System.out.println("!");
        }
        if ((m == true) && (b == false)) {
            System.out.println(">");
        }
        if ((m == false) && (b == true)) {
            System.out.println("<");
        }
    }
}

