package OOP;

public class ATPolymorphism {
    public void login()
    {System.out.println("Generic login method");}

    public static class AndroidLogin extends ATPolymorphism
    {
        @Override
        public void login()
        {
            System.out.println("Android logged in successfully");
        }
    }
     public static class iOSLogin extends ATPolymorphism
    {
        @Override
        public void login()
        {
            System.out.println("iOS logged in successfully");
        }
    
} 
    public static void main(String[] args) {
ATPolymorphism ATpoly;
ATpoly = new AndroidLogin();
ATpoly.login(); // Android login method - runtime polymorphism - method overriding      
ATpoly = new iOSLogin();
ATpoly.login(); // iOS login method - runtime polymorphism - method overriding

    }
}

        
//same method different classes - method overriding (runtime polymorphism) 
// same method - login
//different bahavoiur - Android / iOS / Generic login