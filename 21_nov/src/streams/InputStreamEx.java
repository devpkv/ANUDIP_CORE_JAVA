package streams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {

	public void file() throws IOException {
		
		InputStream is = new FileInputStream("D://sample1.txt"); 
		System.out.println("Total Characters : "+ is.available()); 
		byte[] data = new byte[is.available()];
		is.mark(5);
		is.read(data);
		//System.out.println(is.read(data, 10, is.available())); // after offset/space (10) then it reads the value 
		
		String str = new String(data);
		System.out.println(str);
		
		is.close();
	}
	public static void main(String[] args) {
		
		InputStreamEx ise = new InputStreamEx();
		
		try {
			ise.file();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
