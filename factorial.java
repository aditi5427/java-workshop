class factorial {
    public static void main (String args[]) {
        int n = 99;
        int primeNos[] = { 2, 3,  7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 51, 53, 57, 59, 61, 67, 71, 73, 79, 83, 87, 97};

        // for (int i = 0; i < primeNos.length; i++ ) {
        //     System.out.print(primeNos[i] + " ");
        // }
        // System.out.println();

        for (int i = 0; i < primeNos.length; i++) {
            if (n % primeNos[i] == 0) {
                System.out.println("divisible by " + primeNos[i]);
            }
        }
                    
    }
    
}