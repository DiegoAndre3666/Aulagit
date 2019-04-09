
public enum EnumAtor {
	ATIVO ("ativo"),
	INATIVO("inativo");
	private String Status;
	EnumAtor(String Status) {
		this.Status=Status;
	}
	public String getStatus() {
		return this.Status;
	}
}
