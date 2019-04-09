
public enum EnumFilme {
	LIVRE ("Classificação Livre"),
	MAIOR12("Proibido para menor de 12 anos"),
	MAIOR14("Proibido para menor de 14 anos"),
	MAIOR16("Proibido para menor de 16 anos"),
	MAIOR18("Proibido para menor de 18 anos");
	
	private String Classificacao;
	EnumFilme(String Classificacao) {
		this.Classificacao = Classificacao;
		
	}
	public String getClassificacao() {
		return this.Classificacao;
	}
}
