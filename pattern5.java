class pattern5 {
    public static void main (String args[]) {
        int n = 3;
        for (int i = 1; i<=4; i++) {
            for (int j = 0; j<=n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++) {
                System.out.print("*");
            }
            for(int l = 1; l<=i; l++) {
                System.out.print("*");
            }
            n--;
            System.out.println();
        } 
    }
}