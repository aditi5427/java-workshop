class twodime {
    //-----2D ARRAY-----
    /*
    public static void main (String args[]) {
        int arr[][] = {{1, 3, 4, 6, 9}, {7, 2, 5, 10, 11}};

        for(int i = 0; i<5 ; i++ ) {
            for(int j = 0; j<5; j++ ) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    */

    public static void main (String[] args) {
        int arr[] = {3 ,4 , 5, 6, 7};
        change(arr);

        for(int y:arr) {
            System.out.print(y + "  ");
        }

    }
    public static void change (int x[]) {
        for(int count = 0; count < x.length; count++) {
            x[count]+=5;
        }
    }
}

