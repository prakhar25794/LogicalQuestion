import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value of Breadth = ");
        double B = sc.nextDouble();
        System.out.print("Please enter the value of Height = ");
        double H = sc.nextDouble();

        double Area = (1.0/2*B*H);
        System.out.println("Area of a Triangle = " +Area );


    }
}
