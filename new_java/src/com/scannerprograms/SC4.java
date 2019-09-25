package com.scannerprograms;

import java.util.Scanner;

public class SC4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a no");
		int i= sc.nextInt();
		String dummy=sc.nextLine();//it is used to read the newline character
		System.out.println("Enter a name");
		String s= sc.nextLine();
		System.out.println("good bye");
		sc.close();//to close the scanner
	}
}
