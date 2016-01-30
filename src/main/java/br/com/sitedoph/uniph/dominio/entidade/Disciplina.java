package br.com.sitedoph.uniph.dominio.entidade;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TB_DISCIPLINA")
public class Disciplina {

	@Id
	@GeneratedValue
	@Column(name="MATRICULA")
	private Long id;
	
	@Column(name="DESCRICAO")
	private String Descricao;
	
	@ManyToOne
	@Column(name="PROFESSOR")
	private Professor professor;
	
	@Column(name="CARGAHORARIO")
	private String cargaHoraria;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
}
