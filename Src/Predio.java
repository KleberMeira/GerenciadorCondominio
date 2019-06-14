import java.util.ArrayList;
import java.util.List;

public final class Predio extends Edificacao {

	private String nomePredio;
	private int numAndares;
	private int apPorAndar;
	private  UnidadeResidencial[] apartamentos;
	
	List<UnidadeResidencial> unidade = new ArrayList<UnidadeResidencial>();
	
	public Predio(float metragemTotal, String endereco, Engenheiro responsavel, UnidadeResidencial unidades,
			String nomePredio, int numAndares, int apPorAndar) {
		super(metragemTotal, endereco, responsavel, unidades);
		this.nomePredio = nomePredio;
		this.numAndares = numAndares;
		this.apPorAndar = apPorAndar;
		this.apartamentos = new UnidadeResidencial[this.apPorAndar * this.numAndares];
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
	
	public void setApto(UnidadeResidencial unid) {		
		unidade.add(unid);
	}
	
	public void dadosAp() {
		
			for(int i = 0; i < unidade.size() ; i++) {
				System.out.println(unidade.get(i).descricaoDoImovel());		
			}
		
	}
	
	public void dadosAptos() {
		 for(int i = 0; i < apartamentos.length; i++) {

			 System.out.println("Proprietario: "+ apartamentos[i].proprietario.infoPessoa());
			 System.out.println("Metragem: "+ apartamentos[i].getMetragemUnidade());
			 System.out.println("Quantidade de Quartos: "+ apartamentos[i].getNumQuartos());
			 System.out.println("Quantidade de Banheiros: "+apartamentos[i].getNumBanheiros());
			 System.out.println();
		}
	

		
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

	// Desc Predio
	public String descricaoDoImovel() {
		return " Predio: " + getNomePredio() + "\n" + "Numero de Andares: "
				+ getNumAndares() + "\n" + "Apartamentos por Andar: " + getApPorAndar() + "\n";
	}
	
	public boolean isEmpty() {
		return false;
	}
	
}
