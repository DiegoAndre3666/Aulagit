
public enum EnumPoltrona {
	ATIVO ("ativo"),
	INATIVO("inativo"),
	MANUTENCAO("manuten��o");
	private String Status;
	EnumPoltrona(String Status) {
		this.Status=Status;
	}
	public String getStatus() {
		return this.Status;
	}
}



