import java.sql.Timestamp;

public class Filme {
	private int idFilme;
	private String descFilme;
	private String nomeFilme;
	private Timestamp data;
	private static int contador = 1;
	private EnumFilme Classificacao;
	

	public Filme() {
		this.init();
		this.getidFilme();
		this.getNomeFilme();
		this.getdescFilme(descFilme);
		this.setidFilme(contador++);
		
	}


	private void init() {
		System.out.println("Classe" + this.getClass().getName() + "instancia");
	}

	public void destroy() {

	}

	private void getdescFilme(String descFilme) {
		this.descFilme = descFilme;

	}

	private String setdescFilme(String descFilme) {
		return this.descFilme;
	}

	public int getidFilme() {
		return idFilme;
	}

	public void setidFilme(int idFilme) {
		this.idFilme = idFilme;
	}


	public EnumFilme getClassificacao() {
		return Classificacao;
	}


	public void setClassificacao(EnumFilme classificacao) {
		Classificacao = classificacao;
	}


	public String getNomeFilme() {
		return nomeFilme;
	}


	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}


	public Timestamp getData() {
		return data;
	}


	public void setData(Timestamp data) {
		this.data = data;
	}
}
