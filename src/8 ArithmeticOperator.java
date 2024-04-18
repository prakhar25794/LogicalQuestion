import java.util.Scanner;

class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of X = ");
        int x = sc.nextInt();
        System.out.print("Enter the value of Y = ");
        int y = sc.nextInt();

        int sum = x+y;
        int sub = x-y;
        int multi = x*y;
        int div = x/y;
        int remain = x%y;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(remain);





    }
}
