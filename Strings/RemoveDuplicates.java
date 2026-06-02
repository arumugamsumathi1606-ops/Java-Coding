public class RemoveDuplicates {
    public static void main(String[] args) {
    String s = "Programming";
    String results = " ";
    for (int i=0 ; i<s.length(); i++)
{
char c = s.charAt(i);

if(!results.contains(String.valueOf(c)))
{
    results +=c;
}
System.out.println("String after removing duplicates: " + results);
}
}
}
    

