package randomAccessFile;
import java.io.*;
public class RandomAccessFileEx {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile r = new RandomAccessFile("D://randomfile.txt", "rw");
		
		r.writeChars("Random");
		//r.write(10);
		r.seek(0);
		System.out.println(r.readChar());

	}

}
