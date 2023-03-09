package com.gouri.demo.practice;

public class BreakDemo {

	
	public static void main(String[] args) {
		System.out.println(">>>>>>>>>FOR-BREAK<<<<<<<<<<");
		for(int i=1; i<6; i++)
		{
		  if(i==4)
		  {
			  break;
		  }
		  System.out.println(i);
		}
		System.out.println(">>>>>>>>>WHILE-BREAK<<<<<<<<<<");
		 int i=1;
		 while(i<6)
		 {
			 if(i==4)
				 break;
			 System.out.println(i);
			 i++;
		 }
	}
}
