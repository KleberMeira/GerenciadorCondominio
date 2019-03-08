package estruturas;

public class Pessoa {

	protected String nome;
	protected String cpf;

	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public Pessoa(Pessoa p) {
		this.nome = p.getNome();
		this.cpf = p.getCpf();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String infoPessoa() {
		return "Propriedade de: " + getNome();
	}

}
