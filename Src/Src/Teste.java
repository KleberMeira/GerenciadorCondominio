package estruturas;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/// String nome, String cpf
		Pessoa pe = new Pessoa("Kleber Meira", "987.654.321-0");

		// float metragemUnidade, int numQuartos, int numBanheiros, Pessoa proprietario
		UnidadeResidencial ur = new UnidadeResidencial(34, 2, 2, pe);

		// System.out.println(ur.descricaoDoImovel());

		// String nome, String cpf, int crea
		Engenheiro engenheiro = new Engenheiro("Eng. Astolfo Pires", "123.456.789.0", 123456);
		engenheiro.infoPessoa();

		// double metragemCondominio, String proprietarioComdominio, String
		// enderecoCondominio, int qtCasas, int qtPredios
		Condominio c = new Condominio(1400, "Portal das Paineiras", "Rua Brasil", 5, 2);

		// String nome, int numAndares, int apPorAndar, float metragem, String endereco
		Predio p = new Predio("Luis Guimarães", 2, 3, 200.5f, "rua 12");
		//p.cadastraApartamento(ur);
		
		Predio r = new Predio("Alberto Tomaz", 4, 1, 456.2f, "rua 11");
		Predio e = new Predio("Albuquerque ", 6, 1, 200, "rua 10");

		// int numAndares
		Casa d = new CasaSobrado(2);
		c.addCasa(d);

		c.addPredio(p);
		c.addPredio(r);
		c.addPredio(e);

		c.infoCondominio();
		System.out.println(ur.descricaoDoImovel());

	}

}
