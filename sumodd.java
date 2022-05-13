import java.util.Scanner;
 class sumodd {
     public static void main (String args[]) {
         Scanner scan = new Scanner (System.in);

         int sumodd = 0;
         System.out.println("Enter the number");
         int n = scan.nextInt();

         int i = 1;
         while (i <= n) {
             sumodd = sumodd + i;
             i+=1;
         }
         System.out.println("Sum of odd number upto " + n + " = " + sumodd);
     }
 }