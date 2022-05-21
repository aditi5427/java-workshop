class oop {
    static int bauua = 11234;

    public void add () {
       System.out.println("asdfsgdsdasdafb"); 
    }

    public void add (int a, String b) {
       System.out.println(b); 
    }

    public int add (int a, int b) {
        int add = a + b;
        return add; 
    }

    //polymorphism
    public int add (int a, int b, int c) {
        int add = a + b + c;
        return add; 
    }
    
    public static void main (String args[]) {
        // String str1 = new String();
        // Scanner scan = new Scanner(System.in);
        // ArrayList<Integer> list = new ArrayList();

        oop obj = new oop();
        String str1 = new String();

        int ans = obj.add(4, 6);
        int ans2 = obj.add(4, 6, 10);

        obj.add();
        obj.add(4, "kutta is bhemu");
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(obj.bauua);

        // dog kutta = new dog();
        // System.out.println(kutta.mouth);
    }
}

class dog {
    int mouth = 1; 
    int eye = 2;
    int puchh = 1;
    String color;
}