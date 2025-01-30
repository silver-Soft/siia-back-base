package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtActasMaterias implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7381532755951862414L;

	@Id
	@Column(name = "IDACTA")
	private Long lngIdActa;

	@Column(name = "CLESTATUSACTA")
	private String strClEstatusActa;

	@Column(name = "DSTIPOACREDITACION")
	private String strTipoAcreditacion;

	@Column(name = "PERMITECALIFICAR")
	private Boolean blnPermiteCalificar;

	@Column(name = "MOSTRARPROMEDIO")
	private Boolean blnMostrarPromedio;
	
	@Column(name = "FCREGISTROACTA")
	private Date fcRegistroActa;

	public String getStrClEstatusActa() {
		return strClEstatusActa;
	}

	public void setStrClEstatusActa(String strClEstatusActa) {
		this.strClEstatusActa = strClEstatusActa;
	}

	public String getStrTipoAcreditacion() {
		return strTipoAcreditacion;
	}

	public void setStrTipoAcreditacion(String strTipoAcreditacion) {
		this.strTipoAcreditacion = strTipoAcreditacion;
	}

	public Boolean getBlnPermiteCalificar() {
		return blnPermiteCalificar;
	}

	public void setBlnPermiteCalificar(Boolean blnPermiteCalificar) {
		this.blnPermiteCalificar = blnPermiteCalificar;
	}

	public Long getLngIdActa() {
		return lngIdActa;
	}

	public void setLngIdActa(Long lngIdActa) {
		this.lngIdActa = lngIdActa;
	}

	public Boolean getBlnMostrarPromedio() {
		return blnMostrarPromedio;
	}

	public void setBlnMostrarPromedio(Boolean blnMostrarPromedio) {
		this.blnMostrarPromedio = blnMostrarPromedio;
	}

	public Date getFcRegistroActa() {
		return fcRegistroActa;
	}

	public void setFcRegistroActa(Date fcRegistroActa) {
		this.fcRegistroActa = fcRegistroActa;
	}

}
