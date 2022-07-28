package LockedMe.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class BusinessLevelOperations {

	//Bubble sort to sort file in ascending order
	protected static String[] sort_sub(String array[], int size){
		String temp = "";
		for(int i=0; i<size; i++){
			for(int j=1; j<(size-i); j++){
				if(array[j-1].compareToIgnoreCase(array[j])>0){
					temp = array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
	

	
	//File listing function
	protected static void listFiles() {
		
		int fileCount = 0;
	    ArrayList<String> filenames = new ArrayList<String>();
	
		File directoryPath = new File(System.getProperty("user.dir"));
		File[] listofFiles = directoryPath.listFiles();
		fileCount = listofFiles.length;
		
		
		System.out.println("\nFiles shown in ascending Order ");
		for (int i = 0; i < fileCount; i++) {
		  if (listofFiles[i].isFile()) {
		    filenames.add(listofFiles[i].getName());
		  } 
		}
		
		String[] str = new String[filenames.size()];
		 
	    for (int i = 0; i < filenames.size(); i++) {
	        str[i] = filenames.get(i);
	    }
		
	    String[] sorted_filenames = sort_sub(str, str.length);
		
		for(String currentFile: sorted_filenames) {
			System.out.println(currentFile);
		}

	}
	//File creation function
	public static void createFile (String fileToBeCreated) {
		File file = new File( (System.getProperty("user.dir") ) + "\\" + fileToBeCreated );
		
		try {
			if (file.createNewFile() ) {
				System.out.println("File was Created Successfully!");
			} else {
				System.out.println("File already exists ");
			}
			
			//Write to a File
			System.out.println("Do you want to write in your file: Y/N");
			Scanner op = new Scanner(System.in);
			String ch = "y";
			ch = op.nextLine();
			if( ch.equalsIgnoreCase("y")){
			System.out.println("Now You can write in tour created file");
			FileWriter obj2 = new FileWriter(file);
			Scanner sc= new Scanner(System.in);
			obj2.write(sc.nextLine());
			System.out.println("You have successfully wrote in your file");
			obj2.close();
			}
			else
				System.out.println("You can continue with othee options :)");
		}
			catch (IOException e) {
				
				e.printStackTrace();
			}
	}
	
	

	//File delete function
	protected static void deleteFile(String fileToBeDeleted) {
		
		File file = new File( (System.getProperty("user.dir") ) + "\\" + fileToBeDeleted );
		
		if(file.exists()) {
			if ( file.delete() ) {
				System.out.println("File deleted successfully!");
			}
		} else {
			System.out.println("Sorry, File wasn't deleted (File Not Found)");
		}
	}
	
	//File search function
	protected static void searchFile(String fileToBeSearched) {
	        
		File file = new File( (System.getProperty("user.dir") ) + "\\" + fileToBeSearched );
		
		//Check whether  file exists or not.
		//If yes then display associated message
		try {
		if(file.exists()) {
			System.out.println("Yup!File found!");
			System.out.println("Read the file");
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String Read = sc.nextLine();
				System.out.println(Read);
			}
		}
			else 
				System.out.println("Sorry, File is not here (File Not Found)");
			}
			catch (FileNotFoundException e) {  
	              
	            System.out.println(e);  }
	            
		/*PrintWriter pw;  
        try {  
            pw = new PrintWriter(fileToBeSearched); //may throw exception   
            pw.println("saved");  
        }  
        // providing the checked exception handler  
        catch (FileNotFoundException e) {  
              
            System.out.println(e);  
        } */
	}


}