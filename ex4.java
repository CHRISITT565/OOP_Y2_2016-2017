//ex4.java

import java.util.Scanner;



public class ex4{
	public static void main (String args[])
	{
		float A, B, M;
	
	Scanner input = new Scanner(System.in);	
		
		System.out.print("Please enter the radious of the torus: ");
		A=input.nextFloat();
		
	    System.out.print("Please enter the cross-sectional radious of the torus: ");
		B=input.nextFloat();
		
		System.out.print("Please enter the mass of the torus: ");
		M=input.nextFloat();
		
	
		System.out.println("\n\n======Results======\n\nMoment of inertia about a diamiter is: "+ String.format("%.3f",(0.125*(4*(A*A)+(5*(B*B))))*M) + "sq m" + 
			"\nMoment of inertia about a vertical axis is: " +String.format("%.3f",((A*A)+((B*B)*0.75))*M) + "sq m" );
		
			
	}
}

