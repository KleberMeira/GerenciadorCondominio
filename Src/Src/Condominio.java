package estruturas;

import java.util.Scanner;


public class Condominio extends Edificacao {

	Scanner input = new Scanner(System.in);

	protected double metragemCondominio;
	protected String proprietarioCondominio;
	protected String enderecoCondominio;
	protected Casa[] casas;
	protected Predio[] predios;
	protected Edificacao recebeConstrucao;

	
	


	public Condominio(double metragemCondominio, String proprietarioComdominio, String enderecoCondominio, int qtCasas,
			int qtPredios) {
		this.metragemCondominio = metragemCondominio;
		this.proprietarioCondominio = proprietarioComdominio;
		this.enderecoCondominio = enderecoCondominio;
		
		
		

		// A ideia de colocar a verificação dentro do construtor é validar na contrução
		// do objeto se atende ou não aos requisitos
		// Desta forma se for aceita a construção poderá usar o metodo de adcionar uma
		// construção linha 66.
		if (qtCasas >= 1 && qtCasas <= 100) {
			this.casas = new Casa[qtCasas];
		}

		if (qtPredios >= 1 && qtPredios <= 10) {
			this.predios = new Predio[qtPredios];
			
			
		}

		else {
			System.out.println("Deve-se atender no maximo 100 casas e ou no maximo 10 predios para este Condomínio");
		}

	}

	public Condominio(Condominio cond) {
		this.metragemCondominio = cond.getMetragemCondominio();
		this.proprietarioCondominio = cond.getProprietarioCondominio();
		this.enderecoCondominio = cond.getEnderecoCondominio();
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
		
	public Edificacao getRecebeConstrucao() {
		return recebeConstrucao;
	}

	
	//Preenchimento vetor casa
	public void addCasa(Casa casa) {
		for(int i = 0; i < this.casas.length; i++) {
			if(this.casas[i] == null) {
				this.casas[i] = casa;
				break;
			}
		}
	}
	
	//Preenchimento vetor predio
	public void addPredio(Predio predio) {
		for(int i = 0; i < this.predios.length; i++) {
			if(this.predios[i] == null) {
				this.predios[i] = predio;
				break;
			}
		}
	}
	

	public void infoCondominio() {
			
		System.out.println("::Condominio::");
		System.out.println("Proprietario: " + getProprietarioCondominio());
		System.out.println("Endereço: " + getEnderecoCondominio());
		System.out.println("Metragem: " + getMetragemCondominio() + " metros quadrados.");
		System.out.println();
		
		
		for(int i = 0; i < this.predios.length; i++) {
//			System.out.println("Unidade: " + i);
//			System.out.println("Nome: " +this.predios[i].getNomePredio());
//			System.out.println("Endereco: " +this.predios[i].getEndereco());
//			System.out.println("Metragem: "+this.predios[i].getMetragemTotal() + " metros quadrados");
//			System.out.println("Quantidade de andar: " +this.predios[i].getNumAndares() );
//			System.out.println("Apartamento por andar: " +this.predios[i].getApPorAndar());
//			System.out.println();
	
			System.out.println("Imovel " + i);
			System.out.println(this.predios[i].descricaoDoImovel());
			System.out.println();

			

				
		}
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
