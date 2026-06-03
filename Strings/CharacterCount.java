import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String s = "PROGRAMMING";
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i=0 ; i<s.length() ; i++)
        {
char ch = s.charAt(i);
if(hash.containsKey(ch))
{
    hash.put(ch, hash.get(ch) +1);

}
else
{    hash.put(ch, 1);
        }
    }
    System.out.println("Character count in the string: " + hash);
}
}
