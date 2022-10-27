import series.*;
import java.util.Scanner;
class Program {
 
	public static double FinalEmi(Loan temp){
		if (temp instanceof Discountable p){
			return temp.getEmi() * p.getDiscount();
		}
		 if (temp instanceof Taxable t){
			return temp.getEmi() * t. getTax();
		}
		return 0;
	}

public static void main(String[] args){


	//double i = Double.parseDouble(args[0]);
	//float p = Float.parseFloat(args[1]);

	Scanner s=new Scanner(System.in);

	System.out.println("Enter Principle=");
	double pri=s.nextDouble();
	System.out.println("Enter Period=");
	float pr=s.nextFloat();


	Loan pl =  CallLoan.CallPersonal(pri, pr);
	Loan hl =  CallLoan.CallHome(pri, pr);
	
	System.out.printf("emi for perosnal is:%.2f%n",pl.getEmi());

	System.out.printf("emi for HomeLoan is:%.2f%n",hl.getEmi());

	System.out.printf("emi for HomeLoan after discount is is:%.2f%n",FinalEmi(hl));

	System.out.printf("emi for PersonaLoan after Tax is:%.2f%n",FinalEmi(pl));

}



}
