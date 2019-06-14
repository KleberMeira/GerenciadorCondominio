
public class CasaSobrado extends Casa {

	private int numAndares;

	public CasaSobrado(float metragemTotal, String endereco, Engenheiro responsavel, UnidadeResidencial unidades,
			boolean condominio, int numAndares) {
		super(metragemTotal, endereco, responsavel, unidades, condominio);
		this.numAndares = numAndares;
	}

	public int getNumAndares() {
		return numAndares;
	}

	public void setNumAndares(int numAndares) {
		this.numAndares = numAndares;
	}

}
