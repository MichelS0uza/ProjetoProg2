
public class Visitante {

	private	String nome;
	private	String telefone;
	private	String rg;
	private	double codigoAcesso;
	
	public Visitante() {
		
	}
	
	public Visitante(String n, String tel, String rg, double ca) {
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
	public void setCodigoAcesso(double codigoAcesso) {
		this.codigoAcesso = codigoAcesso;
	}
}
