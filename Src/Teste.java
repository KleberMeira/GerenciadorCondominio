

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String nome, String cpf, int crea
		Engenheiro eng = new Engenheiro("Miguel", "123.456.789-0", 2342);
		
		//String nome, String cpf
		Pessoa p = new Pessoa("Kleber", "098.765.432-1");
		
		//float metragemUnidade, int numQuartos, int numBanheiros, Pessoa proprietario
		UnidadeResidencial ud = new UnidadeResidencial(15, 2, 2, p);
		
		//float metragemTotal, String endereco, Engenheiro responsavel,UnidadeResidencial unidades
		Edificacao ed = new Edificacao(330, "Rua Paineiras 1", eng, ud);
		
		//float metragemTotal, String endereco, Engenheiro responsavel, UnidadeResidencial unidades,
		//String nomePredio, int numAndares, int apPorAndar
		Predio pre = new Predio(330, "Rua Paineira 1", eng, ud, "Elias Souza", 2, 1);
		Predio pre2 = new Predio(330, "Rua Paineira 1", eng, ud, "Maria Dias", 2, 3);
		
		Pessoa p1 = new Pessoa("Joao", "444.555.666-7");
				
		//float metragemUnidade, int numQuartos, int numBanheiros, Pessoa proprietario
	    UnidadeResidencial ud1 = new UnidadeResidencial(15, 3, 2, p1);
		
	    pre.setApartamentos(ud);
	    pre.setApartamentos(ud1);
	    
	    //System.out.println("--Predio e seus Apartamentos--");
	    System.out.println();
	    //System.out.println(pre.descricaoDoImovel());
	    //pre.ler();
	    
		//System.out.println(ud.descricaoDoImovel());
		System.out.println();
		//System.out.println(ud1.descricaoDoImovel());
		
		//float metragemTotal, String endereco, Engenheiro responsavel, UnidadeResidencial unidades,
		//double metragemCondominio, String proprietarioCondominio, String enderecoCondominio, 
		//int quantCasas, int Predios
		Condominio cond = new Condominio(5500, "Avenida Paz", eng, ud, 500, "Carlos Souza", "Av. das Bandeiras", 2);
		
		cond.setPredios(pre);
		cond.setPredios(pre2);
		
		//cond.ler();
		
		
		
		cond.infoCondominio();
	}

}
