
public enum EnumIdioma {
	PORTUGUES ("Portugues"),
	INGLES("Ingles"),
	ALEMAO("Alem�o"),
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
