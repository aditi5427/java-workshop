import java.util.Scanner;

class sumeven {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);

        int n,sum = 0;
		System.out.print(" Please Enter any Number : ");
		n = scan.nextInt();

        int i = 2;	
		while(i <= n) {
			sum = sum + i; 
			i = i + 2;
		}
		    System.out.println("\n The Sum of Even Numbers upto " + n + "  =  " + sum);
	}
}
