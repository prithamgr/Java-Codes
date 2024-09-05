import java.util.Scanner;

public class SomePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 1;
        for(int i = 0 ; i < n ; i++)
        {
            int k = c;
            for(int j = 0 ; j < n ; j++)
            {
                System.out.print(k++ +" ");
            }
            if(n % 2 == 1)
            {
                if(i < n/2)
                {
                    c = c + (n*2);
                }
                else if(i > n/2)
                {
                    c = c - (n*2);
                }
                else{
                    c = c - n;
                }
            }
            else
            {
                if(i < (n/2)-1)
                {
                    c = c + (n*2);
                }
                else if(i > (n/2) - 1)
                {
                    c = c - (n*2);
                }
                else{
                    c = c + n;
                }
            }
            System.out.println();
        }
        sc.close();
    }

}
