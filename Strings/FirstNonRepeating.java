
import java.util.HashMap; 
    public class FirstNonRepeating
     { public static void main(String[] args) 
        { String s = "PROGRAMMING";
         HashMap<Character, Integer> map = new HashMap<>();
          // Step 1: Count each character 
          for(int i = 0; i < s.length(); i++)
          {
             char c = s.charAt(i); if(map.containsKey(c))
             { 
                map.put(c, map.get(c) + 1); 
            }
             else
                 { 
                    map.put(c, 1);
                 }
                 
                }
                 // Step 2: Find first with count 1
                  for(int i = 0; i < s.length(); i++) 
                    {
                         char c = s.charAt(i); 
                         if(map.get(c) == 1)
    { System.out.println( "First non-repeating: " + c); return;

     }
     }
     }
     }
    
