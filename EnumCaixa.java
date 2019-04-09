
public enum EnumCaixa {
	ATIVO ("ativo"),
	INATIVO("inativo"),
	MANUTENCAO("Em Manutenção");
	private String Status;
	EnumCaixa(String Status) {
		this.Status=Status;
	}
	public String getStatus() {
		return this.Status;
	}
}

