package bank;

public abstract class Loan
{
	protected double principle;
	protected float period;

	public Loan(double principle, float period)
	{
		this.principle=principle;
		this.period=period;
	}

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
