package com.gouri.demo.practice;

public class BreakContinueDemo {

	public static void main(String[] args) {
		for(int i=1; i<10; i++)
		{
			if(i==7)
				break;
				//continue;
			System.out.println("i s printed-"+i);
			
			for(int j=1; j<=5; j++) 
			{
			    if(j==3)
				 //break;
			     //continue;
			  System.out.println("j-"+j);	
			}
		}

	}

}
