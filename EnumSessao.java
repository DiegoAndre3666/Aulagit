
public enum EnumSessao {
	EXIBIDA ("ativo"),
	CANCELADA("cancelada");
	private String Status;
	EnumSessao(String Status) {
		this.Status=Status;
	}
	public String getStatus() {
		return this.Status;
	}

}
