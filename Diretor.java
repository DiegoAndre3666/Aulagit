public class Diretor {
	private int idDiretor;
	private String nomeDiretor;
	private static int contador = 1;
	private EnumStatus statusDiretor;

	public Diretor() {
		this.init();
		this.getidDiretor();
		this.getnomeDiretor(nomeDiretor);
		this.setidDiretor(contador++);
	}


	private void init() {
		System.out.println("Classe" + this.getClass().getName() + "instancia");
	}

	public void destroy() {

	}

	private void getnomeDiretor(String nomeDiretor) {
		this.nomeDiretor = nomeDiretor;

	}

	private String setnomeDiretor(String nomeDiretor) {
		return this.nomeDiretor;
	}

	public EnumStatus getStatusDiretor() {
		return statusDiretor;
	}

	public void setStatusDiretor(EnumStatus statusDiretor) {
		this.statusDiretor = statusDiretor;
	}

	public int getidDiretor() {
		return idDiretor;
	}

	public void setidDiretor(int idDiretor) {
		this.idDiretor = idDiretor;
	}
}
