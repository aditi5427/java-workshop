class pattern2 {
    public static void main (String args[]) {
        /* printing star pattern 
              ****
              ***
              **
              *
        */

        int n = 4;
        for(int i = 1; i<=4; i++) {

            for(int j = 1; j<=n ; j++) {
                System.out.print("*");
            }
            n--;
            System.out.println("");
        }
    }
}