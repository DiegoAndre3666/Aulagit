public class Poltrona_Ingresso {
	private int idPI;
	private String descPI;
	private static int contador = 1;
	

	public Poltrona_Ingresso() {
		this.init();
		this.getidPI();
		this.getdescPI(descPI);
		this.setidPI(contador++);
	}


	private void init() {
		System.out.println("Classe" + this.getClass().getName() + "instancia");
	}

	public void destroy() {

	}

	private void getdescPI(String descPI) {
		this.descPI = descPI;

	}

	private String setdescPI(String descPI) {
		return this.descPI;
	}

	public int getidPI() {
		return idPI;
	}

	public void setidPI(int idPI) {
		this.idPI = idPI;
	}
}