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
@Table(schema = "SERESC", name = "SECTMATERIAS")
public class SeCtMaterias implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1649162861880113868L;

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDMATERIA", sequenceName = "SERESC.IDMATERIA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDMATERIA")
	@NotNull
	
	
	@Column(name = "IDMATERIA")
	private Long lngIdMateria;
	
	@Column(name = "IDAREAESTUDIO")
	private Integer intIdAreaEstudio;
	
	@Column(name = "DSMATERIA")
	private String strDsMateria;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;
	
	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;
	
	@Column(name= "DSMATERIAORDEN")
	private String strDsMateriaOrden;
	
	@Column(name = "CVEMAT")
	private Long lngCveMat;

	public Long getLngIdMateria() {
		return lngIdMateria;
	}

	public void setLngIdMateria(Long lngIdMateria) {
		this.lngIdMateria = lngIdMateria;
	}

	public Integer getIntIdAreaEstudio() {
		return intIdAreaEstudio;
	}

	public void setIntIdAreaEstudio(Integer intIdAreaEstudio) {
		this.intIdAreaEstudio = intIdAreaEstudio;
	}

	public String getStrDsMateria() {
		return strDsMateria;
	}

	public void setStrDsMateria(String strDsMateria) {
		this.strDsMateria = strDsMateria;
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

	public String getStrDsMateriaOrden() {
		return strDsMateriaOrden;
	}

	public void setStrDsMateriaOrden(String strDsMateriaOrden) {
		this.strDsMateriaOrden = strDsMateriaOrden;
	}

	public Long getLngCveMat() {
		return lngCveMat;
	}

	public void setLngCveMat(Long lngCveMat) {
		this.lngCveMat = lngCveMat;
	}
	
}
