
import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 1;
        int inc = 2;
        int inc1 = 1;
        int store2 = inc;
        for(int i = 0 ; i < n ; i++)
        {
            int store = val;
            inc = store2 + i;
            for(int j = 0 ; j < n; j++)
            {
                System.out.print(val+" ");
                if(inc > n)
                    inc--;
                if(j >= n - i - 1)
                {
                    val = val + inc;
                    inc--;
                }
                else
                {
                    val = val + inc;
                    inc++;
                }
            }
            val = store + inc1;
            inc1++;
            System.out.println();
        }
        sc.close();
    }
}


/*
1  3  6  10  15
2  5  9  14  19
4  8  13 18  22
7  12 17 21  24
11 16 20 23  25
 */
