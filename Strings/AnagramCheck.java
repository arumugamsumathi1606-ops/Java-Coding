import java.util.Arrays;
public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1, ch2))
        {
            System.out.println("The strings are anagrams.");
        }
        else
        {
            System.out.println("The strings are not anagrams.");
        }

    }
}