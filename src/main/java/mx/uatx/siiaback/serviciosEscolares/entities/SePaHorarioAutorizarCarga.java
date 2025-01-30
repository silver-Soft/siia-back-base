package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaHorarioAutorizarCarga {
	
	@Id
	@Column(name="IDHORARIOOFERTA")
	private Long idHorarioOferta;
	
	@Column(name="HRINICIO")
	private String hrInicio;

	@Column(name="HRTERMINO")
	private String hrTermino;

	@Column(name="CLDIA")
	private Integer dia;

	@Column(name="DSDIA")
	private String dsDia;

	@Column(name="DOCENTE")
	private String nbDocente;

	@Column(name="AULA")
	private String nbAula;

	@Column(name="MATERIA")
	private String nbMateria;

	@Column(name="IDOFERTA")
	private Long idOferta;

	@Column(name="GRUPO")
	private String dsGrupo;

	public Long getIdHorarioOferta() {
		return idHorarioOferta;
	}

	public void setIdHorarioOferta(Long idHorarioOferta) {
		this.idHorarioOferta = idHorarioOferta;
	}

	public String getHrInicio() {
		return hrInicio;
	}

	public void setHrInicio(String hrInicio) {
		this.hrInicio = hrInicio;
	}

	public String getHrTermino() {
		return hrTermino;
	}

	public void setHrTermino(String hrTermino) {
		this.hrTermino = hrTermino;
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
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

	public String getNbMateria() {
		return nbMateria;
	}

	public void setNbMateria(String nbMateria) {
		this.nbMateria = nbMateria;
	}

	public Long getIdOferta() {
		return idOferta;
	}

	public void setIdOferta(Long idOferta) {
		this.idOferta = idOferta;
	}

	public String getDsGrupo() {
		return dsGrupo;
	}

	public void setDsGrupo(String dsGrupo) {
		this.dsGrupo = dsGrupo;
	}
}
