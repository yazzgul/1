import java.util.Scanner;

public class n33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("please, enter a number");
        a = scanner.nextInt();
        int f = 0;
        for (int k = 2; k < a; k++) {
            if (a % k == 0) {
                break;
            }
            f = k;
        }
        if ((f == a - 1) | ( a == 2)) {
            System.out.println("Prime");
        }
        else {
            System.out.print("1");
            int i=2;
            while(a!=1){
                if(a%i==0){
                    System.out.print(" " + i);
                    a=a/i;
                } else{i=i+1;}

            }
            
            // for (int m = 1; a != 1; m++) {
            //     if (a % m == 0) {
            //     System.out.println(m);
            //     a = a/m;
        }
    }
}