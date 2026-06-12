package OOP;

public class ATInheritance {
    String name;

    public void getLogin()
    {
        System.out.println( name + " Logged in successfully");
    }
    public static class premiumaccount extends ATInheritance
    {
        public void getPremiumAccess()
        {
            System.out.println(name + " is accessing premium account");
        }
    }
    public static void main(String[] args) {
        // ATInheritance user1 = new ATInheritance();
        // user1.name = "John";
        // user1.getLogin();

        premiumaccount premiumUser = new premiumaccount();
        premiumUser.name = "John";
        premiumUser.getLogin();
        premiumUser.getPremiumAccess();
        
    }
    
}

//Inheritance chilkd class can inherit the properties of parent class using extends keyword. It is used to achieve code reusability and method overriding. It is a mechanism in which one object acquires all the properties and behaviors of a parent object. The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse the fields and methods of the parent class, and you can also add new fields and methods to the child class. This promotes code reusability and establishes a natural hierarchical relationship between classes.
