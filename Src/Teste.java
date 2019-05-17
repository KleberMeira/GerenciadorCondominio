import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Engenheiro eng = new Engenheiro("Kleber", "123", 1547);
		Pessoa p = new Pessoa("Joao", "135");
		//float metragemUnidade, int numQuartos, int numBanheiros, Pessoa proprietario
		UnidadeResidencial ud = new UnidadeResidencial(14, 2, 2, p );
		//float metragemTotal, String endereco, Engenheiro responsavel, UnidadeResidencial unidades,
		//String nomePredio, int numAndares, int apPorAndar

		Pessoa p2 = new Pessoa("Marcos", "457");
		//float metragemUnidade, int numQuartos, int numBanheiros, Pessoa proprietario
		UnidadeResidencial ud2 = new UnidadeResidencial(14, 3, 1, p2 );
		//float metragemTotal, String endereco, Engenheiro responsavel, UnidadeResidencial unidades,
		//String nomePredio, int numAndares, int apPorAndar

		Predio pre = new Predio(21, "Avenida Paineiras", eng,ud,"Maria Amelia", 2, 1  );
		Predio pre2 = new Predio(21, "Avenida Paineiras", eng,ud2,"Maria Amelia", 2, 1  );

		pre.setApartamentos(ud);
		pre.setApartamentos(ud2);
		//pre.dadosAptos();
		
		pre2.setApartamentos(ud2);
		pre2.setApartamentos(ud);
		//pre2.dadosAptos();
		
		//float metragemTotal, String endereco, Engenheiro responsavel, UnidadeResidencial unidades,
		//double metragemCondominio, String proprietarioCondominio, String enderecoCondominio, int quantPredios
		Condominio cond = new Condominio(21, "Rua Central", eng, ud, 12, "Joao Dias", "Rua Central A", 2);
		
		cond.setPredios(pre);
		cond.setPredios(pre2);

		cond.infoCondominio();
		
		/*
		System.out.println(" Gerenciador de Condominio ");
		System.out.println();
		System.out.println("[1] Cadastro ");
		System.out.println("[2] Listagem ");
		System.out.println("[3] Sair ");
		
		int menu = input.nextInt();
		
		switch(menu) {
			
			case 1:{
				//String nome, String cpf, int crea
				
				System.out.println(" Cadastro de Condominio ");
				System.out.println();
				System.out.println("Engenheiro Responsável: ");
				String nomeEng = input.nextLine();
				System.out.println("Cpf: ");
				String cpfEng = input.nextLine();
				System.out.println("Crea: ");
				int crea = input.nextInt();
				Engenheiro eng = new Engenheiro(nomeEng, cpfEng, crea);
				
				System.out.println("Engenheiro Cadastrado com sucesso!");
				System.out.println();
				System.out.println(" Agora os dados sobre o Condominio ");
				System.out.println();
				//float metragemTotal, String endereco, Engenheiro responsavel, UnidadeResidencial unidades,
				//double metragemCondominio, String proprietarioCondominio, String enderecoCondominio, 
				//int quantCasas, int Predios
				
				System.out.println("Metragem total: ");
				float metragemTotal = input.nextFloat();
				System.out.println("Endereço: ");
				String enderecoCond = input.nextLine();
				System.out.println("Metragem de Area Construída: ");
				double metragemCond = input.nextDouble();
				System.out.println("Proprietário Legal: ");
				String proprietarioCond = input.nextLine();
				
				System.out.println();
				System.out.println("Parte 2");
				
				System.out.println("Endereço do Condominio: ");
				String enderecoCond2 = input.nextLine();
				
				System.out.println("Quantidade de Predios: ");
				int qPredios = input.nextInt();
		
				System.out.println();
				System.out.println(" Cadastre a primeira Unidade ");
				System.out.println();
				
				System.out.println("Metragem da Unidade: ");
				float metragemUnidade = input.nextFloat();
				System.out.println("Quantidade de Quartos: ");
				int qQuartos = input.nextInt();
				System.out.println("Quantidade de Banheiros: ");
				int qBanheiros = input.nextInt();
				
				System.out.println();
				System.out.println(" Cadastre o proprietario da unidade ");
				System.out.println();
				
				System.out.println("Nome: ");
				String nomeProprietario = input.nextLine();
				System.out.println("Cpf: ");
				String cpfProprietario = input.nextLine();
				//String nome, String cpf
				Pessoa p = new Pessoa(nomeProprietario, cpfProprietario);
				//float metragemUnidade, int numQuartos, int numBanheiros, Pessoa proprietario
				UnidadeResidencial ud = new UnidadeResidencial(metragemUnidade, qQuartos, qBanheiros, p);
				
				Condominio cond = new Condominio(metragemTotal, enderecoCond, eng, ud, metragemCond, proprietarioCond, enderecoCond2, qPredios);
				
				System.out.println();
				System.out.println("Condominio cadastrado com sucesso!");
				System.out.println();

			}

			case 2:{

			}

			*/
		}
		


}
