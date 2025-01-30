package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDtProyectoDeVida implements Serializable {
	
	@Id
	@Column(name = "DSPERIODOTEMPORADA")
	private String dsPeriodo;
	@Column(name = "NBTUTOR")
	private String nbTutor;
	@Column(name = "ESPIRITUAL")
	private String dsEspiritual;
	@Column(name = "SOCIAL")
	private String dsSocial;
	@Column(name = "PRODUCTIVA")
	private String dsProductiva;
	@Column(name = "AFECTIVA")
	private String dsAfectiva;
	@Column(name = "COGNITIVA")
	private String dsCognitiva;
	@Column(name = "FISICA")
	private String dsFisica;
	
	public SePaObtDtProyectoDeVida(){
		super();
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

	public String getDsPeriodo() {
		return dsPeriodo;
	}

	public void setDsPeriodo(String dsPeriodo) {
		this.dsPeriodo = dsPeriodo;
	}
	
	
	
	
}