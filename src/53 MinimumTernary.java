import java.util.Scanner;

 class MinimumOfTwoNumbers {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Welcome to finding Minimum ");
         System.out.print("Enter the First number = ");
         int num1 = sc.nextInt();
         System.out.print("Enter the Second number = ");
         int num2 = sc.nextInt();
         MinimumOfTwoNumbers Ternary = new MinimumOfTwoNumbers();
         int min1 = Ternary.min(num1,num2);
         System.out.println("Minimum number is = " + min1);

     }

     public int min(int num1, int num2) {

         return num1 < num2 ? num1 : num2;
     }

     //int minNum = (x < y) ? x : y;
     //   System.out.println(minNum +" is the Minimum Number");

}
