package estruturas;

public class UnidadeResidencial {

	protected float metragemUnidade;
	protected int numQuartos;
	protected int numBanheiros;
	protected Pessoa proprietario;

	public UnidadeResidencial(float metragemUnidade, int numQuartos, int numBanheiros, Pessoa proprietario) {
		super();
		this.metragemUnidade = metragemUnidade;
		this.numQuartos = numQuartos;
		this.numBanheiros = numBanheiros;
		this.proprietario = new Pessoa(proprietario);
	}
	
	public UnidadeResidencial() {
		
	}

	
	public UnidadeResidencial(UnidadeResidencial ur) {
		this.metragemUnidade = ur.getMetragemUnidade();
		this.numQuartos = ur.getNumQuartos();
		this.numBanheiros = ur.getNumBanheiros();
	}
	
	
	public float getMetragemUnidade() {
		return metragemUnidade;
	}

	public void setMetragemUnidade(float metragemUnidade) {
		this.metragemUnidade = metragemUnidade;
	}

	public int getNumQuartos() {
		return numQuartos;
	}

	public void setNumQuartos(int numQuartos) {
		this.numQuartos = numQuartos;
	}

	public int getNumBanheiros() {
		return numBanheiros;
	}

	public void setNumBanheiros(int numBanheiros) {
		this.numBanheiros = numBanheiros;
	}

	public Pessoa getProprietario() {
		return proprietario;
	}

	public void setProprietario(Pessoa proprietario) {
		this.proprietario = proprietario;
	}

	//Descri��o para uma unidade residencial
	public String descricaoDoImovel() {
		return  " " +proprietario.infoPessoa() +"\n"+
				"Possui " + getMetragemUnidade() + " metros quadrados" +"\n" +
				 getNumQuartos() + " quartos." + "\n"+
				 getNumBanheiros() + " banheiros.";
	}
	/*
	Numero de Andares: 2
	Apartamentos por Andar: 3
	*/
	
	
	
	
	
}
