package Thread_Exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class FilehandelingExample {

	public static void main(String[] args) {
		try {
		
		//create a file
		File obj = new File("File.txt");
		if(obj.createNewFile()) {
			System.out.println("Your file was created: "+obj.getName());
		}
		else {
			System.out.println("The file already exists: "+obj.getName());}

		//Write to a File
		FileWriter obj2 = new FileWriter("File.txt");
		obj2.write("Created a File using File handeling in java ");
		//obj2.close();
		System.out.println("You have successfully wrote in your file");
		
		//Append to a file
		String path = System.getProperty("user.dir")+"\\File.txt";
		String Text = " Append using File Handleing was done.";
		//Files.write(Paths.get(path), Text.getBytes(), StandardOpenOption.APPEND);
		obj2.write(Text);
		obj2.close();
		System.out.println("Your File was was successfully appended.");	

		//Read a file
				Scanner sc = new Scanner(obj);
				while(sc.hasNextLine()) {
					String Read = sc.nextLine();
					System.out.println("The File is Readed: "+Read);	
				}
		}
		catch(IOException e) {
			System.out.println("There is an error");
			e.printStackTrace();
		}
	}

}
