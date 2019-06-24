import java.util.ArrayList;
import java.util.List;

public class Condominio extends Edificacao {

	private double metragemCondominio;
	private String proprietarioCondominio;
	private String enderecoCondominio;
	
	List <Predio> predios = new ArrayList<Predio>();
	List <Casa> casas = new ArrayList<Casa>();
	
	public Condominio(float metragemTotal, String endereco, Engenheiro responsavel, UnidadeResidencial unidades,
			double metragemCondominio, String proprietarioCondominio, String enderecoCondominio) {
		super(metragemTotal, endereco, responsavel, unidades);
		this.metragemCondominio = metragemCondominio;
		this.proprietarioCondominio = proprietarioCondominio;
		this.enderecoCondominio = enderecoCondominio;
	}
	
	
	
	public double getMetragemCondominio() {
		return metragemCondominio;
	}



	public void setMetragemCondominio(double metragemCondominio) {
		this.metragemCondominio = metragemCondominio;
	}



	public String getProprietarioCondominio() {
		return proprietarioCondominio;
	}



	public void setProprietarioCondominio(String proprietarioCondominio) {
		this.proprietarioCondominio = proprietarioCondominio;
	}



	public String getEnderecoCondominio() {
		return enderecoCondominio;
	}



	public void setEnderecoCondominio(String enderecoCondominio) {
		this.enderecoCondominio = enderecoCondominio;
	}

	public void setPredios(Predio unidPredios) {
		predios.add(unidPredios);
	}

	public void setCasas(Casa unidCasa) {
		casas.add(unidCasa);
	}
	
	public void quantPredio() {
		//exessao
		System.out.println(predios.size() + " Predios.");
	}
	public void quantCasa() {
		//exessao
		System.out.println(casas.size() + " Casas.");
	}
	
	public Predio buscaPredio(String nome) {
		
		//exessao
		for(int i = 0; i < predios.size(); i++) {
			
			if(predios.get(i).getNomePredio() == nome) {
				return predios.get(i);
			}
			
		}
		return null;
	}
	
	//Ordenado
	
	public void listagemPredios() {
		
	}
	
	public void listagemCasas() {
		
	}
	
	public void listagemUnidades() {
		
	}
	


	public void infoCondominio() {
		
		System.out.println("::Condominio::");
		System.out.println("Proprietario: " + getProprietarioCondominio());
		System.out.println("Endereco: " + getEnderecoCondominio());
		System.out.println("Metragem: " + getMetragemCondominio() + " metros quadrados.");
		System.out.println();
		
		
		for(int i = 0; i < predios.size(); i++) {
			System.out.println("Unidade: " + i);
			System.out.println("Nome do Predios: " + predios.get(i).getNomePredio());
			System.out.println("Quantidade de andar: " + predios.get(i).getNumAndares());
			System.out.println("Apartamentos por andar: " + predios.get(i).getApPorAndar());
			
			System.out.println();
			System.out.println("--Apartamentos--");
			
			int cont = 1;
			//exessao indexOfBounsExeption
			for(int j = 0; j < predios.get(i).getUnidade().size() ; j++) {
				System.out.println("Unidade " + cont++);
				System.out.println("Propriedade de "  + predios.get(i).getUnidade().get(j).getProprietario().getNome());
				System.out.println("Possui " + predios.get(i).getUnidade().get(j).getMetragemUnidade() + " metros quadrados"
				+ ", " + predios.get(i).getUnidade().get(j).getNumQuartos() + " quartos" + ", " +
						 predios.get(i).getUnidade().get(j).getNumBanheiros() + " banheiro(s).");
				System.out.println();
			}
			
			System.out.println();
		
		}

	}
	
public void infoCondominioCasa() {
		
		System.out.println("::Condominio::");
		System.out.println("Proprietario: " + getProprietarioCondominio());
		System.out.println("Endereco: " + getEnderecoCondominio());
		System.out.println("Metragem: " + getMetragemCondominio() + " metros quadrados.");
		System.out.println();
		
		
		for(int i = 0; i < casas.size(); i++) {
			System.out.println("Unidade: " + i);
			System.out.println("Sobrado? " + casas.get(i).descricaoDoImovel());
			
			System.out.println();
			System.out.println("--Dados da Casa--");
			
			System.out.println("Propriedade de " + casas.get(i).getUnidade().get(i).getProprietario().getNome());
			System.out.println("Possui " + casas.get(i).getUnidade().get(i).getMetragemUnidade() + " metros quadrados" );
			
			System.out.println();
		
		}

	}
	

	
	
	
/*	
	// Inclui Predios e/ou casas
	public void adicionaConstrucao(Edificacao construcao) {

//		System.out.println(casas.length);
//		System.out.println(predios.length);
	if(construcao instanceof Predio) {
		System.out.println("� um predio");
		
		addPredio(construcao);
		
	}
	if(construcao instanceof CasaTerrea) {
		System.out.println("� uma casa Terrea");
	}
	if(construcao instanceof CasaSobrado) {
		System.out.println("� um Sobrado");
	}
	
}
*/
}
