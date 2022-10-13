package LockedMe.com;

import java.util.Scanner;
import java.io.IOException;

public class LockerPvtLtd {

	public static void main(String[] args) throws IOException {
		int op=0, option=0;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("\n\t             ****************************************");
		System.out.println("\t                     Welcome to LockedMe");
		System.out.println("\t                  By Company Lockers Pvt Ltd. ");
		System.out.println("\n\t                     Glad to have you :)");
		System.out.println("\t              ****************************************");
		System.out.println("        Developer:  Vasuki \n        Company\t:   Company Lockers Pvt. Ltd \n");
		
		while(true)
		{
			System.out.println("\nPlease choose one of the following options ");
			System.out.println("1. List Current Files");
			System.out.println("2. Business Operations");
			System.out.println("3. Close Application");
			try{    
				op = sc.nextInt();
			}
			catch(Exception e)  
             {  
              System.out.println("Null Exception occurred");  
             }         
			
			switch(op)
			{
			case 1: //List function feature to list all files in ascending order.
				BusinessLevelOperations.listFiles();
				break;
			case 2:
				
					System.out.println("\nPlease choose one of the following options ");
					System.out.println("1. Add a File");
					System.out.println("2. Delete a File");
					System.out.println("3. Search for a File");
					try{    
						 option = sc.nextInt();
					}
					catch(Exception e)  
	                  {  
	                   System.out.println("Null Exception occurred");  
	                  }          
					switch(option)
					{
					case 1:
						//Creation of a file takes place
						System.out.println("\nEnter the name of a file to be created ");
						String CreateFile = sc.next();
						
						// Calling the function to create the file and to write a file
						Scanner strInput = new Scanner(System.in);
						BusinessLevelOperations.createFile(CreateFile);
						
						break;
						
					case 2:
						//deletion of a file takes place
						
						System.out.print("Your are about to delete the file\nEnter the name of the File to deleted\n");
						String fileDelete = sc.next();
						// Calling the function to delete the file
						BusinessLevelOperations.deleteFile(fileDelete);
						break;
					case 3:
						//Search for a file takes place
						System.out.println("Input the name of a file to be searched: ");
						String fileSearch = sc.next();
						
						// Calling the function to search the file
						BusinessLevelOperations.searchFile(fileSearch);
						break;
						
				default:
						//In the case of unprecedented input execute this
						System.out.println("\n Opps! Invalid Input,Re-do the process\n");
						break;
				}
			
					break;
			case 3:
				
				//Voluntarily exiting the application
				sc.close();
				System.out.println("\nIt was nice having you here!Good bye.See you again...");
				System.exit(1);
				break;
			
			default:
				//In the case of unprecedented input execute this
				System.out.println("\n\nTry agin! Invalid Input, Select within the range from 1-3\n");
				break;
			
			}
		}
		
	}

}