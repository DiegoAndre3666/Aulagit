
public enum EnumSala {
	ATIVO ("ativo"),
	INATIVO("inativo"),
	MANUTENCAO("manutenção");
	private String Status;
	EnumSala(String Status) {
		this.Status=Status;
	}
	public String getStatus() {
		return this.Status;
	}
}
