package prog2;

import java.util.Scanner;

public class CountOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		int c[]= new int[a];
		for(int i=0;i<a;i++){
			c[i]=sc.nextInt();
		}
		b=sc.nextInt();
		int d[]= new int[b];
		for(int i=0;i<b;i++){
			d[i]=sc.nextInt();
		}
		int count;
		for(int i=0; i<d.length; i++) { 
			count=0;
			   for(int j=0; j<c.length; j++)   {   
			        if(d[i]==c[j]){
			        	count=count+1;
			        }
			    }   
			   if(count>0){
				   System.out.println(count);
			   }
			   else{
				   System.out.println("NOT PRESENT");
			   }
		  
			  }   
			}   
}
