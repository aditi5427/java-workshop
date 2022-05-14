import java.util.Scanner;

class Bhemu {
    static int kutta(int a, int b) {
       return a + b;
    }

    static boolean printBuaa(String name) {
        System.out.println(name + " is good");

        return true;
    }

    static String number(int num) {
        return (num + " is  bad ");
    }

    public static void main(String args[]) {
        // int a;
        // a = 56;

        // int b = 34;
        // int ans = kutta(a, 7890);
        
        // boolean no = printBuaa("sdsdafsgfdsghdsafsghdsdghfgh");
        // System.out.println( no );
        // System.out.println( ans );

        // int num = 4;
        // String kauaa = number(num);
        // System.out.println(kauaa);


        // String butru = new String(); // String butru = "bauua";
        Scanner scan = new Scanner(System.in);
        
        // String no1 = scan.next();
        // System.out.println("your no is: " + no1);
        
        System.out.println("enter the first number");
        float num1 = scan.nextFloat();
        
        System.out.println("enter the second no");
        float num2 = scan.nextFloat();
        
        System.out.println(num1/num2);
    }
}