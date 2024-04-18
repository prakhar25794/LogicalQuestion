import java.util.Scanner;

class StudentMarksTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Student Score ");
        System.out.print("Enter the Marks of Student = ");
        int marks = sc.nextInt();

        String category = marks>80? "High": (marks>50?"Moderate":"Low");
        System.out.println("Your category is = " +category);



    }
}
