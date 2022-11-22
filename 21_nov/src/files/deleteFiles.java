package files;
import java.io.*;
import java.util.Scanner;
public class deleteFiles {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name");
		String str = sc.next();
		
		File f = new File("D://"+str);
		boolean result = f.delete();
		if(result)
		{
			System.out.println("File Deleted !");
		}
		else 
			System.out.println("Wrong file name, try again with cirrect file name."); 
		  
		sc.close();

	}

}
