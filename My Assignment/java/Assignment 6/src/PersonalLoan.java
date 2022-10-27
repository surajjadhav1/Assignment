package bank;
public class PersonalLoan extends Loan
{	
    public PersonalLoan(double prin, float prd)
	{
		super(prin, prd);
	}

	public double getRate()
	{
	  double rate;
	  if(getPrinciple()<=500000)
		return rate=15;
	   return rate=16;
	}
}
