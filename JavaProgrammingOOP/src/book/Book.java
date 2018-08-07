package book;

public class Book {

	private String name;
	private Author author;
	private Double price;
	private int qtyInStock = 0;

	public Book(String name, Author author, Double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Book(String name, Author author, Double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public String getAuthorName() {
		return author.getName();
	}

	public String getAuthorEmail() {
		return author.getEmail();
	}

	public char getAuthorGender() {
		return author.getGender();
	}

	public String toString() {
		return name + " by " + author;
	}

}
