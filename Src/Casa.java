import java.util.ArrayList;
import java.util.List;

public class Casa extends Edificacao {

	protected boolean condominio;
	
	List<UnidadeResidencial> unidade = new ArrayList<UnidadeResidencial>();

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
	
	
	public void setCasa(UnidadeResidencial unid) {	
		unidade.add(unid);	
	}
	
	public void dadosCasa() {
		
		for(int i = 0; i < unidade.size(); i++) {
			System.out.println(unidade.get(i).descricaoDoImovel());
			System.out.println();
		}
		
	}
	
	// Desc Casa
		public String descricaoDoImovel() {
			return " Condominio: " + isCondominio();
		}
	

}
