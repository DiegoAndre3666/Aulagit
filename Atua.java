
public class Atua {
	private int idAtua;
	private static int contador =1;
	public Atua() {
		this.init();
		this.setIdAtua(contador++);
	}
	private void init() {
		System.out.println("Classe" + this.getClass().getName() + "instancia");
	}

	public void destroy() {

	}
	public int getIdAtua() {
		return idAtua;
	}
	public void setIdAtua(int idAtua) {
		this.idAtua = idAtua;
	}
	

}
