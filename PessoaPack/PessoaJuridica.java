package PessoaPack;

public class PessoaJuridica {
	
	private String cnpj;
	private String tipoempresa;
	
	public PessoaJuridica(String cnpj) {
		setcnpj(cnpj);
		setTipoempresa(tipoempresa);
	}

	public String getcnpj() {
		return cnpj;
	}

	public void setcnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getTipoempresa() {
		return tipoempresa;
	}

	public void setTipoempresa(String tipoempresa) {
		this.tipoempresa = tipoempresa;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaJuridica [cnpj= ");
		builder.append(cnpj);
		builder.append(", tipo de empresa= ");
		builder.append(tipoempresa);
		builder.append("]");
		return builder.toString();
	}


	

}
