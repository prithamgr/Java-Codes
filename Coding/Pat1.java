
public class Pat1{
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1;i <= n ; i++)
        {
            for(int j = 1 ; j <= i ; j++)
            {

                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= n ; j++)
            {
                if(j > i){
                    System.out.print(j +" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}