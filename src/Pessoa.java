
public abstract class Pessoa {

	private	String nome;
	private	String telefone;
	private	String rg;
	private	int codigoAcesso;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String n, String tel, String rg, int ca) {
		this.setNome(n);
		this.setTelefone(tel);
		this.setRg(rg);
		this.setCodigoAcesso(ca);
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
	public void setCodigoAcesso(int codigoAcesso) {
		this.codigoAcesso = codigoAcesso;
	}
}
