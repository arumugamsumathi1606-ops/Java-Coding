//String Compression using charcter count
public class StringCompression {
    
    public static void main(String[] args)
     { 
        String s = "aaabbbcc"; 
        String result = ""; 
        int count = 1; 
         for(int i = 1; i <s.length() ; i++) 
            {
                 // If same as previous character 
                 if(s.charAt(i) == s.charAt(i-1))
                     { 
                        count ++; 
                        // increase count
                         } else {
                             // Different character found // Add previous char + count to result 
                             result = result + s.charAt(i-1) + count; 
                             count = 1; // reset count
                         }
                        }
                         
                            result = result + s.charAt(s.length() - 1) + count;
                            System.out.println("Compressed string: " + result);

                         }
                        
     }
    