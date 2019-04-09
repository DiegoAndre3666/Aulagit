
public class Tabela_Preco {
	private int idTP;
	private static int contador = 1;
	private double Valor;
	private EnumTabela_Preco Desconto;
	public Tabela_Preco() {
		this.init();
		this.getIdTP();
		this.getValor();
		this.setIdTP(contador++);
	}
	public void init() {
		System.out.println("Classe"+this.getClass().getName()+"instancia");
	}
	public void destroy() {
		
	}
	public int getIdTP() {
		return idTP;
	}
	public void setIdTP(int idTP) {
		this.idTP = idTP;
	}
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) {
		Valor = valor;
	}
	public EnumTabela_Preco getDesconto() {
		return Desconto;
	}
	public void setDesconto(EnumTabela_Preco desconto) {
		Desconto = desconto;
	}
	
}
