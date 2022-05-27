class search {
    public static boolean linearSearch (int arr[], int toSearch) {
        boolean isFound = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toSearch) {
                isFound = true;
            }
        }

        return isFound;

        // if (isFound == true) {
        //     // System.out.println("found");
        //     return true;
        // } else {
        //     // System.out.println("not found");
        //     return false;
        // }
    }

    public static void main (String args[]) {
        int arr[] = {2, 4, 6, 8, 10};
        int basertgyhjk = 5;

        //linearSearch(arr, basertgyhjk);
         
        boolean res = linearSearch(arr, basertgyhjk );
        System.out.println(res);


        // int a = 5;
        // int b=6;
        // sum(a, b);
        // sum(5, 6);
        // int ans = sum(5, 6);
        // System.out.pritnln(ans);

    }

    // static int sun(int a, int b) {
    //     return a+b;
    // }
}