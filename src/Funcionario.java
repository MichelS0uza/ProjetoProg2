
public class Funcionario extends Pessoa{
	private String departamento;

	public Funcionario() {
		
	}
	
	public Funcionario(String n, String tel, String rg, int ca, String dpt) {
		super(n, tel, rg, ca);
		setDepartamento(dpt);
		
	}
	
	//Método temporário para visualizar os dados
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}
