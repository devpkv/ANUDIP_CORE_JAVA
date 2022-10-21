import java.util.Scanner;
class Java8Switch2{
	////// Printing language abbreviation 
	 
	private static void printAbbr(String abbr)
	{
		// check input which abbreviation is matched
		switch(abbr){

			case "c","c++","java","python",".net" -> System.out.println("Programming Langunage"); 
			case "mysql","sql","oracle" -> System.out.println("Database language"); 
			case "html","php","css","javascript" -> System.out.println("Web based language"); 
			default -> System.out.println("Wrong Input!");
						 
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an abbreviation of any Programming,Web,Database language");
		// INput : -> taking abbreviation of language
		String inputAbbr = sc.next().toLowerCase();
		printAbbr(inputAbbr);
		
	}
}