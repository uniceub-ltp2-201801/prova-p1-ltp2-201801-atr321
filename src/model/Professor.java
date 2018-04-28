package model;

import java.sql.Date;

public class Professor {
private int idProfessor;
private String nomeprofessor;
private Date dataNascProfessor;
private String nomeMaeProfessor;
private int titulacaoProfessor;

public Professor(int idProfessor, String nomeprofessor, Date dataNascProfessor, String nomeMaeProfessor,
		int titulacaoProfessor) {
	super();
	this.idProfessor = idProfessor;
	this.nomeprofessor = nomeprofessor;
	this.dataNascProfessor = dataNascProfessor;
	this.nomeMaeProfessor = nomeMaeProfessor;
	this.titulacaoProfessor = titulacaoProfessor;
}

public int getIdProfessor() {
	return idProfessor;
}
public void setIdProfessor(int idProfessor) {
	this.idProfessor = idProfessor;
}
public String getNomeprofessor() {
	return nomeprofessor;
}
public void setNomeprofessor(String nomeprofessor) {
	this.nomeprofessor = nomeprofessor;
}
public Date getDataNascProfessor() {
	return dataNascProfessor;
}
public void setDataNascProfessor(Date dataNascProfessor) {
	this.dataNascProfessor = dataNascProfessor;
}
public String getNomeMaeProfessor() {
	return nomeMaeProfessor;
}
public void setNomeMaeProfessor(String nomeMaeProfessor) {
	this.nomeMaeProfessor = nomeMaeProfessor;
}
public int getTitulacaoProfessor() {
	return titulacaoProfessor;
}
public void setTitulacaoProfessor(int titulacaoProfessor) {
	this.titulacaoProfessor = titulacaoProfessor;
}




}
