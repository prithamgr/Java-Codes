public class WordPattern {
    public static void main(String[] args) {
        String a = "welcometozoho";
        int length = a.length();
        int numLines = 3;  

        for (int i = 0; i < numLines; i++) {
            int start = i * 5; 
            int end = Math.min(start + 5, length);

            for (int j = start; j < end; j++) {
                System.out.print(a.charAt(j));
            }
            System.out.println();
        }
    }
}
