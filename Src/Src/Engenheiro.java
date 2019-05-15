package estruturas;

public final class Engenheiro extends Pessoa {

	private int crea;

	public Engenheiro(String nome, String cpf, int crea) {
		super(nome, cpf);
		this.crea = crea;
	}
	
	public Engenheiro(Engenheiro e) {
		super(e.getNome(), e.getCpf());
		this.crea = e.getCrea();
	}

	public int getCrea() {
		return crea;
	}

	public void setCrea(int crea) {
		this.crea = crea;
	}
	
	public String infoPessoa() {
		return "Responsável: " + getNome() + "." + "CREA: " + getCrea();
	}
	
}
