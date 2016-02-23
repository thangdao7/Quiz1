package com.cisc181.packages;

import java.util.Scanner;

//A program that ask for a quarterback's statistics and calculate his rating.
public class PasserQuarterbackRating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//User prompt
		System.out.println("Please enter the quarterback statistics.");
		
		//Declare new Scanner name input
		Scanner input = new Scanner(System.in);

		//Ask for number of touchdowns
		System.out.println("Number of touchdowns:");
		double TD = input.nextInt();

		//Ask for total yards
		System.out.println("Total yards:");
		double YDS = input.nextDouble();

		//Ask for number of interceptions
		System.out.println("Number of interceptions:");
		double INT = input.nextInt();

		//Ask for number of completions
		System.out.println("Number of completions:");
		double COMP = input.nextInt();

		//Ask for number of passes attempted
		System.out.println("Number of passes attempted:");
		double ATT = input.nextInt();
		
		//Calculate completion %
		double a = (COMP / ATT * 100 - 30) * 0.05;
		
		//Calculate yards per attempt
		double b = (YDS / ATT - 3) * 0.25;
		
		//Calculate touchdown %
		double c = (TD / ATT * 100) * 0.2;
		
		//Calculate interception %
		double d = 2.375 - (INT / ATT * 100 * 0.25);
		
		//Calculate QB rating
		double passerRating = (a + b + c + d ) / 6 * 100;

		//Print quarterback's rating
		System.out.println(passerRating);
		
		
	
				//Passer Rating equation

	}

}
