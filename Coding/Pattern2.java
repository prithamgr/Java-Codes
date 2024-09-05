public class Pattern2 {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int n = a.length;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(i < n - 1 - i || (i == n - 1 - i && j < n - 1 - j))
                {
                    int temp = a[i][j];
                    a[i][j] = a[n -1 - i][n - 1 - j];
                    a[n - 1 - i][n - 1 - j] = temp;
                }
                
            }
        }
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}

/*
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 
 * 9 8 7
 * 6 5 4
 * 3 2 1
 */

