import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("-----Compound Interest-----");
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter the Principle = ");
        double P = sc.nextDouble();

        System.out.print("Enter the Rate = ");
        double R = sc.nextDouble();

        System.out.print("Enter the Time = ");
        double T = sc.nextDouble();

        double Amount = P * Math.pow(1+(R/100),T);
        //double compoundInterest = Amount - P;

        //System.out.println(compoundInterest);
        System.out.println(Amount);


    }
}
