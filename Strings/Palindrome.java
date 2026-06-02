public class Palindrome {
    public static void main(String[] args) {
        String s = "MADAM";
        String Reversed = " ";
        for (int i = s.length()-1 ; i>=0 ; i--)
        {
            Reversed = Reversed + s.charAt(i);

        }
        System.out.println(Reversed);
       if(s.equalsIgnoreCase(Reversed.trim()))
       {
        System.out.println( "The given string is a palindrome");
       }
       else
       {
        System.out.println("The given string is not a palindrome");
      
       }
    }
}
