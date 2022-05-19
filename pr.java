class pr {

    // public static void display (int x[][]) {
    //    for(int row = 0; row < x.length; row++ ) {
    //        for (int col = 0; col < x[row].length ; col++) {
    //            System.out.print(x[row][col] + " ");
    //        } 
    //        System.out.println();
       
    //     } 
    // }   

   public static void main (String args[]) {
       int arr[][] = {{2, 4, 5, 6, 9}, {11, 23, 45, 67, 89}};

       for (int i = 0; i<5; i++) {
           for(int j = 0; j< 5; j++ ) {
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }

    //    System.out.println("array printing");
    //    display(arr);

   } 
}