package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaHorarioOferta implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5452918771675821149L;

	@Id
	@Column(name = "IDHORARIOOFERTA")
	private Integer intIdHorarioOferta;

	@Column(name = "CLDIA")
	private Integer intClDia;

	@Column(name = "DSDIA")
	private String strDescDia;

	@Column(name = "DOCENTE")
	private String strDocente;

	@Column(name = "AULA")
	private String strAula;

	@Column(name = "HRINICIO")
	private String horaInicio;

	@Column(name = "HRTERMINO")
	private String horaFin;

	public SePaHorarioOferta() {
		super();
	}

	public Integer getIntIdHorarioOferta() {
		return intIdHorarioOferta;
	}

	public void setIntIdHorarioOferta(Integer intIdHorarioOferta) {
		this.intIdHorarioOferta = intIdHorarioOferta;
	}

	public Integer getIntClDia() {
		return intClDia;
	}

	public void setIntClDia(Integer intClDia) {
		this.intClDia = intClDia;
	}

	
	
	

	public String getStrDescDia() {
		return strDescDia;
	}

	public void setStrDescDia(String strDescDia) {
		this.strDescDia = strDescDia;
	}

	public String getStrDocente() {
		return strDocente;
	}

	public void setStrDocente(String strDocente) {
		this.strDocente = strDocente;
	}

	public String getStrAula() {
		return strAula;
	}

	public void setStrAula(String strAula) {
		this.strAula = strAula;
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

}
