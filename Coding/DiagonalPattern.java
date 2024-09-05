public class DiagonalPattern {
    public static void main(String[] args) {
        int n = 5;  // Size of the pattern (5x5)
        int current = 1;  // Start with number 1

        // Loop to control each diagonal in the matrix
        for (int line = 1; line <= (2 * n - 1); line++) {
            int startRow = line <= n ? 0 : line - n;  // Starting row for current diagonal
            int count = line <= n ? line : (2 * n - line);  // Number of elements in the current diagonal

            // Print leading spaces for formatting
            for (int i = 0; i < n - count; i++) {
                System.out.print("   ");  // Adjust spacing as needed
            }

            // Print the elements in the current diagonal
            for (int j = 0; j < count; j++) {
                System.out.printf("%2d ", current++);
            }

            // New line after each diagonal
            System.out.println();
        }
    }
}
