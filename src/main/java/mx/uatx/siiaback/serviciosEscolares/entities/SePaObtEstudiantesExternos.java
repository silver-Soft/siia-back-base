package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SePaObtEstudiantesExternos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8413385634996181128L;
	@Id
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
	
	@Column(name = "NBPROGRAMAESTUDIOEXTERNO")
	private String strNbPrograma;
	
	@Column(name = "NBINSTITUCIONPROCEDENCIA")
	private String strNbInstitucionProcedencia;
	
	@Column(name = "FCINGRESO")
	private Date fcIngreso;

	@Column(name = "FCVIGENCIA")
	private Date fcVigencia;
	
	@Column(name = "FCIMPRESIONCREDENCIAL")
	private Date fcImpresionCredencial;
	
	@Lob
    @Column(name = "FOTOGRAFIA")
    private byte[] fotografia;
	
	@Column(name = "PERMITEMODIFICAR")
	private boolean blnPermiteModificar;
	
	@Column(name = "PERMITEELIMINAR")
	private boolean blnPermiteEliminar;
	
	public SePaObtEstudiantesExternos() {
		super();
	}

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

	public byte[] getFotografia() {
		return fotografia;
	}

	public void setFotografia(byte[] fotografia) {
		this.fotografia = fotografia;
	}

	public boolean isBlnPermiteModificar() {
		return blnPermiteModificar;
	}

	public void setBlnPermiteModificar(boolean blnPermiteModificar) {
		this.blnPermiteModificar = blnPermiteModificar;
	}

	public boolean isBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}

	public String getStrNbPrograma() {
		return strNbPrograma;
	}

	public void setStrNbPrograma(String strNbPrograma) {
		this.strNbPrograma = strNbPrograma;
	}
	
	
	
}
