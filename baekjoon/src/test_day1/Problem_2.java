package test_day1;


class Book{
	private static Book book = null;
	int id;
	String name;
	private Book() {}
	
	public static Book getIntance() {
		if(book == null) {
			book = new Book();
		}
		return book;
	}
	public static void setInstance(int id,String name) {
		if(book == null) {
			book = new Book();
		}
		book.id = id;
		book.name = name;
	}
}
public class Problem_2 {
	public static void main(String[] args) {
		Book book = Book.getIntance();
		System.out.println(book.id+""+book.name);
		Book.setInstance(1, "kim");
		System.out.println(book.id+""+book.name);
	}
}



