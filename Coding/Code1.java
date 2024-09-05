
import java.util.Arrays;
import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 1;
        Boolean isP = true;
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            a[i] = sc.nextInt();
            if(a[i] == 0)
            {
                isP = false;
                continue;
            }
            prod *= a[i];
        }
        Arrays.sort(a);
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(a[i]+" ");
        }
        if(!isP)
        {
            for(int i = 0 ; i < n ;i++)
            {
                if(a[i] == 0)
                    a[i] = prod;
                else
                    a[i] = 0;
            }
        }
        else{
            for(int i = 0 ; i < n ; i++)
            {
                a[i] = prod / a[i];
            }
        }
        System.out.print(Arrays.toString(a));
    }
}
