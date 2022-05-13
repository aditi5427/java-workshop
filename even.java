import java.util.Scanner;

class even {
    public static void main (String args[]) {

        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

            if (n%2 == 0) {
                System.out.println("Even number");

            } else {
                System.out.println("odd number")
            }
    }
}