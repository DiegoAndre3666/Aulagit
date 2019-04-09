
public enum EnumPolt_Ingresso {
	LIVRE ("livre"),
	RESERVADO("reservado"),
	OCUPADO("ocupado");
	private String Status;
	EnumPolt_Ingresso(String Status) {
		this.Status=Status;
	}
	public String getStatus() {
		return this.Status;
	}
}

