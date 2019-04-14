
public class Visitante {

	private	String nome;
	private	String telefone;
	private	String rg;
	private	double codigoAcesso;
	
	public Visitante(String n, String tel, String rg, double ca) {
		setNome(n);
		setTelefone(tel);
		setRg(rg);
		setCodigoAcesso(ca);		
	}
	
	public void info() {
		System.out.println("su nombre és: "+ getNome());
		System.out.println("O Rg é: "+ getRg());
		System.out.println("Telefone para contato: "+ getTelefone());
		System.out.println("Codigo de acesso: "+ getCodigoAcesso());	
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public double getCodigoAcesso() {
		return codigoAcesso;
	}
	public void setCodigoAcesso(double codigoAcesso) {
		this.codigoAcesso = codigoAcesso;
	}
}
