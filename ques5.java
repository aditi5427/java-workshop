import java.util.Scanner;

class ques5 {
    // Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.
    
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number");
        int num2 = scan.nextInt();

        int result = 1;
        for (int i = 1; i <= num2; i++) {
            result = result * num1;
        }
        System.out.println("power: " + result);
    }
}