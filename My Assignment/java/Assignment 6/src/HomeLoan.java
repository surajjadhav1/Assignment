package bank;
public class HomeLoan extends Loan
{	

	public HomeLoan(double prin, float prd)
	{
		super(prin, prd);
	}

	public double getRate()
	{
	  double rate;
	  if(getPrinciple()<=2000000)
		{
		return rate=10;
		}
	   return rate=11;
	}
}
