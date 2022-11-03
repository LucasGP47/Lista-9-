package PessoaPack;

public class PessoaFisica {
	
	public PessoaFisica(String nome) {
		
	}
    private String ec;
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEc() {
		return ec;
	}

	public void setEc(String ec) {
		this.ec = ec;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa Fisica [Estado Civil= ");
		builder.append(ec);
		builder.append(", CPF= ");
		builder.append(cpf);
		builder.append("]");
		return builder.toString();
	}

	
	
	

}
