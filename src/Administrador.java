
public class Administrador extends Visitante {

	private String login;
	private String senha;

	public Administrador(String n, String tel, String rg, double ca, String lg, String s) {
		super(n, tel, rg, ca);
		this.setLogin(lg);
		this.setSenha(s);
	}

	// Insere o usuário de acordo com o número do seu id:
	// Visitante id = 00
	// Aluno id = 01
	// professor id = 02
	// Funcionário id = 03
	// Adm id = 04

	public Aluno novoUsuario() {
		Aluno al = new Aluno();		
		return al;
	}
	
	public void removerUsuario() {
		// TODO Stub de método gerado automaticamente

	}

	public void gerarSenha() {
		// TODO Stub de método gerado automaticamente

	}

	public void mudarSenha() {
		// TODO Stub de método gerado automaticamente

	}

	public void gerarChave() {
		// TODO Stub de método gerado automaticamente

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
