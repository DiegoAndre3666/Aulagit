public class Diretor_Filme {
	private int idDF;
	private String descDF;
	private static int contador = 1;
	

	public Diretor_Filme() {
		this.init();
		this.getidDF();
		this.getdescDF(descDF);
		this.setidDF(contador++);
	}


	private void init() {
		System.out.println("Classe" + this.getClass().getName() + "instancia");
	}

	public void destroy() {

	}

	private void getdescDF(String descDF) {
		this.descDF = descDF;

	}

	private String setdescDF(String descDF) {
		return this.descDF;
	}

	public int getidDF() {
		return idDF;
	}

	public void setidDF(int idDF) {
		this.idDF = idDF;
	}
}