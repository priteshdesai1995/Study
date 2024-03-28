package section12_Inheritance;

class AccountM
{
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;
    
    public AccountM(String acc,String n,String add,String phno,String dob)
    {
        accNo=acc;
        name=n;
        address=add;
        this.phno=phno;
        this.dob=dob;
        balance=0;
    }
    public String getAccNo(){return accNo;}
    public String getName(){return name;}
    public String getAddress(){return address;};
    public String getPhno(){return phno;}
    public String getDOB(){return dob;}
    public long getBalance(){return balance;}
    
    public void setAddress(String add)
    {
        address=add;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
            
}

class SavingsAccount extends AccountM
{
    public SavingsAccount(String acc, String n, String add, String phno, String dob) {
		super(acc, n, add, phno, dob);
		// TODO Auto-generated constructor stub
	}
	public void deposit(long amt)
    {
        balance+=amt;
    }
    public void withdraw(long amt)
    {
        balance-=amt;
    }
}

class LoanAccount extends AccountM
{
    public LoanAccount(String acc, String n, String add, String phno, String dob) {
		super(acc, n, add, phno, dob);
		// TODO Auto-generated constructor stub
	}
	public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }
}

public class Account 
{
    public static void main(String[] args) 
    {
        SavingsAccount sa=new SavingsAccount(null, null, null, null, null);
        LoanAccount la=new LoanAccount(null, null, null, null, null);
        la.balance=1000;
        sa.deposit(1000);
        sa.withdraw(500);
        sa.getBalance();
    }   
}