
public class Tipo_Sala {
	private int idTipo_Sala;
	private static int contador = 1;
	private String Descricao;
	private EnumTipo_Sala Status;
	public Tipo_Sala() {
		this.init();
		this.getIdTipo_Sala();
		this.getDescricao();
		this.setIdTipo_Sala(contador++);
		
	}
	public void init() {
		System.out.println("Classe"+ this.getClass().getName()+ "instancia");
	}
	public void destroy() {
		
	}
	public int getIdTipo_Sala() {
		return idTipo_Sala;
	}
	public void setIdTipo_Sala(int idTipo_Sala) {
		this.idTipo_Sala = idTipo_Sala;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public EnumTipo_Sala getStatus() {
		return Status;
	}
	public void setStatus(EnumTipo_Sala status) {
		Status = status;
	}
	
}
