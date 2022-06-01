import java.util.Scanner;

class revision {
    public static void main (String args[]) {
        /*  printing array

            int arr[] = {2, 4, 6, 7, 9, 8};
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        */

        /*  printing two dimensional array 
            
            int arr[][] = { {2, 4, 5, 6, 8}, {1, 7, 3, 9, 11} };
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        */

        /*  pattern triangle

            int n = 5;
            for (int i = 0; i<=5 ; i++) {
                for (int j = 0; j<=n; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k<=i; k++) {
                    System.out.print("*");
                }
                for (int m = 1; m<=i; m++) {
                    System.out.print("*");
                }
                System.out.println(" ");
                n--;
            }
        */

        /*  printing sum of even numbers */
        Scanner scan = new Scanner(System.in);
        int sumeven = 0;

        System.out.println("Enter the number");
        int n = scan.nextInt();
        int i = 2;

        while (i<=n) {
            sumeven = sumeven + i;
            i = i + 2;
        }
        System.out.println(sumeven);
    }
}