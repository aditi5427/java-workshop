// import java.util.Scanner;

class factor {
    public static void main (String args[]) {
        // Scanner scan = new Scanner(System.in);

        // System.out.println("Enter the number you want to factor");
        // int n = scan.nextInt();

        int n = 256;

        // if (n%2 == 0) {
        //     System.out.println("Divisile by 2");
        // }

        // while (n%2 == 0) {
        //     int newNo = n/2;
        //     n = newNo; // n = n/2;
        //     System.out.println("kutta");
        // }

        int count = 0;
        for ( ; n % 2 == 0; n = n/2 ) {
            count++;
        } 
        System.out.println(count);
    }
} 