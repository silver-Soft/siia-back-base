package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "SERESC", name = "SECTPROGRAMASESTUDIOEXTERNOS")
public class SeCtProgramasEstudiosExternos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3968437373866648674L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDPROGRAMAESTUDIOEXTERNO", sequenceName = "SERESC.IDPROGRAMAESTUDIOEXTERNO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDPROGRAMAESTUDIOEXTERNO")	
	@Column(name = "IDPROGRAMAESTUDIOEXTERNO")
	private Long lngIdProgramaEstudioExterno;

	@Column(name = "NBPROGRAMAESTUDIOEXTERNO")
	private String strNbProgramaEstudioExterno;

	@Column(name = "CLAVEPROGRAMAESTUDIO")
	private String strClaveProgramaEstudio;
			
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;
	
	@Lob
    @Column(name = "FIRMA")
    private byte[] firma;
	
	@Column(name = "CLAREAFIRMA")
	private Integer intClAreaFirma;
	
	@Column(name = "DSPROGRAMAESTUDIOEXTERNO")
	private String strDsProgramaEstudioExterno;

	public Long getLngIdProgramaEstudioExterno() {
		return lngIdProgramaEstudioExterno;
	}

	public void setLngIdProgramaEstudioExterno(Long lngIdProgramaEstudioExterno) {
		this.lngIdProgramaEstudioExterno = lngIdProgramaEstudioExterno;
	}

	public String getStrNbProgramaEstudioExterno() {
		return strNbProgramaEstudioExterno;
	}

	public void setStrNbProgramaEstudioExterno(String strNbProgramaEstudioExterno) {
		this.strNbProgramaEstudioExterno = strNbProgramaEstudioExterno;
	}

	public String getStrClaveProgramaEstudio() {
		return strClaveProgramaEstudio;
	}

	public void setStrClaveProgramaEstudio(String strClaveProgramaEstudio) {
		this.strClaveProgramaEstudio = strClaveProgramaEstudio;
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

	public byte[] getFirma() {
		return firma;
	}

	public void setFirma(byte[] firma) {
		this.firma = firma;
	}

	public Integer getIntClAreaFirma() {
		return intClAreaFirma;
	}

	public void setIntClAreaFirma(Integer intClAreaFirma) {
		this.intClAreaFirma = intClAreaFirma;
	}

	public String getStrDsProgramaEstudioExterno() {
		return strDsProgramaEstudioExterno;
	}

	public void setStrDsProgramaEstudioExterno(String strDsProgramaEstudioExterno) {
		this.strDsProgramaEstudioExterno = strDsProgramaEstudioExterno;
	}

	
}
