public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "Hello Java World";
        String[] words = s.split(" "); //Hello Java World
        //Split - break  the string when space is encountered

        String result = "";

        for (int i=0 ; i<words.length ; i++)
        {
            //Run each word
            String word = words[i];
            String reversed = "";
            for (int j=word.length()-1 ; j>=0 ; j--)
            {
                reversed = reversed + word.charAt(j);
            }
            result = result + reversed + " ";
        }

System.out.println("String after reversing each word: " + result.trim());
    }
    
}
