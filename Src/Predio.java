import java.util.ArrayList;
import java.util.List;

public final class Predio extends Edificacao implements Comparable<Predio> {

	private String nomePredio;
	private int numAndares;
	private int apPorAndar;
	
	private List<UnidadeResidencial> unidade = new ArrayList<UnidadeResidencial>();
	
	public Predio(float metragemTotal, String endereco, Engenheiro responsavel, UnidadeResidencial unidades,
			String nomePredio, int numAndares, int apPorAndar) {
		super(metragemTotal, endereco, responsavel, unidades);
		this.nomePredio = nomePredio;
		this.numAndares = numAndares;
		this.apPorAndar = apPorAndar;
	}

	public void setApto(UnidadeResidencial unid) {		
		unidade.add(unid);
	}
	

	public List<UnidadeResidencial> getUnidade() {
		return unidade;
	}

	public void setUnidade(List<UnidadeResidencial> unidade) {
		this.unidade = unidade;
	}

	public void dadosAp() {
		System.out.println(descricaoDoImovel());
		
		for(int i = 0; i < unidade.size() ; i++) {
				System.out.println("Unidade " + i);
				System.out.println(unidade.get(i).descricaoDoImovel());	
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

	
	public void infoUnidades() {
		for(int i = 0; i < unidade.size(); i++) {
			System.out.println("Metragem: " + unidade.get(i).getProprietario().getNome());
			System.out.println("Metragem: " + unidade.get(i).getMetragemUnidade());
			System.out.println(unidade.get(i).getNumQuartos() + " Quarto(s) / " + unidade.get(i).getNumBanheiros() +  " Banheiro(s)");
		}
		System.out.println();
	}
	
	
	// Desc Predio
	public String descricaoDoImovel() {
		return " Predio: " + getNomePredio() + "\n" + "Numero de Andares: "
				+ getNumAndares() + "\n" + "Apartamentos por Andar: " + getApPorAndar() + "\n";
	}
	
	public boolean isEmpty() {
		return false;
	}

	@Override
	public int compareTo(Predio o) {
		
		if(this.numAndares == o.numAndares) {
			return 0;
		}
		else if(this.numAndares > o.numAndares) {
			return 1;
		}
		else
			return -1;
	}

	
}
