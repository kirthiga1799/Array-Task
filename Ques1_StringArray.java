package com.zoho;

import java.util.Scanner;

public class Ques1_StringArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name : ");
		
		String person = sc.next();
		
		int count=0;
		
		  String[][] family =  
			  		{{"luke", "shaw"},
		            {"wayne", "rooney"},
		            {"rooney", "ronaldo"},
		            {"shaw", "rooney"}};
				 
		  for(String[] target : family) {  //father ku child irukanu pakkurathuku
			  if(target[1].equals(person)) {
				  String child = target[0];
				  
				  for(String[] subtarget : family) { ///child comparison
					  if(subtarget[1].equals(child)) {
						  count++;
					  }
				  }
			  }
		  }
		  System.out.println("No of grandchildren: "+ count);
		  
		  }
		  

}
