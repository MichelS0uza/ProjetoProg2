
public class Funcionario extends Visitante{
	private String departamento;

	public Funcionario(String n, String tel, String rg, double ca, String dpt) {
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
