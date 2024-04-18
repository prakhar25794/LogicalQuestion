import java.util.Scanner;

class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        System.out.println("-----Greatest of Three Numbers-----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b = ");
        int b  = sc.nextInt();
        System.out.print("Enter the value of c = ");
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("a is greatest.");
            }else {
                System.out.println("c is greatest.");
            }

        }else if(b>c){
            System.out.println("b is greatest.");
        }else {
            System.out.println("c is greatest.");
        }

    }
}
