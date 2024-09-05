import java.util.Scanner;

public class BinaryDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        System.out.println((int)Math.log10(input)+1);
        int n = (int)Math.log10(input)+1;
        int[] arr = new int[n];
        int temp = input;
        int max = 0;
        for(int i = n-1; i >= 0; i--){
            arr[i] = temp%10;
            if(max < temp%10)
                max = temp%10;
            temp /= 10;
        }
        
        binaryDecimal(arr, n, max);
        sc.close();
    }

    public static void binaryDecimal(int[] input, int n, int max) {
        System.out.print("Output : ");
        for(int i = 0; i < max; i++){
            StringBuilder value = new StringBuilder();
            for(int j = 0; j < n; j++){
                if(input[j] > 0){
                    value.append(1);
                    input[j]--;
                } else value.append(0);
            }
            System.out.print(Integer.valueOf(value.toString()) + " ");
        }
        System.out.println("\nCount : " + max);
    }
}