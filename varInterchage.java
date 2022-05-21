class varInterchage {
    public static void main (String args[]) {
        int a = 1; 
        int b = 2;
        // a = b; //a =67;
        // b = a;

        // int tempA = a;
        // int tempB = b;
        // a = tempB;
        // b = tempA;

        // swap(a, b);

        int temp = a; //tempA = 1
        a = b; //a = 2
        b = temp; //b = 1
        

        System.out.println(a);
        System.out.println(b);
    }
}