package book;

public class TestBook {

	public static void main(String[] args) {

		Author aBook = new Author("David Sena", "daviidsena@gmail.com", 'M');
		Book anBook = new Book("Alem da vida", aBook, 29.90);
		
		// Use an anonymous instance of Author
		Book anotherBook = new Book("Visitando Narnia",new Author("David Sena", "daviidsena@gmail.com", 'M'),31.90,200);
		
		// Essa eh a forma incorreta de pegar as informacoes do book.
		System.out.println(aBook.getName() + " " + aBook.getEmail() + " " + aBook.getGender());
		// Essa eh a forma correta de dar get nas informacoes.
		// Isso so e possivel por ter usados os getters and setters na classe BOOK.
		System.out.println(anotherBook.getAuthorName() +" "+ anotherBook.getAuthorEmail() +" "+ anotherBook.getAuthorGender());
		
	}
}
