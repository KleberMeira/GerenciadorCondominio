

public final class Predio extends Edificacao {

	private String nomePredio;
	private int numAndares;
	private int apPorAndar;
	private UnidadeResidencial[] apartamentos;
	
	public Predio(float metragemTotal, String endereco, Engenheiro responsavel, UnidadeResidencial unidades,
			String nomePredio, int numAndares, int apPorAndar) {
		super(metragemTotal, endereco, responsavel, unidades);
		this.nomePredio = nomePredio;
		this.numAndares = numAndares;
		this.apPorAndar = apPorAndar;
		this.apartamentos = new UnidadeResidencial[this.apPorAndar * this.numAndares];
	}

	public Predio(Predio p) {
		super(p.getMetragemTotal(), p.getEndereco(), p.getResponsavel(), p.getUnidades());
		this.nomePredio = p.getNomePredio();
		this.numAndares = p.getNumAndares();
		this.apPorAndar = p.getApPorAndar();
	}
	

	public UnidadeResidencial[] getApartamentos() {
		return apartamentos;
	}

	
	public void setApartamentos(UnidadeResidencial unid) {
		
		int pos = 0;
		
		for(int i = 0 ; i < apartamentos.length; i++) {
			if(apartamentos[i] != null) {
				pos++;
			}
		}
		
		this.apartamentos[pos] = unid;
		
	}
	
	public String dadosAptos() {
		 for(int i = 0; i < apartamentos.length; i++) {

			apartamentos[i].proprietario.infoPessoa();
			apartamentos[i].getMetragemUnidade();
			apartamentos[i].getNumQuartos();
			apartamentos[i].getNumBanheiros();
			
		}
	
		return null;
		
	}
	
	
	public String getNomePredio() {
		return nomePredio;
	}

	public void setNomePredio(String nomePredio) {
		this.nomePredio = nomePredio;
	}

	public int getNumAndares() {
		return numAndares;
	}

	public void setNumAndares(int numAndares) {
		this.numAndares = numAndares;
	}

	public int getApPorAndar() {
		return apPorAndar;
	}

	public void setApPorAndar(int apPorAndar) {
		this.apPorAndar = apPorAndar;
	}

	// Descrição para um prédio
	public String descricaoDoImovel() {
		return " Predio: " + getNomePredio() + "\n" + "Situado na: " + getEndereco() + "\n" + "Area total: "
				+ getMetragemTotal() + " metros quadrados." + "\n" + "Responsável: " + "\n" + "Numero de Andares: "
				+ getNumAndares() + "\n" + "Apartamentos por Andar: " + getApPorAndar() + "\n";
	}
	
	public boolean isEmpty() {
		return false;
	}
	
}
