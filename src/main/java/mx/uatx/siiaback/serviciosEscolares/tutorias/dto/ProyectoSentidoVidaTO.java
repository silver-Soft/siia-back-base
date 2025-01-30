package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;

import mx.uatx.siiaback.serviciosEscolares.entities.SePaObtDtProyectoDeVida;

public class ProyectoSentidoVidaTO implements Serializable {
	private long idProyecto;
	private String dsPeriodo;
	private String nbTutor;
	private String dsEspiritual;
	private String dsSocial;
	private String dsProductiva;
	private String dsAfectiva;
	private String dsCognitiva;
	private String dsFisica;
	private String Matricula;
	private String nbTutorado;
	
	public ProyectoSentidoVidaTO(){
		super();
	}
	
	public ProyectoSentidoVidaTO(final SePaObtDtProyectoDeVida entidad){
		BeanUtils.copyProperties(entidad, this);
	}
	
	public String getDsPeriodo() {
		return dsPeriodo;
	}
	public void setDsPeriodo(String dsPeriodo) {
		this.dsPeriodo = dsPeriodo;
	}
	public String getNbTutor() {
		return nbTutor;
	}
	public void setNbTutor(String nbTutor) {
		this.nbTutor = nbTutor;
	}
	public String getDsEspiritual() {
		return dsEspiritual;
	}
	public void setDsEspiritual(String dsEspiritual) {
		this.dsEspiritual = dsEspiritual;
	}
	public String getDsSocial() {
		return dsSocial;
	}
	public void setDsSocial(String dsSocial) {
		this.dsSocial = dsSocial;
	}
	public String getDsProductiva() {
		return dsProductiva;
	}
	public void setDsProductiva(String dsProductiva) {
		this.dsProductiva = dsProductiva;
	}
	public String getDsAfectiva() {
		return dsAfectiva;
	}
	public void setDsAfectiva(String dsAfectiva) {
		this.dsAfectiva = dsAfectiva;
	}
	public String getDsCognitiva() {
		return dsCognitiva;
	}
	public void setDsCognitiva(String dsCognitiva) {
		this.dsCognitiva = dsCognitiva;
	}
	public String getDsFisica() {
		return dsFisica;
	}
	public void setDsFisica(String dsFisica) {
		this.dsFisica = dsFisica;
	}
	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	public String getNbTutorado() {
		return nbTutorado;
	}

	public void setNbTutorado(String nbTutorado) {
		this.nbTutorado = nbTutorado;
	}
	public long getIdProyecto() {
		return idProyecto;
	}
	public void setIdProyecto(long idProyecto) {
		this.idProyecto = idProyecto;
	}


	
}
