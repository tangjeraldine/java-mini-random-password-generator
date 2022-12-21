package com.accenture.passwordgen1;

import java.util.Random;
import java.util.Scanner;

public class passwordGenerator {

	public static void main(String[] args) {
		int length; 
		String pw="";
		char upperCase;
		char lowerCase;
		char numbers;
		char symbols;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter password length (more than 9)");
		length = scan.nextInt();
		
		
		if (length<9) {
			System.out.println("Password is too short");
		} else {
			System.out.println("Do you want UPPERCASE characters? (y/n)");
		upperCase= scan.next().toLowerCase().charAt(0);
		System.out.println("Do you want lowercase characters? (y/n)");
		lowerCase= scan.next().toLowerCase().charAt(0);
		System.out.println("Do you want numbers? (y/n)");
		numbers= scan.next().toLowerCase().charAt(0);
		System.out.println("Do you want special symbols? (y/n)");
		symbols= scan.next().toLowerCase().charAt(0);
			
			for (int i=0; i<=length; i++) {
				// generate ascii here
				Random rand = new Random();
				int random = rand.nextInt(0,4);
				switch(random) {
				case 1: if (upperCase=='y') {
					int r = rand.nextInt(65, 91);
					char letter = (char) r;
					pw = (String) pw+letter;
					i++;
				}
				case 2: if (lowerCase=='y') {
					int r = rand.nextInt(97, 123);
					char letter = (char) r;
					pw = pw+letter;
					i++;
				}
				case 3: if (numbers=='y') {
					int r = rand.nextInt(48, 58);
					char letter = (char) r;
					pw = pw+letter;
					i++;
				}
				case 4: if (symbols=='y') {
					int r = rand.nextInt(33, 46);
					char letter = (char) r;
					pw = pw+letter;
					i++;
				}
				}

			}
		}

		System.out.println(pw);
	}

}
