import java.util.Scanner;

class input {
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("write your name");
        String name = input.nextLine();

        System.out.println("Enter the number");
        int n = input.nextInt();

        System.out.println("Do you agree with it");
        boolean a = input.nextBoolean();

        System.out.println(" Write total income");
        double d = input.nextDouble();

    }
}