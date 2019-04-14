
public class Administrador extends Visitante {
	
	public Administrador(String n, String tel, String rg, double ca, String lg, String s){
	super(n, tel, rg, ca);
	setLogin(lg);
	setSenha(s);
	}
	
	private String login;
	private String senha;
	
	public void novoUsuario() {
		
	}
	public void novaChave() {
		
	}
	
	public void removerUsuario() {
		
	}
	
	public void mudarSenha() {
		
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
