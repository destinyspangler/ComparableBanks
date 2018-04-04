
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args)
    {
        Bank b = new Bank( "Bank of OSSM", 2 );
        
        BankAccount ba = new BankAccount("Bob", 1500);
        SavingsAccount sa = new SavingsAccount( "Jane", 1000, 0.07 );
        BankAccount ba2 = new BankAccount("Sam", 5000);
        
        b.addAccount( ba );
        b.addAccount( sa );
        b.addAccount( ba2 );
        
        System.out.println();
        System.out.println( b );
        
    }
}
