package files;
import java.io.*;
import java.util.Scanner;
public class FileHanding {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some string");
		String str = sc.nextLine();
		
		FileWriter fw = new FileWriter("D://sample.txt");
		fw.write(str);
		fw.close();
		
		
		FileReader fr = new FileReader("D://sample.txt");
		
		char data[] = new char[100];
		
		fr.read(data);
		
		System.out.println(data);
		fr.close();
		sc.close();

	}

}
