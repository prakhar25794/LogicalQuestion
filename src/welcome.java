import java.util.Scanner;

public class welcome {
    public static void main(String[] args) {
        System.out.print("Please enter your name = ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Welcome " +name+ " to KG-CODING");
    }
}
