package recursivo;

public class RecurString {

	String a = "Me chamo david, estou no trabalho testando o metodo recursivo";

	public static void main(String[] args) {

		RecurString a = new RecurString();
		a.recursivo(a.a.length() - 1);

	}

	public int recursivo(int b) {

		System.out.print(a.toUpperCase().charAt(b));

		if (b == 0) {
			return 1;
		}

		return recursivo(b - 1);
	}

}
