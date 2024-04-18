import java.util.Scanner;

class PerimeterOfRectangle {
    public static void main(String[] args) {
        System.out.println("PERIMETER OF RECTANGLE");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of a = ");
        double a = sc.nextDouble();
        System.out.print("Enter a value of b = ");
        double b = sc.nextDouble();
        System.out.print("Enter a value of c = ");
        double c = sc.nextDouble();
        System.out.print("Enter a value of d = ");
        double d = sc.nextDouble();

        double e = a+b+c+d;
        System.out.println(e);

    }
}
