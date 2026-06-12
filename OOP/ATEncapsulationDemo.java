package OOP;

public class ATEncapsulationDemo {
    private double balance;

    public double getBalance()// Data hiding - balance is private and can only be accessed through getter and setter methods
     {
        return balance;
    }

    public double setBalance(double amount) {
        if (amount > 0) {
            balance = amount;
        }
        return balance;
    }
    

public static void main(String[] args)
{
    ATEncapsulationDemo account = new ATEncapsulationDemo();
    System.out.println(account.setBalance(1000000));
    System.out.println(account.getBalance());
}
}


//Encapsulation Story:
// Think of an ATM card:
// 1. YOur bank balance is hidden (Provate)
// 2. You can check balance (getter/reader method)
// 3. You can deposit/withdraw money (setter)
// 4. Nobody can change your balance without your permission (data hiding) - private
// 5. control access (public)

//Encapsulation
//Wrapping data and methods together into a class and resticting direct access to data using pricate variables. Access is given to public getters and setters

//In my TestCraft Fremework
//DriverFactory class encapsulates the WebDriver and nobody can access directly - they use getDriver() method only. 
// this prevents driver manipulation.
