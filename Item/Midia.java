package Item;

public class Midia extends CD {
	
	public String Gravadora;
	public String duracao;
	
	public Midia (String faixas) {
		
		super(faixas);
		
	}

	public String getGravadora() {
		return Gravadora;
	}

	public void setGravadora(String gravadora) {
		Gravadora = gravadora;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" Gravadora= ");
		builder.append(Gravadora);
		builder.append(", duracao=");
		builder.append(duracao);
		builder.append("]");
		return builder.toString();
	}
		
}





