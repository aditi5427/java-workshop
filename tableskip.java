class tableskip {
    public static void main (String args[]) {
        int n = 2;
        for (int i = 1; i<=100; i++) {
            if (i%3 == 0) {
                continue;
            }
            System.out.println(n*i);
        }
    }
}