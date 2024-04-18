import java.util.Scanner;

class ternaryEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to finding Even-Odd ");
        System.out.print("Enter the number to find even and odd = ");
        int x = sc.nextInt();

        String evenOdd = (x%2==0)?"Even":"Odd";
        System.out.println("Your num is " +evenOdd);







    }
}
