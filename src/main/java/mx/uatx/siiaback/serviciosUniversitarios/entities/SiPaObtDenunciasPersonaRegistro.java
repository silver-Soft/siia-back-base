package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SiPaObtDenunciasPersonaRegistro implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6632848943081453431L;
	@Id
	@Column(name = "IDQUEJADENUNCIA")
	private Long lngIdQuejaDenuncia;
	
	@Column(name = "FCREGISTRO")
	private Date fcRegistro;
	
	@Column(name = "ESTATUS")
	private String strEstatus;
	
	@Column(name = "NOMBRE")
	private String strNombre;
	
	@Column(name = "NBDENUNCIANTE")
	private String strNbDenunciante;
	
	@Column(name = "APPATERNO")
	private String strApPaterno;
	
	@Column(name = "APMATERNO")
	private String strApMaterno;
	
	@Column(name = "DEPENDENCIA")
	private String strDependencia;
	
	@Column(name = "TIPODENUNCIANTE")
	private String strTipoDenunciante;
	
		
	@Column(name = "DSSITUACION")
	private String strDsSituacion;
	
	@Column(name = "PERMITEMODIFICAR")
	private boolean blnPermiteModificar;
	
	@Column(name = "PERMITEELIMINAR")
	private boolean blnPermiteEliminar;	
	
	@Column(name = "IDHISTORIALACADEMICO")
	private Long lngIdHistorialAcademico;
	
	@Column(name = "IDHISTORIALLABORAL")
	private Long lngIdHistorialLaboral;

	@Column(name = "IDAREACAMPUS")
	private Integer intAreaCampus;

	@Column(name = "NBAREA")
	private String strNbArea;

	@Column(name = "EDAD")
	private Integer intEdad;

	@Column(name = "CLGENERO")
	private Integer intClGenero;

	@Column(name = "DSGENERO")
	private String strDsGenero;

	@Column(name = "NMTELEFONO")
	private String strNmTelefono;

	@Column(name = "CORREO")
	private String strCorreo;

	@Column(name = "DSINVOLUCRADOS")
	private String strDsInvolucrados;

	@Column(name = "DSPROBLEMA")
	private String strDsProblema;	

	@Column(name = "DSSENTIMIENTO")
	private String strDsSentimiento;

	@Column(name = "DSTIPOAPOYO")
	private String strDsTipoApoyo;

	@Column(name = "DSTIPOSITUACION")
	private String strTipoSituacion;

	@Column(name = "DSTIPOVIOLENCIA")
	private String strDsTipoViolencia;

	@Column(name = "DSTIPODISCRIMINACION")
	private String strDsTipoDiscriminacion;

	@Column(name = "INVOLUCRACOMUNIDAD")
	private String strInvolucraComunidad;

	@Column(name = "GRADOURGENCIA")
	private String strGradoUrgencia;

	@Column(name = "IDPERSONAREGISTRO")
	private Long lngIdPersonaRegistro;

	@Column(name = "FCSEGUIMIENTO")
	private Date fcSeguimiento;

	@Column(name = "FCCONFIRMACIONCORREO")
	private Date fcConfirmacionCorreo;

	@Column(name = "CADENAVERIFICACION")
	private String strCadenaVerificacion;
	
	@Column(name = "PERMITECLASIFICAR")
	private boolean blnPermiteClasificar;
	
	@Column(name = "PERMITESEGUIMIENTO")
	private boolean blnPermiteSeguimiento;
	
	
	public SiPaObtDenunciasPersonaRegistro() {
		super();
	}

	public Long getLngIdQuejaDenuncia() {
		return lngIdQuejaDenuncia;
	}

	public void setLngIdQuejaDenuncia(Long lngIdQuejaDenuncia) {
		this.lngIdQuejaDenuncia = lngIdQuejaDenuncia;
	}

	public Date getFcRegistro() {
		return fcRegistro;
	}

	public void setFcRegistro(Date fcRegistro) {
		this.fcRegistro = fcRegistro;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrDependencia() {
		return strDependencia;
	}

	public void setStrDependencia(String strDependencia) {
		this.strDependencia = strDependencia;
	}

	public String getStrTipoDenunciante() {
		return strTipoDenunciante;
	}

	public void setStrTipoDenunciante(String strTipoDenunciante) {
		this.strTipoDenunciante = strTipoDenunciante;
	}

	public String getStrDsSituacion() {
		return strDsSituacion;
	}

	public void setStrDsSituacion(String strDsSituacion) {
		this.strDsSituacion = strDsSituacion;
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

	public Long getLngIdHistorialAcademico() {
		return lngIdHistorialAcademico;
	}

	public void setLngIdHistorialAcademico(Long lngIdHistorialAcademico) {
		this.lngIdHistorialAcademico = lngIdHistorialAcademico;
	}

	public Long getLngIdHistorialLaboral() {
		return lngIdHistorialLaboral;
	}

	public void setLngIdHistorialLaboral(Long lngIdHistorialLaboral) {
		this.lngIdHistorialLaboral = lngIdHistorialLaboral;
	}

	public Integer getIntAreaCampus() {
		return intAreaCampus;
	}

	public void setIntAreaCampus(Integer intAreaCampus) {
		this.intAreaCampus = intAreaCampus;
	}

	public String getStrNbArea() {
		return strNbArea;
	}

	public void setStrNbArea(String strNbArea) {
		this.strNbArea = strNbArea;
	}

	public Integer getIntEdad() {
		return intEdad;
	}

	public void setIntEdad(Integer intEdad) {
		this.intEdad = intEdad;
	}

	public Integer getIntClGenero() {
		return intClGenero;
	}

	public void setIntClGenero(Integer intClGenero) {
		this.intClGenero = intClGenero;
	}

	public String getStrDsGenero() {
		return strDsGenero;
	}

	public void setStrDsGenero(String strDsGenero) {
		this.strDsGenero = strDsGenero;
	}

	public String getStrNmTelefono() {
		return strNmTelefono;
	}

	public void setStrNmTelefono(String strNmTelefono) {
		this.strNmTelefono = strNmTelefono;
	}

	public String getStrCorreo() {
		return strCorreo;
	}

	public void setStrCorreo(String strCorreo) {
		this.strCorreo = strCorreo;
	}

	public String getStrDsInvolucrados() {
		return strDsInvolucrados;
	}

	public void setStrDsInvolucrados(String strDsInvolucrados) {
		this.strDsInvolucrados = strDsInvolucrados;
	}

	public String getStrDsProblema() {
		return strDsProblema;
	}

	public void setStrDsProblema(String strDsProblema) {
		this.strDsProblema = strDsProblema;
	}

	public String getStrDsSentimiento() {
		return strDsSentimiento;
	}

	public void setStrDsSentimiento(String strDsSentimiento) {
		this.strDsSentimiento = strDsSentimiento;
	}

	public String getStrDsTipoApoyo() {
		return strDsTipoApoyo;
	}

	public void setStrDsTipoApoyo(String strDsTipoApoyo) {
		this.strDsTipoApoyo = strDsTipoApoyo;
	}

	public String getStrTipoSituacion() {
		return strTipoSituacion;
	}

	public void setStrTipoSituacion(String strTipoSituacion) {
		this.strTipoSituacion = strTipoSituacion;
	}

	public String getStrDsTipoViolencia() {
		return strDsTipoViolencia;
	}

	public void setStrDsTipoViolencia(String strDsTipoViolencia) {
		this.strDsTipoViolencia = strDsTipoViolencia;
	}

	public String getStrDsTipoDiscriminacion() {
		return strDsTipoDiscriminacion;
	}

	public void setStrDsTipoDiscriminacion(String strDsTipoDiscriminacion) {
		this.strDsTipoDiscriminacion = strDsTipoDiscriminacion;
	}

	public String getStrInvolucraComunidad() {
		return strInvolucraComunidad;
	}

	public void setStrInvolucraComunidad(String strInvolucraComunidad) {
		this.strInvolucraComunidad = strInvolucraComunidad;
	}

	public String getStrGradoUrgencia() {
		return strGradoUrgencia;
	}

	public void setStrGradoUrgencia(String strGradoUrgencia) {
		this.strGradoUrgencia = strGradoUrgencia;
	}

	public Long getLngIdPersonaRegistro() {
		return lngIdPersonaRegistro;
	}

	public void setLngIdPersonaRegistro(Long lngIdPersonaRegistro) {
		this.lngIdPersonaRegistro = lngIdPersonaRegistro;
	}

	public Date getFcSeguimiento() {
		return fcSeguimiento;
	}

	public void setFcSeguimiento(Date fcSeguimiento) {
		this.fcSeguimiento = fcSeguimiento;
	}

	public Date getFcConfirmacionCorreo() {
		return fcConfirmacionCorreo;
	}

	public void setFcConfirmacionCorreo(Date fcConfirmacionCorreo) {
		this.fcConfirmacionCorreo = fcConfirmacionCorreo;
	}

	public String getStrCadenaVerificacion() {
		return strCadenaVerificacion;
	}

	public void setStrCadenaVerificacion(String strCadenaVerificacion) {
		this.strCadenaVerificacion = strCadenaVerificacion;
	}

	public String getStrNbDenunciante() {
		return strNbDenunciante;
	}

	public void setStrNbDenunciante(String strNbDenunciante) {
		this.strNbDenunciante = strNbDenunciante;
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

	public boolean isBlnPermiteClasificar() {
		return blnPermiteClasificar;
	}

	public void setBlnPermiteClasificar(boolean blnPermiteClasificar) {
		this.blnPermiteClasificar = blnPermiteClasificar;
	}

	public boolean isBlnPermiteSeguimiento() {
		return blnPermiteSeguimiento;
	}

	public void setBlnPermiteSeguimiento(boolean blnPermiteSeguimiento) {
		this.blnPermiteSeguimiento = blnPermiteSeguimiento;
	}

	
}
