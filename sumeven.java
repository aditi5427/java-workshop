import java.util.Scanner;

class sumeven {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);

        int n,sum = 0;
		System.out.println("Please Enter any Number : ");
		n = scan.nextInt();

        int i = 2;	
		while(i <= n) {
			sum = sum + i; 
			i = i + 2;
		}
		
		System.out.println("The Sum of Even Numbers upto " + n + "  =  " + sum);



		int sumodd = 0;
        System.out.println("Enter the number");
        int m = scan.nextInt();

        int j = 1;
        while (j <= m) {
            sumodd = sumodd + j;
            j+=2; //j = j + 2;
        }
        System.out.println("Sum of odd number upto " + m + " = " + sumodd);
	}
}
