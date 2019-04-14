
public class Aluno extends Visitante {
	
	private String turno;
	private String Curso;
	

	public Aluno(String n, String tel, String rg, double ca, String t, String c) {
		super(n, tel, rg, ca);
		setTurno(t);
		setCurso(c);
		
	}
	
	public void info() {
		
		getCurso();
		getTurno();
		
	}
	
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getCurso() {
		return Curso;
	}
	public void setCurso(String curso) {
		Curso = curso;
	} 

}
