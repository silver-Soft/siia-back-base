package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtHorarioEstudiante implements Serializable{
	
	@Id
	@Column(name = "IDHORARIOOFERTA")
	private Long idHorarioOferta;
	
	@Column(name = "HRINICIO")
	private String horaInicio; 
	
	@Column(name = "HRTERMINO")
	private String horaFin;

	@Column(name = "CLDIA")
	private Integer idDia;

	@Column(name = "DSDIA")
	private String dsDia;

	@Column(name = "DOCENTE")
	private String nbDocente;

	@Column(name = "AULA")
	private String nbAula;

	@Column(name = "MATERIA")
	private String dsMateria;
	
	@Column(name = "IDOFERTA")
	private Integer idOferta;
	
	@Column(name = "GRUPO")
	private String dsgrupo;
	
	public Long getIdHorarioOferta() {
		return idHorarioOferta;
	}
	public void setIdHorarioOferta(Long idHorarioOferta) {
		this.idHorarioOferta = idHorarioOferta;
	}
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public String getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}
	public Integer getIdDia() {
		return idDia;
	}
	public void setIdDia(Integer idDia) {
		this.idDia = idDia;
	}
	public String getDsDia() {
		return dsDia;
	}
	public void setDsDia(String dsDia) {
		this.dsDia = dsDia;
	}
	public String getNbDocente() {
		return nbDocente;
	}
	public void setNbDocente(String nbDocente) {
		this.nbDocente = nbDocente;
	}
	public String getNbAula() {
		return nbAula;
	}
	public void setNbAula(String nbAula) {
		this.nbAula = nbAula;
	}
	public String getDsMateria() {
		return dsMateria;
	}
	public void setDsMateria(String dsMateria) {
		this.dsMateria = dsMateria;
	}
	public Integer getIdOferta() {
		return idOferta;
	}
	public void setIdOferta(Integer idOferta) {
		this.idOferta = idOferta;
	}
	public String getDsgrupo() {
		return dsgrupo;
	}
	public void setDsgrupo(String dsgrupo) {
		this.dsgrupo = dsgrupo;
	}

}
