package Item;

public class Main {

	public static void main(String[] args) {
		
		Item i = new Item(1, " Depende");
		System.out.println(i);
		
		Livro l = new Livro(" Lucas");
		l.setCodigo(124);
		l.setDescricao("1984 George Owell");
		System.out.println(l);
		
		Midia m = new Midia("Mega Music", 23);
		m.setCodigo(101);
		m.setDescricao("Fundo de Quintal");
		System.out.println(m);
		
		VHS vhs = new VHS(" As mais ouvidas Jovem Pam 2017");
		vhs.setCodigo(217);
		vhs.setDescricao(" Maios ou menos mas da pro gasto");
		vhs.setGravadora(" Eu mesmo");
		vhs.setDuracao(14);
		System.out.println(vhs);
		
		CD cd = new CD(12, "Uepa", "Não gosto mais de voce");
		cd.setCodigo(124);
		cd.setDescricao("Apice da musica conteporanea");
		cd.setGravadora(" Mega Som");
		cd.setDuracao(15);
		System.out.println(cd);
		
	}

}
