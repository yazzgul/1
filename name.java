import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Как тебя зовут? (only in english, please)");
        String name = in.nextLine();
        System.out.printf("Ты молодец, %s !", name);
        in.close();
    }
}