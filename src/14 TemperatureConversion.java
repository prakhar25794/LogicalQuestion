import java.util.Scanner;

class TemperatureConversion {
     public static void main(String[] args) {
          System.out.println("-----Temperature-Conversion-----");
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the value of Fahrenheit = ");
           double F = sc.nextDouble();
           // °C = (°F - 32) × 5/9
          double Celcius = 5.0/9*(F-32);

          System.out.println("Temperature is = " +Celcius);

     }
}
