package streams;

import java.io.*;
import java.util.Scanner;

public class OutputStreamEx {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in);OutputStream os = new FileOutputStream("OutputStream.txt")) {
			
			String content; 
			System.out.println("Enter data:");
			content = sc.nextLine();
			byte b[] = content.getBytes(); 
			os.write(b);
			os.flush();// clear the stream
			  
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Data Saved");
		}
	}

}
