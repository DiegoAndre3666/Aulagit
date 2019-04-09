
public class Ator {
	private int idAtor;
	private String nomeAtor;
	private static int contador = 1;
	private EnumStatus statusAtor;

	public Ator() {
		this.init();
		this.getidAtor();
		this.getnomeAtor(nomeAtor);
		this.setidAtor(contador++);
	}


	private void init() {
		System.out.println("Classe" + this.getClass().getName() + "instancia");
	}

	public void destroy() {

	}

	private void getnomeAtor(String nomeAtor) {
		this.nomeAtor = nomeAtor;

	}

	public String getnomeAtor1() {
		return this.nomeAtor;
	}

	private String setnomeAtor(String nomeAutor) {
		return this.nomeAtor;
	}

	public EnumStatus getStatusAtor() {
		return statusAtor;
	}

	public void setStatusAtor(EnumStatus statusAtor) {
		this.statusAtor = statusAtor;
	}

	public int getidAtor() {
		return idAtor;
	}

	public void setidAtor(int idAtor) {
		this.idAtor = idAtor;
	}
}
