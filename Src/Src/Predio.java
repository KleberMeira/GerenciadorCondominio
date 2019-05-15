package estruturas;

public final class Predio extends Edificacao {

	private String nomePredio;
	private int numAndares;
	private int apPorAndar;
	private UnidadeResidencial[] unidades;

	public Predio(String nome, int numAndares, int apPorAndar, float metragem, String endereco) {
		this.nomePredio = nome;
		this.numAndares = numAndares;
		this.apPorAndar = apPorAndar;
		setMetragemTotal(metragem);
		setEndereco(endereco);

		UnidadeResidencial[] unidade = new UnidadeResidencial[totalAptos()]; // Toda vez que um predio �
																				// instanciado/constru�do um vetor de
																				// unidade tamb�m � que cont�m a
																				// quantidade de apartarmaentos
	}

	public Predio(Predio pre) {
		this.nomePredio = pre.getNomePredio();
		this.numAndares = pre.getNumAndares();
		this.apPorAndar = pre.getApPorAndar();
	}

	public Predio() {

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

	// Descri��o para um pr�dio
	public String descricaoDoImovel() {
		return " Predio: " + getNomePredio() + "\n" + "Situado na: " + getEndereco() + "\n" + "Area total: "
				+ getMetragemTotal() + " metros quadrados." + "\n" + "Respons�vel: " + "\n" + "Numero de Andares: "
				+ getNumAndares() + "\n" + "Apartamentos por Andar: " + getApPorAndar() + "\n";
	}

	public void cadastraApartamento(UnidadeResidencial unid) {

		for (int i = 0; i < this.unidades.length; i++) {
			if (this.unidades[i] == null) {
				this.unidades[i] = unid;
			}
		}
	}
	
	public void infoAptos() {
		
		for(int i = 0; i < this.unidades.length ; i++) {
			System.out.println(this.unidades[i].descricaoDoImovel());
		}
		
	}

	public int totalAptos() {

		int quantAndares = getNumAndares();
		int quantApto = getApPorAndar();

		int totalApto = quantAndares * quantApto;
		return totalApto;

	}

}
