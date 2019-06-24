import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CondominioTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Engenheiro eng = new Engenheiro("Astolfo Pires", "123", 123456);
		Pessoa p = new Pessoa("Joao", "135");
		//float metragemUnidade, int numQuartos, int numBanheiros, Pessoa proprietario
		
		//float metragemTotal, String endereco, Engenheiro responsavel, UnidadeResidencial unidades,
		//String nomePredio, int numAndares, int apPorAndar

		Pessoa p2 = new Pessoa("Gilberto Macedo", "457");
		Pessoa p3 = new Pessoa("Felipe", "574");
		Pessoa p4 = new Pessoa("Diogo", "457");
		Pessoa p5 = new Pessoa("Amanda", "1657");
		Pessoa p6 = new Pessoa("Fernanda", "1105");
		//float metragemUnidade, int numQuartos, int numBanheiros, Pessoa proprietario
		UnidadeResidencial ud = new UnidadeResidencial(14, 2, 2, p );
		UnidadeResidencial ud2 = new UnidadeResidencial(14, 3, 1, p2 );
		UnidadeResidencial ud3 = new UnidadeResidencial(24, 4, 3, p3 );
		UnidadeResidencial ud4 = new UnidadeResidencial(80, 3, 1, p4 );
		UnidadeResidencial ud5 = new UnidadeResidencial(53, 5, 4, p5 );
		UnidadeResidencial ud6 = new UnidadeResidencial(68, 3, 2, p6 );
		//float metragemTotal, String endereco, Engenheiro responsavel, UnidadeResidencial unidades,
		//String nomePredio, int numAndares, int apPorAndar

		Predio pre = new Predio(542, "Rua da Paz, 135. Campo Grande", eng,ud,"Dom Quixote", 3, 1  );
		Predio pre2 = new Predio(21, "Avenida Paineiras", eng,ud2,"Maria Amelia", 2, 1  );
		
		//System.out.println("- Unidade Predio -");
		pre.setApto(ud);
		pre.setApto(ud2);
		pre.setApto(ud3);
		
		ArrayList <Predio> pr = new ArrayList<Predio>();
		
		pr.add(pre);
		pr.add(pre2);
		
		Collections.sort(pr);
		int cont = 0;
		for(Predio o : pr) {
			System.out.println(o.descricaoDoImovel() + 
							   o.getUnidade());
								
		}
		
		//pre.dadosAp();
		
		//float metragemTotal, String endereco, Engenheiro responsavel, UnidadeResidencial unidades,
		//boolean condominio
		Casa cs = new Casa(430, "Rua 1", eng, ud2, true);
		Casa cs2 = new Casa(650, "Rua 1B", eng, ud3, false);
		
		cs.cadastrarUnidade(ud4);
		cs.cadastrarUnidade(ud5);
		cs.cadastrarUnidade(ud6);
		
		//float metragemTotal, String endereco, Engenheiro responsavel, UnidadeResidencial unidades,
		//double metragemCondominio, String proprietarioCondominio, String enderecoCondominio
		Condominio cond = new Condominio(2100, "Rua Manoel Machado", eng, ud, 120, "Joao Ferreira Dias", "Avenida Filinto Miller");
		Condominio cond2 = new Condominio(5500, "Avenida Paraiso", eng, ud4, 230, "Joaquim Barbosa", "Rua Celeste");
		cond.setPredios(pre);
		//cond.setPredios(pre2);
	
		
		
		//cond.infoCondominio();
		
		
		
		
		/*
		System.out.println(" Gerenciador de Condominio ");
		System.out.println();
		System.out.println("[1] Cadastro ");
		System.out.println("[2] Listagem ");
		System.out.println("[3] Sair ");
		
		Scanner input = new Scanner(System.in);
		
		int menu = input.nextInt();
		
		switch(menu) {
			
			case 1:{
				//String nome, String cpf, int crea
				
				System.out.println(" Cadastro de Condominio ");
				System.out.println();
				System.out.println("Engenheiro Respons�vel: ");
				String nomeEng = input.next();
				System.out.println();
				System.out.println("Cpf: ");
				String cpfEng = input.next();
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
				System.out.println("Endere�o: ");
				String enderecoCond = input.next();
				System.out.println();
				System.out.println("Metragem de Area Constru�da: ");
				double metragemCond = input.nextDouble();
				System.out.println("Propriet�rio Legal: ");
				String proprietarioCond = input.next();
				System.out.println();
				
				System.out.println();
				System.out.println("Parte 2");
				
				System.out.println("Endere�o do Condominio: ");
				String enderecoCond2 = input.next();
				System.out.println();
				
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
				String nomeProprietario = input.next();
				System.out.println();
				System.out.println("Cpf: ");
				String cpfProprietario = input.next();
				System.out.println();
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

			
		}
	}
	*/

	}
}
