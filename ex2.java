//ex2.java
import java.util.Scanner;


public class ex2{
	public static void main(String args[])
	{
	String investment, investment2;
	int share, share2;
	float  price, price2; 
	Scanner input = new Scanner(System.in);	
		
		
		System.out.print("Please enter the type of the first investment: ");
		investment=input.nextLine();
			
		System.out.print("Please enter the number of shares purchased: ");
		share=input.nextInt();
			
		System.out.print("Please enter the share price: ");
		price=input.nextFloat();
		
		
		System.out.print("\n\n\nPlease enter the type of the second investment: ");
		input.nextLine();
		investment2=input.nextLine();
			
		System.out.print("Please enter the number of shares purchased: ");
		share2=input.nextInt();
			
		System.out.print("Please enter the share price: ");
		price2=input.nextFloat();
		
		
		System.out.println("\n\n\n\t\t\t\t==============================\n" +
			"\t\t\t\t\t\tInvestment Details\n\t\t\t\t==============================" + "\n\nInvestment Type\t #Shares\t Share Price\n" +
						String.format("%-20s%-10d%.6f\n%-20s%-10d%.6f",investment,share,price ,investment2,share2,price2));
}
}