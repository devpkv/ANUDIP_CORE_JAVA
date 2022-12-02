package threads;
import java.io.*; 

public class RaceCondition {

	public static void main(String[] args) throws IOException {
		
		Thread cf = new Thread() {
			
			public void run() {
				
				try {
					FileWriter fw = new FileWriter("D://RaceCondition.txt");
					String str = "Race Condition Example";
					fw.write(str);
					fw.close();
				} catch(Exception e) {
					System.out.println(e.getMessage());
				}
				
			}
		};
		
		Thread wf = new Thread() {
			
			public void run() {
				try {
					Thread.sleep(2000);
					FileWriter fw = new FileWriter("D://RaceCondition.txt");
					String str = "Race Condition";
					fw.write(str);
					fw.close(); 
				} catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		};
		
		Thread af = new Thread() {
			
			public void run() {
				
				try {
					Thread.sleep(2000);
					FileReader fr = new FileReader("D://RaceCondition.txt");
					
					char data[] = new char[100];
					
					fr.read(data);
					
					System.out.println(data);
				} catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		};
		
		Thread df = new Thread() {
			public void run() {
				
				try { 
					File f = new File("D://RaceCondition.txt");
					boolean result = f.delete();
					if(result)
					{
						System.out.println("File Deleted !");
					}
					else 
						System.out.println("File not available"); 
				} catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		};
		 
		cf.start();
		wf.start();
		af.start();
		df.start();

	}

}
