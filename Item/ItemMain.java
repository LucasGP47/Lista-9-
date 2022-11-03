package Item;

public class ItemMain {

	public static void main(String[] args) {
		
		Livro liv = new Livro("");
		
		liv.setAutor("Mateus");
		
		Midia md = new Midia("");
		
		md.setFaixas("15 faixas");
		md.setAlbum("Flores");
		md.setArtista("Carlos Pilotto");
		md.setGravadora("Som Livre");
		md.setDuracao("12 dias");
		
		System.out.println(liv);
		System.out.println(md);

	}

}
