class Account 
{
	private String accHoldName;
	private long accNo;
	private double balance;

	Account(String accName,long aNo,double bal)
	{
		this.accHoldName=accName;
		this.accNo=aNo;
		this.balance=bal;
	}
	public String getName()
	{
		return accHoldName;
	}
	public  void setName(String accName)
	{
		this.accHoldName=accName;
	}
	public long getAccountNo()
	{
		return accNo;
	}
	public  double getBalance(int acNo)
	{
		if(this.accNo==acNo)
		{
		return balance;
		}
		else
		{
			System.out.println("Inccorect Acount Number");
			return -1;
		}
	}
	public void setBalance(int acNo,double newBal)
	{
		if(this.accNo==acNo)
		{
		  this.balance=newBal;
		}
		else
		{
			System.out.println("Invalis Account Number");
		}
	}
	public void withDrawl(long acNo,double newAmt)
	{
		if(this.accNo==acNo)
		{
			if(this.balance>=newAmt)
			{
	           this.balance=newAmt;
			   System.out.println(newAmt+"Amount is Withdrawk Success");
			}
			else
			{
				System.out.println("Insufficient Balnace");
			}
		}
			else
			{
				System.out.println("Invalid Accunt Number");
			}
		}
	public void accDetails()
	{
		System.out.println("Acc Holder Name"+accHoldName);
        System.out.println("Acc Number"+accNo);
		System.out.println("Acc balance"+balance);
	}
}
