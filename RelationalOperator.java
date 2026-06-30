public class RelationalOperator {
    public static void main(String[] args) {
           int age = 25;
//>
System.out.println(age > 18);
//<
System.out.println(10 < 5);
//AND
boolean hasLicense = true;
System.out.println(age >= 18 && hasLicense);
//Boolean
boolean email = false;
boolean mobile = true;

System.out.println(email || mobile);

//!=
boolean active = true;

System.out.println(!active);
    }
    
}
