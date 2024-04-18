import java.util.Scanner;

class OddSum {
    public static void main(String[] args) {
        System.out.println("----Odd-Sum----");
        System.out.print("Enter a number = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum1 = printOddSum(num);
        System.out.println(sum1);

    }


    public static int printOddSum(int num){
        int sum=0;
         for(int i=1;i<=num;i=i+2) {
             sum=sum+i;

         }
         return sum;

       /* System.out.println("----Odd-Sum----");
        System.out.print("Enter a number = ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=num;i=i+2) {
            sum=sum+i;
        }
        System.out.println(sum);*/

    }




}
