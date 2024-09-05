public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        // int c = 1;
        // for (int i = 0; i < n; i++) {
        //     int k = c;
        //     for (int j = 0; j < i + 1; j++) {
        //         System.out.print(k +" ");
        //         k = k + (n - j - 1);
        //     }
        //     c = c + 1;
        //     System.out.println();
        // }
        // int c = 1;
        // for (int i = 0; i < n; i++) {
        //     int k = c;
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(k +" ");
        //         if(k >= n)
        //             k = k - n;
        //         k = k + 1;
        //     }
        //     c = c + 1;
        //     System.out.println();
        // }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
