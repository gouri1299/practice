package com.gouri.demo.practice;

public class BreakContinueDemo2 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
		{
			if(i==5)
			break;
			
			else if(i==7)
			continue;
			
			System.out.println("i= "+i);
		}

	}

}


