import java.util.ArrayList;
import java.util.List;

public class Condominio extends Edificacao {

	private double metragemCondominio;
	private String proprietarioCondominio;
	private String enderecoCondominio;
	
	List <Predio> predios = new ArrayList<Predio>();
	
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


	/*
	public void ler() {
		
		for(int j = 0; j < predios.length; j++) {
			System.out.println(predios[j].getApPorAndar());
		}
	}
	*/


	/*
	public Predio[] getPredios() {
		return predios;
	}
	*/



	public void setPredios(Predio unidPredios) {
		predios.add(unidPredios);
	}



	public void infoCondominio() {
		
		
		System.out.println("::Condominio::");
		System.out.println("Proprietario: " + getProprietarioCondominio());
		System.out.println("Endere�o: " + getEnderecoCondominio());
		System.out.println("Metragem: " + getMetragemCondominio() + " metros quadrados.");
		System.out.println();
		
		for(int i = 0; i < predios.size(); i++) {
			System.out.println("Unidade: " + i);
			System.out.println("Nome do Predios: " + predios.get(i).getNomePredio());
			System.out.println("Quantidade de andar: " + predios.get(i).getNumAndares());
			System.out.println("Apartamentos por andar: " + predios.get(i).getApPorAndar());
			
			System.out.println();
			System.out.println("--Apartamentos--");
			
			/*
			int tamanho = predios.get(i).getUnidade();
			
			for(int j = 0; j < tamanho; j++) {
				System.out.println("Proprietario: " + predios[j].getUnidades().proprietario.getNome());
				System.out.println("Cpf do Proprietario: " + predios[j].getUnidades().proprietario.getCpf());
				System.out.println("Metragem Unidade: " + predios[j].getUnidades().getMetragemUnidade());
				System.out.println("Quatidade de Quartos: " + predios[j].getUnidades().getNumQuartos());
				System.out.println("Quantidade de Banheiros: " + predios[j].getUnidades().getNumBanheiros());
				System.out.println();
				
			}
			*/
			System.out.println();
			System.out.println();
			
			
			
			System.out.println();
		}
		
	
		System.out.println("Fim");
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
