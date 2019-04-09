
public class Sala {
	private int idSala;
	private static int contador = 1;
	private String DescSala;
	private EnumSala Status;
	
	public Sala() {
		this.init();
		this.setIdSala(contador++);
		this.getDescSala();

	}
	public void init() {
		System.out.println("Classe"+getClass().getName()+"instancia");
	}
	public void destroy() {
		
	}
	public int getIdSala() {
		return idSala;
	}
	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}
	public String getDescSala() {
		return DescSala;
	}
	public void setDescSala(String descSala) {
		DescSala = descSala;
	}
	public EnumSala getStatus() {
		return Status;
	}
	public void setStatus(EnumSala status) {
		Status = status;
	}
	
}
