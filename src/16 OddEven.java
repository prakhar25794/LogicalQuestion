import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        System.out.println("-----ODD-EVEN-----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check = ");
        int number = sc.nextInt();
        if (number%2==0){
            System.out.println("Number is Even.");
        }else {
            System.out.println("Number is Odd.");
        }

    }
}
