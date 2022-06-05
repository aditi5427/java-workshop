class ques6 {
    public static void main (String args[]) {
        int a = 2;
        for (int i = 0; i<=2; i++) {
            for (int j = 0; j<=a; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k<=i; k++) {
                System.out.print("*");
            }
            for (int l = 0; l<=i; l++) {
                System.out.print("*");
            }
            a--;
             System.out.println();
        }

        int b = 2; 
        for (int m = 0; m<=2; m++) {
            for (int n = 0; n<=m; n++) {
                System.out.print(" ");
            }
            for (int o = 0; o<=b; o++) {
                System.out.print("*");
            }
            for (int p = 1; p<=b; p++) {
                System.out.print("*");
            }
            b--;
            System.out.println();
        }
    }
}