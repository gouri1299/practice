package com.gouri.demo.practice;

import java.util.Scanner;

public class SwitchDemo {

	private static Scanner sc;

	public static void main(String[] args) {
     
		System.out.println("Enter the size of T-shirt");
		sc = new Scanner(System.in);
		int input=sc.nextInt();
		
		switch(input){
		case 28:
			System.out.println("size is small");
			break;
		case 32:
			System.out.println("Size is medium");
			break;
		case 40:
			System.out.println("Size is large");
			break;
			
		default:
			System.out.println("Invalid size");
		}
		
	}

}
