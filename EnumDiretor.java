
public enum EnumDiretor {
	ATIVO ("ativo"),
	INATIVO("inativo");
	private String Status;
	EnumDiretor(String Status) {
		this.Status=Status;
	}
	public String getStatus() {
		return this.Status;
	}
}
