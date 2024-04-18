import java.util.Scanner;

class ternaryAbsoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to finding Absolute Number ");
        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        int absolute = num>=0? num:-num;
        System.out.println("Absolute number of " +num+ " is " +absolute);
    }
}
