package Seleniumviamaven;

import java.util.Scanner;

public class TestResults {

	public static void main(String[] args) {
		
		System.out.println("Enter your test score");
	     Scanner scanner = new Scanner(System.in);
	     double score = scanner.nextDouble();
	
	     
	     char grade;
	     
	     if(score < 50){
	     grade='A';
	     }
	     else if(score < 80){
	       grade ='B';
	     }
	     else{
	     
	       grade = 'C';
	     }
	     System.out.println("your grade is  "+ grade);
	     scanner.close();
	  }
}
	


