import java.util.Scanner;

class SimpleInterest{
    public static void main(String[] args) {
        System.out.println("Simple Interest");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Principle = ");
        double p = sc.nextDouble();
        System.out.print("Enter the value of Rate = ");
        double r = sc.nextDouble();
        System.out.print("Enter the value of Time = ");
        double t = sc.nextDouble();

        double SI = (p*r*t/100);
        System.out.println("Simple Interest is = " +SI);




    }
}
