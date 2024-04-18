import java.util.Scanner;

class HelloWorldUsingScanner {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Please enter your name= ");
         String str = sc.nextLine();
         System.out.println("Welcome "+str+ " to Noida ");
     }
}
