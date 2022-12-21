package com.accenture.passwordgenAnswer;

import java.util.Random;
import java.util.Scanner;

class PasswordGenerator {
	int i=0;
	int random;
	int len;
	char upperCase;
	char lowerCase;
	char numbers;
	char symbols;
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
	
	StringBuffer pw = new StringBuffer();
	
	void input() {
		System.out.println("Enter the length of the password");
		len = sc.nextInt();
		System.out.println("Do you want UPPERCASE characters? (y/n)");
		upperCase= sc.next().toLowerCase().charAt(0);
		System.out.println("Do you want lowercase characters? (y/n)");
		lowerCase= sc.next().toLowerCase().charAt(0);
		System.out.println("Do you want numbers? (y/n)");
		numbers= sc.next().toLowerCase().charAt(0);
		System.out.println("Do you want special symbols? (y/n)");
		symbols= sc.next().toLowerCase().charAt(0);
	}
	
	void generator() {
		while (i<len) {
			random = rand.nextInt(0,4);
			switch(random) {
			case 1: if (upperCase=='y') {
				int x = rand.nextInt(65, 91);
	
					pw.append((char)(x));
					i++;
				
			}
			case 2: if (lowerCase=='y') {
				int x = rand.nextInt(97, 123);
				pw.append((char)(x));
				i++;
			}
			case 3: if (numbers=='y') {
				int x = rand.nextInt(48, 58);
				pw.append((char)(x));
				i++;
			}
			case 4: if (symbols=='y') {
				int x = rand.nextInt(33, 43);
				pw.append((char)(x));
				i++;
			}
			}
			
		}
	}
	
	void display() {
		System.out.println(pw);
	}
}

class startProgram {
	static void start() {
		PasswordGenerator pg = new PasswordGenerator();
		pg.input();
		pg.generator();
		pg.display();
	}
}

public class LaunchPwGen {

	public static void main(String[] args) {

		startProgram.start();
		// your main method should contain as little code as possible 
	}

}
