import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // For loop
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        if (num < 0) {
            System.out.println("Please enter a positive number.");

        }
        else {
            System.out.println("You entered: " + num);   
        }
        scan.close();
    }
}
