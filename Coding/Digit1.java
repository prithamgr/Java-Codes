public class Digit1{
    public static void main(String[] args) {
        String s = "a6b40c20";
        int num = 0;
        int n = s.length();
        char c ='0';
        for(int i = 0 ; i < n ; i++)
        {
            if(Character.isDigit(s.charAt(i)) == false)
            {
                String a = String.valueOf(c);
                System.out.print(a.repeat(num));
                c = s.charAt(i);
                num = 0;
            }
            else if(Character.isDigit(s.charAt(i)) == true){
                num = num * 10 + Character.getNumericValue(s.charAt(i));
            }
        }
        String a = String.valueOf(c);
        System.out.print(a.repeat(num)); 
    }
}