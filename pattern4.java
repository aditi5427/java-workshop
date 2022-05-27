class pattern4 {
    public static void main (String args[]) {
        /*
<<<<<<< HEAD
            printing pattern:--
            ***********
             *********
              *******
               *****
                ***
                 *
        

            int n = 5;
            for (int i = 0; i<=5; i++) {
                for (int j = 1; j<=i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k<=n; k++) {
                    System.out.print("*");
                }
                for(int l = 1; l<=n; l++) {
                    System.out.print("*");
                }
                n--;
                System.out.println();
            }
        */

        /*
          printing pattern:--
                *
               **
              ***
             ****
            *****
           ******
           ******
            *****
             ****
              ***
               **
                *
        

        int a = 5;
        for (int i = 0; i<=5; i++) {
            for (int j = 1; j<=a; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k<=i; k++) {
                System.out.print("*");
            }
            a--;
            System.out.println();
        }  

        int b = 5;
        for (int l = 0; l<=5; l++) {
            for (int m = 1; m<=l; m++) {
                System.out.print(" ");
            }
            for (int n = 0; n<=b; n++) {
                System.out.print("*");
            }
            b--;
            System.out.println();
        }
    }

    */

        int m = 5;
        for (int i = 0; i<=5; i++) {
            for (int j = 1; j<=m; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k<=i; k++) {
                System.out.print("*");
            }
            for (int l = 1; l<=i; l++) {
                System.out.print("*");
            }
            m--;
            System.out.println();
        }
        int n = 5;
        for (int a = 0; a <= 5; a++) {
            for (int b = 1; b<=a; b++) {
                System.out.print(" ");
            }
            for (int c = 0; c<=n; c++) {
                System.out.print("*");
            }
            for(int d = 1; d<=n; d++) {
                System.out.print("*");
            }
            n--;
=======
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
>>>>>>> 225a09695dfa324bdeb748d74c2284aaa83714c1
            System.out.println();
        }
    }
}