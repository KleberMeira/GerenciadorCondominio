import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
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
		}
		
		
		
		
		
		
		
		

	}

}
