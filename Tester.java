
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
        
        BankAccount ba = new BankAccount("Bob", 1500, 45);
        SavingsAccount sa = new SavingsAccount( "Jane", 1000, 0.07, 5 );
        BankAccount ba2 = new BankAccount("Sam", 5000, 42);
        
        b.addAccount( ba );
        b.addAccount( sa );
        b.addAccount( ba2 );
        
        System.out.println();
        //System.out.println( b );
        
        
        BankAccount[] accounts = sortByAccountNumber( b );
        for( int i = 0; i < accounts.length; i++)
        {
            System.out.println( accounts[i] );
        }
        
    }
    
    public static BankAccount[] sortByAccountNumber( Bank b )
    {
        BankAccount[] accounts = b.getAccounts();
        
        for( int low = 0; low < accounts.length - 1; low++)
        {
            for( int high = low + 1; high < accounts.length; high++)
            {
                if( accounts[low].getAccountNumber() > accounts[high].getAccountNumber() )
                {
                    BankAccount temp = accounts[low];
                    accounts[low] = accounts[high];
                    accounts[high] = temp;
                }
            }
        }
        
        return accounts;
    }
}
