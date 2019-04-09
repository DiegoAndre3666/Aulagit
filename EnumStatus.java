
public enum EnumStatus {
	ATIVO ("ativo"),
	INATIVO("inativo");
	private String Status;
	
	EnumStatus(String Status) {
		this.Status=Status;
	}
	public String getStatus() {
		return this.Status;
	}
}
