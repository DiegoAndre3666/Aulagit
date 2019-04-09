
public enum EnumTipo_Sala {
	VIP("ativo"),
	Sala_3D("inativo"),
	SALA_NORMAL("sala normal"),
	SALA_3D_SOM("sala 3D Som"),
	SALA_SOM("sala som");
	private String Status;
	EnumTipo_Sala(String Status) {
		this.Status=Status;
	}
	public String getStatus() {
		return this.Status;
	}
}
