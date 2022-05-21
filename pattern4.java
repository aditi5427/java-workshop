class pattern4 {
    public static void main (String args[]) {
        /*
            printing pattern
                   *
                  **
                 ***
                ****
        */
        int n = 2;
        for (int i = 1; i<=4; i++) {
            for (int j = 0; j<=n; j++) {
                System.out.print(" ");  
            }
            for (int k = 1; k<=i; k++) {
                System.out.print("*");
            }
            n--; 
            System.out.println();
        }
    }
}