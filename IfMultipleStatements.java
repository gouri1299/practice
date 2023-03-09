package com.gouri.demo.practice;

public class IfMultipleStatements {

	public static void main(String[] args) {
		
       String result= isValidVoter3(15,"india")? "valid voter":"invalid voter";
       System.out.println(result);
	}
	
	public static boolean isValidVoter(int age,String country,int hasAdhar) {
		
		if(age>=18 && country.equalsIgnoreCase("India")&& hasAdhar > 0)
		{
			return true;
		}
		
		return false;
		
		
	}
		
	public static boolean isValidVoter2(int age,String country,int hasPan) {
			
		if(age>=18 && country.equalsIgnoreCase("India")|| hasPan > 0)
		{
			return true;
		}
		
		return false;
	}
	
	public static boolean isValidVoter3(int age,String country) {
		
		if(age>=18) {
			
			if(country.equalsIgnoreCase("India"))
				
		    {
			return true;
		    }
		}
		return false;
		}
	}

