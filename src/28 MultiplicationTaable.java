import java.util.Scanner;

class MultiplicationTable {
     public static void main(String[] args) {
         System.out.println("---Multiplication Temple---");
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number which table you want to print = ");
         int num = sc.nextInt();
         printMulti(num);
     }

         public static int printMulti(int num){
             for (int i = 1; i <= 10; i++) {
                 System.out.println(num * i);

             }
             return num;
         }

}
