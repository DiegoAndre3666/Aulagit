
public class Caixa {
	private int idCaixa;
	private EnumCaixa Status;
	private int NumCaixa;
	private static int contador =1;
	public Caixa() {
		this.init();
		this.getIdCaixa();
		this.getNumCaixa();
		this.setIdCaixa(contador++);
	}
	public void init() {
		System.out.println("Classe"+this.getClass().getName()+"instancia");
	}
	public void destroy() {
		
	}
	public int getIdCaixa() {
		return idCaixa;
	}
	public void setIdCaixa(int idCaixa) {
		this.idCaixa = idCaixa;
	}
	public int getNumCaixa() {
		return NumCaixa;
	}
	public void setNumCaixa(int numCaixa) {
		NumCaixa = numCaixa;
	}
	public EnumCaixa getStatus() {
		return Status;
	}
	public void setStatus(EnumCaixa status) {
		Status = status;
	}
	
}
