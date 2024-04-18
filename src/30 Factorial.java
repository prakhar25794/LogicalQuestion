import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        System.out.println("---Print Factorial---");
        System.out.print("Please enter the number you want to factorial = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long num1 = printFactorial(num);
        System.out.println(" Factorial of " +num+ " is " +num1);

    }

    public static long printFactorial(int num){
        int factorial = 1;
        for(int i=1; i<=num;i++){
            factorial = factorial*i;
        }
        return factorial;
    }

}
