package Item;

public class Midia extends Item {
	
	private String gravadora;
	private float Duracao;
	
	public Midia() {
		
	}
	
	public Midia (String gravadora, float duracao) {
		setGravadora(gravadora);
		setDuracao(duracao);
	}
	
	
	
	
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		if(gravadora.length() > 0)
		this.gravadora = gravadora;
	}
	public float getDuracao() {
		return Duracao;
	}
	public void setDuracao(float duracao) {
		if(duracao > 0)
		Duracao = duracao;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Midia [gravadora=");
		builder.append(gravadora);
		builder.append(", Duracao=");
		builder.append(Duracao);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}
