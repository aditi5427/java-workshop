class pattern3 {
    public static void main (String args[]) {
        /*
            printing pattern
            *
            **
            ***
            ****
            *****
            *****
            ****
            ***
            **
            *
        */
    
        int n = 8;
      
        for(int k = 1; k<=9; k++) {
            for (int l = 1; l<=k ; l++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
        for(int i = 1; i<=8; i++) {                                                                        
            for (int j = 1; j<=n; j++) {
                System.out.print( "*");
            } 
            n--;
            System.out.println(" ");
                                                                                        
        }
    }
} 