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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * 
 */
@Entity
@Table(schema = "SERESC", name = "SECTPROGRAMASEDUCATIVOS")
public class SeCtProgramaEducativo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDPROGRAMAEDUCATIVO", sequenceName = "SERESC.IDPROGRAMAEDUCATIVO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDPROGRAMAEDUCATIVO")
	private int idprogramaeducativo;
	private String dsprogramaeducativo;
	private String clavesep;
	private Date fcaudit;
	private String usuarioaudit;
	
	
	
	@Column(name = "DSGRADO")
	private String strDsGrado;
	
	@Column(name = "DSGRADOFEMENINO")
	private String strDsGradoFemenino;

	public SeCtProgramaEducativo() {
	}

	@Column(name = "IDPROGRAMAEDUCATIVO", unique = true, nullable = false, precision = 5, scale = 0)
	
	public int getIdprogramaeducativo() {
		return this.idprogramaeducativo;
	}

	public void setIdprogramaeducativo(int idprogramaeducativo) {
		
		this.idprogramaeducativo = idprogramaeducativo;
	}

	@Column(name = "DSPROGRAMAEDUCATIVO", nullable = false, length = 200)
	
	public String getDsprogramaeducativo() {
		return this.dsprogramaeducativo;
	}

	public void setDsprogramaeducativo(String dsprogramaeducativo) {
		
		this.dsprogramaeducativo = dsprogramaeducativo;
	}

	@Column(name = "CLAVESEP", length = 8)
	
	public String getClavesep() {
		return this.clavesep;
	}

	public void setClavesep(String clavesep) {
		this.clavesep = clavesep;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "FCAUDIT", length = 7)
	public Date getFcaudit() {
		return this.fcaudit;
	}

	public void setFcaudit(Date fcaudit) {
		this.fcaudit = fcaudit;
	}

	@Column(name = "USUARIOAUDIT", length = 30)
	
	public String getUsuarioaudit() {
		return this.usuarioaudit;
	}

	public void setUsuarioaudit(String usuarioaudit) {
		this.usuarioaudit = usuarioaudit;
	}

	public void setUsuarioAudit(String usuarioAudit) {
		this.usuarioaudit = usuarioAudit;
		
	}

	public void setFcAudit(Date fcAudit) {
		this.fcaudit = fcAudit;
		
	}

	public String getStrDsGrado() {
		return strDsGrado;
	}

	public void setStrDsGrado(String strDsGrado) {
		this.strDsGrado = strDsGrado;
	}

	public String getStrDsGradoFemenino() {
		return strDsGradoFemenino;
	}

	public void setStrDsGradoFemenino(String strDsGradoFemenino) {
		this.strDsGradoFemenino = strDsGradoFemenino;
	}

}
