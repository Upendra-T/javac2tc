package prog2;

import java.util.Scanner;

public class TrianglePrint {
	public static void main(String args[])   
	{ 
	int i, j, row;
	Scanner sc= new Scanner(System.in);
	row=sc.nextInt();
	//outer loop for rows  
	for(i=0; i<row; i++) {   
	//inner loop for columns  
	   for(j=0; j<=i; j++)   {   
	//prints @ symbol  
	      System.out.print("@ ");   
	    }   
	//throws the cursor in a new line after printing each line  
	   System.out.println();   
	  }   
	}   
}
