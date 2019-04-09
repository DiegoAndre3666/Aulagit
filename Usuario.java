
public class Usuario {

	private int idUsuario;
	private String nomeUsuario;
	private String Senha;
	private static int contador = 1;
	private EnumStatus statusUsuario;
	public Usuario(){
		this.init();
		this.getidUsuario();
		this.getnomeUsuario();
		this.getSenha();
		this.idUsuario = contador++;
	}
	
	public void init() {
		System.out.println("Classe"+ this.getClass().getName()+ "instancia");
	}
	public void destroy() {
		
	}
	public void setidUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public void setnomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	private void setSenha(String Senha) {
		this.Senha = Senha;
	}
	public int getidUsuario() {
		return this.idUsuario;
	}
	public String getnomeUsuario() {
		return this.nomeUsuario;
	}
	private String getSenha() {
		return Senha;
	}
	public EnumStatus getStatusUsuario() {
		return this.statusUsuario;
	}
	public void setStatusUsuario(EnumStatus statusUsuario) {
		this.statusUsuario = statusUsuario;
	}
}

