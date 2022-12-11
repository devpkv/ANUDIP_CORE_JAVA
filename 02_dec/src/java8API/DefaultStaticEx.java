package java8API;

public class DefaultStaticEx implements java8interface{

	public static void main(String[] args) {
		 
		DefaultStaticEx ds = new DefaultStaticEx();
		
		System.out.println(ds.welcome());	 
		
		
		// Static method interface
		System.out.println(java8interface.thanks());

	}

	@Override
	public int squre(int x) {
		// TODO Auto-generated method stub
		return 0;
	}

}
