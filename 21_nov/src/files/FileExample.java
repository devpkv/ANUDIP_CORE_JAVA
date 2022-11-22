package files;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		 
		File f = new File("D://sample.txt");
		boolean result = f.createNewFile();
		if(result)
		{
			System.out.println("Created successfully created.");
			
		}
		else
			System.out.println("Try again! or File already created");
		
		//System.out.println(f.delete()); to delete files
	}

}


// 