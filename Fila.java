public class Fila {
	private int idFila;
	private String descFila;
	private static int contador = 1;
	

	public Fila() {
		this.init();
		this.getidFila();
		this.getdescFila(descFila);
		this.setidFila(contador++);
	}


	private void init() {
		System.out.println("Classe" + this.getClass().getName() + "instancia");
	}

	public void destroy() {

	}

	private void getdescFila(String descFila) {
		this.descFila = descFila;

	}

	private String setdescFila(String descFila) {
		return this.descFila;
	}

	public int getidFila() {
		return idFila;
	}

	public void setidFila(int idFila) {
		this.idFila = idFila;
	}
}