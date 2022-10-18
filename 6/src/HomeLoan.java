package bank;
public class HomeLoan extends Loan
{	
	public HomeLone(double prin, double prd)
	{
	   principle=prin;
	   period=prd;
	}

	public double getRate()
	{
	  double rate;
	  if(getPrinciple()<=2000000)
		return rate=10;
	   return rate=11;
	}
}
