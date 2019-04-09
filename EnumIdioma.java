
public enum EnumIdioma {
	PORTUGUES ("Portugues"),
	INGLES("Ingles"),
	ALEMAO("Alemão"),
	JAPONES("Japones"),
	ESPANHOL("Espanhol"),
	FRANCES("Frances"),
	CHINES("Chines");
	private String Linguagem;
	EnumIdioma(String Linguagem) {
		this.Linguagem=Linguagem;
	}
	public String getLinguagem() {
		return this.Linguagem;
	}
}
