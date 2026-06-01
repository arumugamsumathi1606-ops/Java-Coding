public class ReversedString {
    public static void main(String[] args) {
        String s = "HELLO";
        String Reversed = " ";
        for (int i = s.length()-1 ; i>=0 ; i--)
        {
            Reversed = Reversed + s.charAt(i);

        }
        System.out.println(Reversed);
    }
}        