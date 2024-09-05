
import java.util.Arrays;
import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,1,2};
        int[] b = new int[]{5,6,7,4,4};
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < a.length ; i++)
        {
            set.add(a[i]);
        }
        for(int i = 0 ; i < b.length ; i++)
        {
            set.add(b[i]);
        }
        int n = set.size(); 
        int arr[] = new int[n]; 
  
        int i = 0; 
        for (int x : set) 
            arr[i++] = x;
        
        System.out.print(Arrays.toString(arr));
    }
}
