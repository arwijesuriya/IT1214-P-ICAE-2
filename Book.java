public class Book{
	private String title;
	private double price;
	private int pages;
	private Author author;
	
	//constructor
	Book(String title, double price, int pages, Author author) {
		this.title = title;
		this.price = price;
		this.pages = pages;
		this.author = author;
	}
	
	//getter methods
	public double getPrice() {
		return price;
	}
	
	public int getPages() {
		return pages;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	//set method
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void printDetails() {
		System.out.println("Title : " + title + "	" + "Price : " + price + "	" + "Pages : " + pages + "\n" + "	Authors details" + "\n" +"	Sex : " + author.getSex() + "	" + "	Age : " + author.getAge());
	}
	
	
}