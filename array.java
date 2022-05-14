class array {
    public static void main (String args[]) {
        int kutta[] = new int[10]; // {1, 2 ... 10} {26,27... 36}
       
        // for (int i = 0; i < 10; i = i + 1) {
        //     kutta[i] = i+26; // kutta[0] = 26;  kutta[1] = 27
        // }


        for (int i = 1; i <= 10; i = i + 1) { // i < 11
            kutta[i-1] = 25+i; // kutta[0] = 26 //kutta[1] = 27... kutta[8] = 34 // kutta[9] = 35
        }

        System.out.println(kutta[0]);
        System.out.println(kutta[1]);
        System.out.println(kutta[8]);
        System.out.println(kutta[9]);
    }   
}