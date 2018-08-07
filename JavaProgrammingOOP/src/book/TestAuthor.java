package book;

public class TestAuthor {

	public static void main(String[] args) {

		Author anAuthor = new Author("David Sena", "daviidsena@gmail.com", 'm');

		System.out.println(anAuthor); // Call toString()

		anAuthor.setEmail("davidsena@imodata.net");
		System.out.println(anAuthor);

	}

}
