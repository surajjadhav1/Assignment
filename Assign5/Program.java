import series.*;
import java.util.Scanner;
public class Program {

	public static void main(String[] args){

	//int x = Integer.parseInt(args[0]);	
	//int y = Integer.parseInt(args[1]);
	//int z = Integer.parseInt(args[2]);
	//int temp = Integer.parseInt(args[3]);

	Scanner s=new Scanner(System.in);

	System.out.println("Enter =");
	int x=s.nextInt();

	System.out.println("Enter =");
	int y=s.nextInt();

	System.out.println("Enter =");
	int z=s.nextInt();

	System.out.println("Enter =");
	int temp=s.nextInt();
	


	Sequence s = SequenceCall.createLinear(x, y);
	Sequence p = SequenceCall.createPower(y);
	System.out.printf("Linera Sequence is:%.2f%n",s.getSum(z));
	System.out.printf("Power Sequence is:%.2f%n",p.getSum(temp));
	}



}
