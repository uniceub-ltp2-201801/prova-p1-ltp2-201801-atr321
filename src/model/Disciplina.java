package model;

public class Disciplina {
	
	private int idDisciplina;
	private String nomeDisciplina;
	private String cursoDisciplina;
	private int cargaHorariaDisciplina;
	private int idProfessor;
	
	public Disciplina(int idDisciplina, String nomeDisciplina, String cursoDisciplina, int cargaHorariaDisciplina, int idProfessor) {
		super();
		this.idDisciplina = idDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.cursoDisciplina = cursoDisciplina;
		this.cargaHorariaDisciplina = cargaHorariaDisciplina;
		this.idProfessor = idProfessor;
	}
	
	
	public int getIdDisciplina() {
		return idDisciplina;
	}
	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public String getCursoDisciplina() {
		return cursoDisciplina;
	}
	public void setCursoDisciplina(String cursoDisciplina) {
		this.cursoDisciplina = cursoDisciplina;
	}
	public int getCargaHorariaDisciplina() {
		return cargaHorariaDisciplina;
	}
	public void setCargaHorariaDisciplina(int cargaHorariaDisciplina) {
		this.cargaHorariaDisciplina = cargaHorariaDisciplina;
	}
	public int getIdProfessor() {
		return idProfessor;
	}
	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}
	

}
