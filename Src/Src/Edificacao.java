package estruturas;

import java.util.Scanner;

public abstract class Edificacao {

	Scanner input = new Scanner(System.in);
	
	protected float metragemTotal;
	protected String endereco;
	protected Engenheiro responsavel;
	protected UnidadeResidencial unidades;

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

	public void cadastrarUnidade(UnidadeResidencial novaUnid) {
				
	}
	
	public String descricaoDoImovel() {
		return " ";
	}

}
