import java.util.Scanner;

class calc {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your first number");
        int num1 = scan.nextInt();

        int num2;
        System.out.println("Enter your 2nd number");
        num2 = scan.nextInt();

        char op;
        System.out.println("Enter the operation you want");
        op = scan.next().charAt(0);

        // switch(op) {
        //     case '+': 
        //         System.out.println(num1+num2);
        //         break;

        //     case '-':
        //         System.out.println(num1- num2);
        //         break;

        //     case '*':
        //         System.out.println(num1*num2);
        //         break;

        //     case '/':
        //         System.out.println(num1*num2);
        //         break;

        //     case '%':
        //         System.out.println(num1%num2);
        //         break;

        //     default: 
        //         System.out.println("wrong operation");
        // }
    }
}