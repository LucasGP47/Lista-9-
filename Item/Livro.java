package Item;

public class Livro {

	private String autor;
	
	public Livro (String autor) {
		
		setAutor(autor);
		
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro [autor= ");
		builder.append(autor);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
