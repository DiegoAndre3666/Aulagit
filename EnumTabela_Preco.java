
public enum EnumTabela_Preco {
	MEIA ("meia"),
	INTEIRA("inteira"),
	MEIADAMEIA("meia da meia");
	private String Status;
	EnumTabela_Preco(String Status){
		this.Status = Status;
	}
	public String getStatus() {
		return this.Status;
	}
}
