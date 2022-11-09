package inheritace;

public abstract class Book {

	private int book_id;
	private String book_name, author_name;
	private float price;
	
	public Book() {
		super();
		this.book_id = 101;
		this.book_name = "Ponniyan Selvan";
		this.author_name = "Kalki";
		this.price = 2000f;
	}
	 
	public String display() {
		return ("[book id=" + book_id + ",\n book=" + book_name + ",\n author=" + author_name + ",\n price="
				+ price + "]");
	}
	
	
	
	protected abstract void type();
	
}
