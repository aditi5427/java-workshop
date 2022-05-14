import java.util.Scanner;

class gud {
    public static void main (String args[]) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter your age");
        int n = scan.nextInt();
        
        switch(n) {
            case 10: 
                System.out.println("You are a child.");
                break;

            case 15:
                System.out.print("You are a teenager.");
                break;

            case 18:
                System.out.println("You are adult.");
                break;

            case 50:
                System.out.println("You are old.");
                break;

            default:
                System.out.print("--//invalid//--");

        }
    }
}