package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "SERESC", name = "SEAXHORARIOOFERTA")
public class SeAxHorarioOferta implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5452918771675821149L;

	private static final String GENID_ID_HORARIO_OFERTA = "GENIDHORARIOOFERTA";

	@Id
	@Column(name = "IDHORARIOOFERTA")
	@SequenceGenerator(name = GENID_ID_HORARIO_OFERTA, sequenceName = "SERESC.IDHORARIOOFERTA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENID_ID_HORARIO_OFERTA)
	private Integer intIdHorarioOferta;

	@Column(name = "CLDIA")
	private Integer intClDia;

	@Column(name = "HRINICIO")
	private String horaInicio;

	@Column(name = "HRTERMINO")
	private String horaFin;

	@Column(name = "IDESPACIO")
	private Integer intIdEspacio;

	@Column(name = "IDOFERTADOCENTE")
	private Integer intIdOfertaDocente;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit = new Date();

	public SeAxHorarioOferta() {
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

	public Integer getIntIdEspacio() {
		return intIdEspacio;
	}

	public void setIntIdEspacio(Integer intIdEspacio) {
		this.intIdEspacio = intIdEspacio;
	}

	public Integer getIntIdOfertaDocente() {
		return intIdOfertaDocente;
	}

	public void setIntIdOfertaDocente(Integer intIdOfertaDocente) {
		this.intIdOfertaDocente = intIdOfertaDocente;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

}
