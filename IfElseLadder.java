package com.gouri.demo.practice;

public class IfElseLadder {

	public static void main(String[] args) {
      System.out.println("Grade is:" +GradeResolver(77));
	}

	private static String GradeResolver(int marks) {
		
		if(marks>=50 && marks<=60)
		{
			return " B Grade";
		}
		else if(marks>=60 && marks<=70)
		{
			return " A Grade";
		}
		else 
		{
			return "first class with distinction";
		}
		
	}

}
