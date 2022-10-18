package bank;
public class PersonalLoan extends Loan
{	
       public PersonalLoan()
	{
	   super.principle;
	   super.period;
	}

	public double getRate()
	{
	  double rate;
	  if(getPrinciple()<=500000)
		return rate=15;
	   return rate=16;
	}
}
