class function {
    public static int sum(int a, int c) {
        int sum = a + c;
        return sum;
    }

    public static String name(String ad) {
        String name = ad;
        return name;
    }

    public static void write() {
        System.out.println("nice nice");
    }

    public static int square(int num) {
        return num * num;
    }

    public static int div(int e, int f) {
        return e / f;
    }

    public static void main(String args[]) {
        // printing integar
        int ans = sum(6, 8);
        System.out.println(ans);

        // printing string
        String ad = " is a good girl";
        String intro = name(ad);
        System.out.println("Aditi" + intro);

        // calling void function
        write();

        // printing square of given numbers
        for (int i = 1; i <= 5; i++) {
            int res = square(i);
            System.out.println("square is " + res);

        }

            int cd = div(8, 2);
            System.out.println(cd);
    }

}
