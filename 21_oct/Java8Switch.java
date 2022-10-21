import java.util.Scanner;
class Java8Switch{
	
	private static void printAbbr(String abbr)
	{
		switch(abbr){

			case "lol" -> System.out.println("Lots of laugh"); 
			case "asap" -> System.out.println("As soon as possible"); 
			case "ttyl" -> System.out.println("Talk to you later."); 
			default -> System.out.println("Wrong Input!");
						 
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an abbreviation(lol,asap,ttyl)");
		String inputAbbr = sc.next().toLowerCase();
		printAbbr(inputAbbr);
		
	}
}