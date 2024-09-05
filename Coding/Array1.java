public class Array1 {
    public static void main(String[] args) {
        int[] sequence = {1,2,3,4,5,6,7,8,8,9,9,7,5,5};
        int n = sequence.length;
        for (int num : sequence) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Swapping elements to achieve the desired pattern
        for (int i = 0; i < n / 2; i++) {
            // Swap the last element with the current first position
            swap(sequence, n - 1 - i, 2 * i);
            if (i != (n / 2) - 1) {  // Avoid unnecessary swap in the last iteration
                // Swap the next element with the current second position
                swap(sequence, n - 2 - i, 2 * i + 1);
            }
        }
        for (int num : sequence) {
            System.out.print(num + " ");
        }

    }
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
