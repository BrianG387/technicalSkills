import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        if (num < 0) {
            System.out.println("Please enter a positive number.");
        }
        else if (num == 0) {
            System.out.println("Please enter a non-zero number.");
        }
        else {
            System.out.println("You entered: " + num);
        }
        scan.close();
    }
}
