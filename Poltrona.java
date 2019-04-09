public class Poltrona {
	private int idPoltrona;
	private int numPoltrona;
	private static int contador = 1;
	private EnumStatus statusPoltrona;

	public Poltrona() {
		this.init();
		this.getidPoltrona();
		this.getnumPoltrona();
		this.setidPoltrona(contador++);
	}


	private void init() {
		System.out.println("Classe" + this.getClass().getName() + "instancia");
	}

	public void destroy() {

	}

	private void getnumPoltrona() {
		this.numPoltrona = numPoltrona;

	}

	private int setnumPoltrona(int numPoltrona) {
		return this.numPoltrona;
	}

	public EnumStatus getStatusPoltrona() {
		return statusPoltrona;
	}

	public void setStatusPoltrona(EnumStatus statusPoltrona) {
		this.statusPoltrona = statusPoltrona;
	}

	public int getidPoltrona() {
		return idPoltrona;
	}

	public void setidPoltrona(int idPoltrona) {
		this.idPoltrona = idPoltrona;
	}
}