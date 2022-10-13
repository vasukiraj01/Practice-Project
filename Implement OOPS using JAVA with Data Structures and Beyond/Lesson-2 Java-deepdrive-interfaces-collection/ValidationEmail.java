package simplelearn;

import java.util.ArrayList;
import java.util.Scanner;

public class ValidationEmail {

	public static void main(String[] args) {
		ArrayList<String> Employeemailid = new ArrayList<String>();
		 
		    Employeemailid.add("yash.varm2@yahoo.com");
	        Employeemailid.add("max.mayfield@yahoo.com");
	        Employeemailid.add("eleven@yahoo.com");
	        Employeemailid.add("lucas.sin@yahoo.com");
	        Employeemailid.add("will@yahoo.com");
	        Employeemailid.add("DusTin@yahoo.com");
	         Scanner input = new Scanner(System.in);
	         System.out.println("Enter email: ");
	         String searchmail = input.nextLine(); 
	         if(Employeemailid.contains(searchmail)){
	             System.out.println( "email ID " + searchmail + " Validate mailId");
	         }
	         else{
	        	 System.out.println("email ID " + searchmail + " InValidate mailId");
	         }
	}
}


	          
	         
	        		