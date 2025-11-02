import java.util.Scanner;

public class Welcome {
    static void main(String[] args) {
        System.out.print("Please enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Welcome "+name+", to my world");
    }
}
