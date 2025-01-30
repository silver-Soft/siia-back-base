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
@Table(schema = "SERESC", name = "SEMSESTUDIANTESEXTERNOS")
public class SeMsEstudiantesExternos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6675740791323364264L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDESTUDIANTEEXTERNO", sequenceName = "SERESC.IDESTUDIANTEEXTERNO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDESTUDIANTEEXTERNO")
	@Column(name = "IDESTUDIANTEEXTERNO")
	private Long lngIdEstudianteExterno;

	@Column(name = "FOLIO")
	private String strFolio;

	@Column(name = "NBESTUDIANTEEXTERNO")
	private String strNbEstudianteExterno;
	
	@Column(name = "APPATERNO")
	private String strApPaterno;
	
	@Column(name = "APMATERNO")
	private String strApMaterno;
	
	@Column(name = "CURP")
	private String strCurp;
	
	@Column(name = "IDPROGRAMAESTUDIOEXTERNO")
	private Long lngIdProgramaEstudioExterno;
	
	@Column(name = "NBINSTITUCIONPROCEDENCIA")
	private String strNbInstitucionProcedencia;
	
	@Column(name = "FCINGRESO")
	private Date fcIngreso;

	@Column(name = "FCVIGENCIA")
	private Date fcVigencia;
	
	@Column(name = "FCIMPRESIONCREDENCIAL")
	private Date fcImpresionCredencial;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;
	
	@Lob
    @Column(name = "FOTOGRAFIA")
    private byte[] fotografia;

	public Long getLngIdEstudianteExterno() {
		return lngIdEstudianteExterno;
	}

	public void setLngIdEstudianteExterno(Long lngIdEstudianteExterno) {
		this.lngIdEstudianteExterno = lngIdEstudianteExterno;
	}

	public String getStrFolio() {
		return strFolio;
	}

	public void setStrFolio(String strFolio) {
		this.strFolio = strFolio;
	}

	public String getStrNbEstudianteExterno() {
		return strNbEstudianteExterno;
	}

	public void setStrNbEstudianteExterno(String strNbEstudianteExterno) {
		this.strNbEstudianteExterno = strNbEstudianteExterno;
	}

	public String getStrApPaterno() {
		return strApPaterno;
	}

	public void setStrApPaterno(String strApPaterno) {
		this.strApPaterno = strApPaterno;
	}

	public String getStrApMaterno() {
		return strApMaterno;
	}

	public void setStrApMaterno(String strApMaterno) {
		this.strApMaterno = strApMaterno;
	}

	public String getStrCurp() {
		return strCurp;
	}

	public void setStrCurp(String strCurp) {
		this.strCurp = strCurp;
	}

	public Long getLngIdProgramaEstudioExterno() {
		return lngIdProgramaEstudioExterno;
	}

	public void setLngIdProgramaEstudioExterno(Long lngIdProgramaEstudioExterno) {
		this.lngIdProgramaEstudioExterno = lngIdProgramaEstudioExterno;
	}

	public String getStrNbInstitucionProcedencia() {
		return strNbInstitucionProcedencia;
	}

	public void setStrNbInstitucionProcedencia(String strNbInstitucionProcedencia) {
		this.strNbInstitucionProcedencia = strNbInstitucionProcedencia;
	}

	public Date getFcIngreso() {
		return fcIngreso;
	}

	public void setFcIngreso(Date fcIngreso) {
		this.fcIngreso = fcIngreso;
	}

	public Date getFcVigencia() {
		return fcVigencia;
	}

	public void setFcVigencia(Date fcVigencia) {
		this.fcVigencia = fcVigencia;
	}

	public Date getFcImpresionCredencial() {
		return fcImpresionCredencial;
	}

	public void setFcImpresionCredencial(Date fcImpresionCredencial) {
		this.fcImpresionCredencial = fcImpresionCredencial;
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

	public byte[] getFotografia() {
		return fotografia;
	}

	public void setFotografia(byte[] fotografia) {
		this.fotografia = fotografia;
	}
		
}
