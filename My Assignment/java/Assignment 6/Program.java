import bank.*;
import java.util.Scanner;
class Program
{

	public static void main(String[] args)
	{

	//double pri = Double.parseDouble(args[0]);	
	//float pr = Float.parseFloat(args[1]);	

	   Scanner s=new Scanner(System.in);

	   System.out.println("Enter Principle=");
	   double pri=s.nextDouble();
	   System.out.println("Enter Period=");
	   float pr=s.nextFloat();

	   Loan h=new HomeLoan(pri,pr);
	   Loan p=new PersonalLoan(pri,pr);
	
	   System.out.println("Emi of Home lone= " +h.getEmi());
	   System.out.println("Emi of Personal lone= " +p.getEmi());

	}

}
