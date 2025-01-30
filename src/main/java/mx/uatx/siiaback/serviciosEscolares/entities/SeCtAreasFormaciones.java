package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.sun.istack.NotNull;

@Entity
@Table(schema = "SERESC", name = "SECTAREASFORMACIONES")
public class SeCtAreasFormaciones implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4281889055409912926L;
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDAREAFORMACION", sequenceName = "SERESC.IDAREAFORMACION", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDAREAFORMACION")
	@NotNull
	
	
	@Column(name = "IDAREAFORMACION")
	private Integer intIdAreaFormacion;
	
	@Column(name = "DSAREAFORMACION")
	private String strDsAreaFormacion;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;
	
	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;
	
	@Column(name = "NMORDEN")
	private Integer intNmOrden;

	public Integer getIntIdAreaFormacion() {
		return intIdAreaFormacion;
	}

	public void setIntIdAreaFormacion(Integer intIdAreaFormacion) {
		this.intIdAreaFormacion = intIdAreaFormacion;
	}

	public String getStrDsAreaFormacion() {
		return strDsAreaFormacion;
	}

	public void setStrDsAreaFormacion(String strDsAreaFormacion) {
		this.strDsAreaFormacion = strDsAreaFormacion;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public Integer getIntNmOrden() {
		return intNmOrden;
	}

	public void setIntNmOrden(Integer intNmOrden) {
		this.intNmOrden = intNmOrden;
	}
	
}
