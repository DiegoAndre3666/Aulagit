import java.sql.Timestamp;

public class Ingresso {
	private int idIngresso;
	private static int contador =1;
	private boolean Validade;
	private Timestamp Data;
	public Ingresso() {
		this.init();
		this.getIdIngresso();
		this.isValidade();
		this.idIngresso = contador++;
	}
	public void init() {
		System.out.println("Classe"+ this.getClass().getName()+ "instancia");
	}
	public void destroy() {
		
	}
	public int getIdIngresso() {
		return idIngresso;
	}
	public void setIdIngresso(int idIngresso) {
		this.idIngresso = idIngresso;
	}
	public boolean isValidade() {
		return Validade;
	}
	public void setValidade(boolean validade) {
		Validade = validade;
	}
	public Timestamp getData() {
		return Data;
	}
	public void setData(Timestamp data) {
		Data = data;
	}
}
