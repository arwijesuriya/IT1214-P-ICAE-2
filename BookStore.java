public class BookStore {
	
	public static void main(String[] args) {
		
		Author author1 = new Author("David", 'M', 40);
		Author author2 = new Author("Irfhan", 'M', 45);
		Author author3 = new Author("Kumari", 'F', 36);
		Author author4 = new Author("Nimali", 'F', 32);
		Author author5 = new Author("Ramanan", 'M', 30);
		
		Author[] authorArray = new Author[5];
		
		authorArray[0] = author1;
		authorArray[1] = author2;
		authorArray[2] = author3;
		authorArray[3] = author4;
		authorArray[4] = author5;
		
		Book book1 = new Book("Introduction to java", 2000, 340, author1);
		Book book2 = new Book("Object orinted design", 2500, 500, author2);
		Book book3 = new Book("Java for beginners", 1800, 300, author3);
		Book book4 = new Book("Introduction to C", 1500, 250, author4);
		Book book5 = new Book("JavaScript for beginners", 1700, 550, author5);
		
		Book[] bookArray = new Book[5];
		
		bookArray[0] = book1;
		bookArray[1] = book2;
		bookArray[2] = book3;
		bookArray[3] = book4;
		bookArray[4] = book5;
		
		System.out.println("Details of all books...........................................\n");
		
		for(int i = 0; i < bookArray.length; i++) {
			
			bookArray[i].printDetails();
		}
		
		System.out.println("\nFemale author.................................\n");
		
		for(int i = 0; i < authorArray.length; i++) {
			
			if(authorArray[i].getSex() == 'F') {
				bookArray[i].printDetails();
			}
		}
		
		System.out.println("\nYoungest author.................................\n");
		
		int min = authorArray[0].getAge();
		
		for(int i = 0; i < authorArray.length; i++) {
			
			if(authorArray[i].getAge() >= min) {
				min = min;
			}
			else {
				min = authorArray[i].getAge();
			}
		}
		
		for(int i = 0; i < authorArray.length; i++) {
			
			if(min == authorArray[i].getAge()) {
				bookArray[i].printDetails();
				break;
			}
		}
		
		System.out.println("\nPrice changes.................................\n");
		
		for(int i = 0; i < bookArray.length; i++) {
			
			if(bookArray[i].getPages() < 500) {
				double total = 0;
				total = (bookArray[i].getPrice() * 20) / 100;
				bookArray[i].setPrice(total+bookArray[i].getPrice());
			}
			else {
				double total = 0;
				total = (bookArray[i].getPrice() * 10) / 100;
				bookArray[i].setPrice(total+bookArray[i].getPrice());
			}
		}
		
		for(int i = 0; i < bookArray.length; i++) {
			
			bookArray[i].printDetails();
		}
		
	}
}