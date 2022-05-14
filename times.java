import java.util.Scanner;

class times {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = scan.nextInt();
    
        int i = 1;
        int c = 0; //count of desired nos. here count of even numbers
        while(c != n) { //true
            //no is even
            if (i%2 == 0) {
                c++;
                System.out.println(i);
            }

            // if (c == n) {
            //     break;
            // }

            i++;
        }
    }
}