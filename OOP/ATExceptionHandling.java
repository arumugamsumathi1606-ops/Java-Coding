package OOP;

public class ATExceptionHandling {
    public static void main(String[] args) {
         double balance = 1000;
            double amount = 2000;
        try {
            if( amount > balance)
            {
                throw new Exception("Insufficient Balance");
                            }
                            System.out.println("Transaction successful. Amount: " + amount); }
           
              
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }
    }
}
