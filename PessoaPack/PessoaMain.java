package PessoaPack;

public class PessoaMain {

	public static void main(String[] args) {
		
	PessoaFisica pf = new PessoaFisica("Lucas");
	
	pf.setEc("Casado");
	pf.setCpf("891-500-154");
	
	PessoaJuridica pj = new PessoaJuridica("Carlos");
	
	pj.setcnpj("654846465456");
	pj.setTipoempresa("AMD");
	
	System.out.println(pf);
	System.out.println(pj);
		;

	}

}
