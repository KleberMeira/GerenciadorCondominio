
import java.util.Scanner;


public class Condominio extends Edificacao {

	Scanner input = new Scanner(System.in);
	
	private double metragemCondominio;
	private String proprietarioCondominio;
	private String enderecoCondominio;
	private int quantCasas;
	private int quantPredios;
	private Casa[] casas;
	private Predio[] predios;
	
	
	public Condominio(float metragemTotal, String endereco, Engenheiro responsavel, UnidadeResidencial unidades,
			double metragemCondominio, String proprietarioCondominio, String enderecoCondominio, int quantPredios) {
		super(metragemTotal, endereco, responsavel, unidades);
		this.metragemCondominio = metragemCondominio;
		this.proprietarioCondominio = proprietarioCondominio;
		this.enderecoCondominio = enderecoCondominio;
		this.casas = new Casa[quantCasas];
		this.predios = new Predio[quantPredios];
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



	public Casa[] getCasas() {
		return casas;
	}



	public void setCasas(Casa unidCasa) {
		
		int pos = 0;
		
		for(int i = 0; i < this.casas.length; i++) {
			if(casas[i] != null) {
				pos++;
			}
		}
		this.casas[pos] = unidCasa;
		
	}
	
	public void ler() {
		
		for(int j = 0; j < predios.length; j++) {
			System.out.println(predios[j].getApPorAndar());
		}
	}



	public Predio[] getPredios() {
		return predios;
	}



	public void setPredios(Predio unidPredios) {
		
		int pos = 0;
		for(int i = 0; i < predios.length; i++) {
			if(predios[i] != null) {
				pos++;
			}
		}
		predios[pos] = unidPredios;
	}



	public void infoCondominio() {
		
		
		System.out.println("::Condominio::");
		System.out.println("Proprietario: " + getProprietarioCondominio());
		System.out.println("Endereço: " + getEnderecoCondominio());
		System.out.println("Metragem: " + getMetragemCondominio() + " metros quadrados.");
		System.out.println();
		
		for(int i = 0; i < predios.length; i++) {
			System.out.println("Unidade: " + i);
			System.out.println("Nome do Predios: " + predios[i].getNomePredio());
			System.out.println("Quantidade de andar: " + predios[i].getNumAndares());
			System.out.println("Apartamentos por andar: " + predios[i].getApPorAndar());
			
			System.out.println();
			System.out.println("--Apartamentos--");
			
			int tamanho = predios[i].getApartamentos().length;
			
			for(int j = 0; j < tamanho; j++) {
				System.out.println("Aptos");
			}
			
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
		System.out.println("É um predio");
		
		addPredio(construcao);
		
	}
	if(construcao instanceof CasaTerrea) {
		System.out.println("É uma casa Terrea");
	}
	if(construcao instanceof CasaSobrado) {
		System.out.println("É um Sobrado");
	}
	
}
*/
}
