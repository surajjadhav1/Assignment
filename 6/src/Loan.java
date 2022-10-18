package bank;

public abstract class Loan
{
	private double principle;
	private float period;

	public void setPrinciple(double prin)
	{
	   principle= prin;
	} 
	public void setPeriod(float prd)
	{
	   period= prd;
	} 

	public double getPrinciple()
	{
	  return principle;
	}
	public float getPeriod()
	{
	  return period;
	}
	
	public double getEmi()
	{ 
	  return principle*(1+getRate()*period/100)/(12*period);
	}	
	
	public abstract double getRate();

}
