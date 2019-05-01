
public class Administrador extends Pessoa{

	private String login;
	private String senha;
	private Aluno al;
	private Professor pr;
	private Funcionario func;
	private Visitante vi;
	private Administrador admin;

	public Administrador() {

	}

	public Administrador(String n, String tel, String rg, int ca, String lg, String s) {
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

	public Aluno novoAluno() {

		return this.al = new Aluno();
	}

	public Professor novoProfessor() {

		return this.pr = new Professor();
	}

	public Funcionario novoFuncionario() {

		return this.func = new Funcionario();
	}

	public Visitante novoVisitante() {

		return this.vi = new Visitante();
	}

	public Administrador novoAdm() {
		
		return this.admin = new Administrador();
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
