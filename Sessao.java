import java.sql.Timestamp;

public class Sessao {
	private int idSessao;
	private Timestamp DTInicio;
	private Timestamp DTFinal;
	private EnumIdioma Linguagem;
	private EnumSessao Status;
	private String Observacao;
	private static int contador = 1;
	public Sessao() {
		this.init();
		this.getDTInicio();
		this.getDTFinal();
		this.getObservacao();
		this.setIdSessao(contador++);
	}
	private void init() {
		System.out.println("Classe"+ this.getClass().getName()+"instancia");
	}
	public void destroy() {
		
	}
	public int getIdSessao() {
		return idSessao;
	}
	public void setIdSessao(int idSessao) {
		this.idSessao = idSessao;
	}
	public Timestamp getDTInicio() {
		return DTInicio;
	}
	public void setDTInicio(Timestamp dTInicio) {
		DTInicio = dTInicio;
	}
	public Timestamp getDTFinal() {
		return DTFinal;
	}
	public void setDTFinal(Timestamp dTFinal) {
		DTFinal = dTFinal;
	}
	public EnumIdioma getLinguagem() {
		return Linguagem;
	}
	public void setLinguagem(EnumIdioma linguagem) {
		Linguagem = linguagem;
	}
	public String getObservacao() {
		return Observacao;
	}
	public void setObservacao(String observacao) {
		Observacao = observacao;
	}
	public EnumSessao getStatus() {
		return Status;
	}
	public void setStatus(EnumSessao status) {
		Status = status;
	}
	
}
