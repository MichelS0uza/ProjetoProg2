public class Aluno extends Visitante {
	
	private String turno;
	private String Curso;
	private String matricula;

	public Aluno() {
		// TODO Stub de construtor gerado automaticamente
	}
	public Aluno(String n, String tel, String rg, double ca, String t, String c, String mat) {
		super(n, tel, rg, ca);
		this.setTurno(t);
		this.setCurso(c);
		this.setMatricula(mat);
		
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
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	} 

}
