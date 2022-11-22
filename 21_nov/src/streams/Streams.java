package streams;

import java.io.*;

public class Streams {

	public static void main(String[] args) throws IOException {
		
		// TWO TYPES OF STREAM
		
		// byte stream
			// 1. input
			// 2. output
		// char stream
			// 1.read stream
			// 2. writer stream
		
		// InputStream is an abstract class
		/*	-> FileInputStream
			-> ByteArrayInputStream
			-> ObjectInputStream
			InputStream is = new FileInputStream() / new ByteArrayInputStream() / new ObjectInputStream()
		methods
		
			read() / read(byte[] array) / available() / mark() / reset() / markSupported() / skips() / close()
		*/
		
		InputStream is = new FileInputStream("D://sample.txt"); 
		System.out.println("Total Characters : "+ is.available()); 
		byte[] data = new byte[is.available()];
		is.mark(5);
		is.read(data);
		//System.out.println(is.read(data, 10, is.available())); // after offset/space (10) then it reads the value 
		
		String str = new String(data);
		System.out.println(str);
		
		is.close();

	}

}
