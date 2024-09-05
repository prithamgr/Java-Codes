public class SumofDigits {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3 ,4 ,5,3 };
        int i = 0;
        int sum = 0;
        while(i < a.length){
            sum = sum + a[i];
            i++;
        }
        System.out.println(((sum - 1) % 9) + 1);
    }
}
