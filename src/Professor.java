
public class Professor extends Visitante{

	private String matricula;
	private String departamento;
	
	public Professor(String n, String tel, String rg, double ca, String mat, String dpt) {
		super(n, tel, rg, ca);
		
		this.setNome(n);
		this.setTelefone(tel);
		this.setRg(rg);
		this.setCodigoAcesso(ca);
		this.setDepartamento(dpt);
		this.setMatricula(mat);
		
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
