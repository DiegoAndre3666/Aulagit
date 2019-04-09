
public class Genero {
	private int idGenero;
	private String descGenero;
	private static int contador = 1;
	

	public Genero() {
		this.init();
		this.getidGenero();
		this.getdescGenero(descGenero);
		this.setidGenero(contador++);
	}


	private void init() {
		System.out.println("Classe" + this.getClass().getName() + "instancia");
	}

	public void destroy() {

	}

	private void getdescGenero(String descGenero) {
		this.descGenero = descGenero;

	}

	private String setdescGenero(String descGenero) {
		return this.descGenero;
	}

	public int getidGenero() {
		return idGenero;
	}

	public void setidGenero(int idGenero) {
		this.idGenero = idGenero;
	}
}