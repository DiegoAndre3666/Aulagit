
public class Caixa_OP_Caixa {
	private int idCaixaOPCaixa;
	private static int contador = 1;
	private boolean Presenca;
	public Caixa_OP_Caixa() {
		this.init();
		this.getIdCaixaOPCaixa();
		this.isPresenca();
		this.setIdCaixaOPCaixa(contador++);
	}
	public void init(){
		System.out.println("Classe"+ this.getClass().getName()+ "instancia");
	}
	public void destroy() {
		
	}
	public int getIdCaixaOPCaixa() {
		return idCaixaOPCaixa;
	}
	public void setIdCaixaOPCaixa(int idCaixaOPCaixa) {
		this.idCaixaOPCaixa = idCaixaOPCaixa;
	}
	public boolean isPresenca() {
		return Presenca;
	}
	public void setPresenca(boolean presenca) {
		Presenca = presenca;
	}
	
}
