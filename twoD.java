class twoD {

    //2-D array----
    public static void main (String[] args) {
        int firstarr[][] = {{2, 4, 5, 6, 7}, {8, 9, 10, 11, 12}};
        int secarr[][] = {{13, 14, 15, 16},{18, 29, 20, 21}};

        System.out.println("First array");
        display(firstarr);
        System.out.println("Second array");
        display(secarr);
    }

    public static void display(int x[][]) {
        for(int row = 0; row < x.length; row++ ) {
            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + " ");
            }
            System.out.println();
        }
    } 

}