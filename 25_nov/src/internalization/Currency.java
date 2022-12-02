package internalization;

import java.text.NumberFormat;
import java.util.Locale;

public class Currency {
	
	public static void currency(Locale l) {
		
		double amt = 5790.5654f;
		NumberFormat nf = NumberFormat.getCurrencyInstance(l);
		String c = nf.format(amt);
		System.out.println(c+" for "+ l);
	}
	
	public static void numberInstance(Locale l) {
		
		double amt = 5790.5654f;
		NumberFormat nf = NumberFormat.getNumberInstance(l);
		String c = nf.format(amt);
		System.out.println(c+" for "+ l);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		currency(Locale.US);
		numberInstance(Locale.GERMAN);
	}

}
