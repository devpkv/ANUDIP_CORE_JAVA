package java8API;

public class CalcSqure implements java8interface{

	public static void main(String[] args) {
		
		int num = 10;
		java8interface squre = (x) ->  x * x;
		 
		int area = squre.squre(num);
		System.out.println(area);
		 
		 
	}

	@Override
	public int squre(int x) {
		// TODO Auto-generated method stub
		return 0;
	}
 
}
