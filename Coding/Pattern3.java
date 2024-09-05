public class Pattern3 {
    public static void main(String[] args) {
        int n = 4;
        int c = 0;
        for(int i = 0 ; i < (n*2)-1 ; i++)
        {
            for (int j = 0; j < (n * 2) - 1; j++)
            {
                c = n;
                if(i == 0 || j == 0 || i == (n * 2) - 2 || j == (n * 2) - 2)
                {
                    System.out.print(c+" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            c--;
            System.out.println();
        }
    }
}
