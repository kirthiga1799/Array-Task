package com.zoho;

import java.util.Scanner;

public class Ques3_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");

		String str = sc.next();

		if (str.length() % 2 != 0) {

			for (int i = 0; i < str.length(); i++) { // row start panrathu

				int k = str.length() - 1 - i; // cross start ku

				for (int j = 0; j < str.length(); j++) { // column

					if (j == i || k == j)

						System.out.print(str.charAt(j));

					else
						System.out.print("");
				}
				System.out.println(" ");
			}
		} else
			System.out.println(0);
	}

}
