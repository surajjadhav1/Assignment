import bank.*;
import java.util.Scanner;
class Assignment6
{

	public static void main(String[] args)
	{
	   Scanner s=new Scanner(System.in);

	   System.out.println("Enter Principle=");
	   double principle=s.nextDouble();

	   System.out.println("Enter Period=");
	   double period=s.nextDouble();

	  HomeLoan h=new Homelone(principle,period);
	  PersonalLoan P=new PersonalLoan(principle,period);

	
	   System.out.println("Emi of Home lone="+h.getEmi());
	   System.out.println("Emi of Personal lone="+p.getEmi());

	}


}
