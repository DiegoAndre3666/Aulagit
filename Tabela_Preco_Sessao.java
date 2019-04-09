
public class Tabela_Preco_Sessao {
	private int idTPS;
	private static int contador = 1;
	private String DescTPS;
	public Tabela_Preco_Sessao() {
		this.init();
		this.setIdTPS(contador++);
		this.getDescTPS();
	}
	public void init() {
		System.out.println("Classe"+getClass().getName()+"instancia");
	}
	public void destroy() {
		
	}
	public int getIdTPS() {
		return idTPS;
	}
	public void setIdTPS(int idTPS) {
		this.idTPS = idTPS;
	}
	public String getDescTPS() {
		return DescTPS;
	}
	public void setDescTPS(String descTPS) {
		DescTPS = descTPS;
	}
	
}
