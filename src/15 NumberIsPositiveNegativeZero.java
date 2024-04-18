import java.util.Scanner;

class NumberIsPositiveNegativeZero {
    public static void main(String[] args) {
        System.out.println("----Number is Positive/Negative/Zero----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check = ");
        int x = sc.nextInt();
        if(x>0){
            System.out.println("Positive Number");
        } else if (x<0) {
            System.out.println("Negative Number");
        }else {
            System.out.println("Zero");
        }


    }
}
