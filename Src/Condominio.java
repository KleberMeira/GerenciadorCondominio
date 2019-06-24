import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Condominio extends Edificacao {

	private double metragemCondominio;
	private String proprietarioCondominio;
	private String enderecoCondominio;
	
	Map <Float, Edificacao> ed = new HashMap<Float, Edificacao>();
	
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
		
		try {
			//exessao
			for(int i = 0; i < predios.size(); i++) {
				
				if(predios.get(i).getNomePredio() == nome) {
					return predios.get(i);
				}
				
			}
			return null;
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Array inválido");
		}
		return null;
		
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
			
			try {
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
			}
			catch(IndexOutOfBoundsException e) {
				System.out.println("Invalido");
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
			System.out.println(casas.get(i).descricaoDoImovel());
			
			System.out.println();
			System.out.println("--Dados da Casa--");
			
			int cont = 1;
			//exessao indexOfBounsExeption
			for(int j = 0; j < casas.get(i).getUnidade().size() ; j++) {
				System.out.println("Unidade " + cont++);
				System.out.println("Propriedade de "  + casas.get(i).getUnidade().get(j).getProprietario().getNome());
				System.out.println("Possui " + casas.get(i).getUnidade().get(j).getMetragemUnidade() + " metros quadrados"
				+ ", " + casas.get(i).getUnidade().get(j).getNumQuartos() + " quartos" + ", " +
						 casas.get(i).getUnidade().get(j).getNumBanheiros() + " banheiro(s).");
				System.out.println();
			}
			

			
			System.out.println();
		
		}

	}


	public void ordemEdificacao(Edificacao tipo) {
		
		if(tipo instanceof Predio) {
			
			for(int i = 0; i < predios.size(); i++) {
				ed.put(predios.get(i).getMetragemTotal(), tipo);
			}
			
			System.out.println("Predios - Ordedenado por Andar");

				System.out.println(ed.toString());
			
			
			
		}
		else if(tipo instanceof Casa) {
			
		}
		else {
			
		}
		
		
	}
	
	
	
	/*
	// Inclui Predios e/ou casas
	public void adicionaConstrucao(Edificacao construcao) {

//		System.out.println(casas.length);
//		System.out.println(predios.length);
	if(construcao instanceof Predio) {
		System.out.println("ï¿½ um predio");
		
		addPredio(construcao);
		
	}
	if(construcao instanceof CasaTerrea) {
		System.out.println("ï¿½ uma casa Terrea");
	}
	if(construcao instanceof CasaSobrado) {
		System.out.println("ï¿½ um Sobrado");
	}
	
}
*/
}
