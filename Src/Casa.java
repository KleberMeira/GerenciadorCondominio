import java.util.ArrayList;
import java.util.List;

public class Casa extends Edificacao implements Comparable<Casa> {

	protected boolean condominio;
	
	private List<UnidadeResidencial> unidade = new ArrayList<UnidadeResidencial>();

	public Casa(float metragemTotal, String endereco, Engenheiro responsavel, UnidadeResidencial unidades,
			boolean condominio) {
		super(metragemTotal, endereco, responsavel, unidades);
		this.condominio = condominio;
	}

	public boolean isCondominio() {
		return condominio;
	}

	public void setCondominio(boolean condominio) {
		this.condominio = condominio;
	}
	
	public boolean cadastrarUnidade(UnidadeResidencial novaUnid) {
		this.unidade.add(novaUnid);
		return true;
	}
	
	
	public List<UnidadeResidencial> getUnidade() {
		return unidade;
	}

	public void setUnidade(List<UnidadeResidencial> unidade) {
		this.unidade = unidade;
	}

	@Override
	public int compareTo(Casa o) {
		
		if(this.getMetragemTotal() == o.getMetragemTotal()) {
			return 0;
		}
		else if(this.getMetragemTotal() > o.getMetragemTotal()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	// Desc Casa
		public String descricaoDoImovel() {
			return " Condominio: " + isCondominio() + " /" + " Metragem Total: " + getMetragemTotal();
		}

	

}
