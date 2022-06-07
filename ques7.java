class ques7 {
    public static void main (String args[]) {
        /* i)
            **********
            **********
            **********
            **********
        

            for (int i = 1; i<=4; i++) {
                for (int j = 1; j<=9; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        */ 

        /*
         2)
               1
              222
             33333
            4444444
           555555555
        
            int n = 5;
            for(int i = 1; i <=5; i++) {
                for (int j = 1; j<=n; j++) {
                    System.out.print(" ");
                }
                n--;
                for (int k = 1; k<=i; k++) {
                    System.out.print(i);
                }
                for (int l = 2; l<=i; l++) {
                    System.out.print(i);
                }
                System.out.println();
            }    
        */   

        /* 
            3)
                  1
                 212
                32123
               4321234
              543212345

            
            int n = 5;
            for (int i = 1; i<=5; i++) {
                for (int j = 1; j<=n; j++) {
                    System.out.print(" ");
                }
                n--;
                for (int k = 1; k<=i; k++) {
                    System.out.print(k);
                }
                for (int l = 2; l<=i; l++) {
                    System.out.print(l);
                }
                System.out.println();
            }*/
            int n = 12345;
            int reverse, last;
            reverse = 0;

            while(n!= 0) {
                last = n % 10;
                reverse = reverse*10 + last;
                n = n/10;
            }
            System.out.println(reverse);
            
            
    }
}