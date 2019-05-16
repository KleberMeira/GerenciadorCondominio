
public class Edificacao {
	
	private float metragemTotal;
	private String endereco;
	private Engenheiro responsavel;
	private UnidadeResidencial unidades;

	public Edificacao(float metragemTotal, String endereco, Engenheiro responsavel,
			UnidadeResidencial unidades) {
		this.metragemTotal = metragemTotal;
		this.endereco = endereco;
		this.responsavel = new Engenheiro(responsavel);
		this.unidades = new UnidadeResidencial(unidades);
	}

	public float getMetragemTotal() {
		return metragemTotal;
	}

	public void setMetragemTotal(float metragemTotal) {
		this.metragemTotal = metragemTotal;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Engenheiro getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Engenheiro responsavel) {
		this.responsavel = responsavel;
	}

	public UnidadeResidencial getUnidades() {
		return unidades;
	}

	public String descricaoDoImovel() {
		return " ";
	}

}
