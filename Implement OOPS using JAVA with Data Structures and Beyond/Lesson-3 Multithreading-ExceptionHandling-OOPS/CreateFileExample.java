package Thread_Exception;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {

	public static void main(String[] args) {
		try {
			//String currentDirectory = System.getProperty("user.dir");
			//System.out.println("The current working directory is " + currentDirectory );
			File myFile = new File("Simplilearn.txt");//("C:\\Users\\VASUKI PR\\git\\Project\\Simplilearn")
			if(myFile.createNewFile()) {
				System.out.println("File was created successfully : "+myFile.getName());
			}
			if(myFile.exists()) {
				System.out.println("Your created file was "+myFile.getName());
			}
			else {
				System.out.println("File already exits");
			}
		}
		catch(IOException e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
		}
	}
