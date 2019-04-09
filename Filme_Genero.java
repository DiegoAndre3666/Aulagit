public class Filme_Genero {
	private int idPI;
	private static int contador = 1;
	

	public Filme_Genero() {
		this.init();
		this.getidFG();
		this.setidFG(contador++);
	}


	private void init() {
		System.out.println("Classe" + this.getClass().getName() + "instancia");
	}

	public void destroy() {

	}

	public int getidFG() {
		return idPI;
	}

	public void setidFG(int idPI) {
		this.idPI = idPI;
	}
}