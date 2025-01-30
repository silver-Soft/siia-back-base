package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosDoctosOficialesXml {
	
	@Id
	@Column(name = "IDSOLICITUDDOCUMENTOOFICIAL")
	private Long idSolicitudDocumentoOficial;
	
	@Column(name = "IDDOCUMENTOOFICIAL")
	private Integer idDocumentoOficial;

	@Column(name = "NBDOCUMENTO")
	private String nbDocumento;

	@Column(name = "FCSOLICITUD")
	private String fcSolicitud;

	@Column(name = "NMFOLIODOCUMENTO")
	private Long nmFolioDocumento;

	@Column(name = "FECHAINICIO")
	private String fechaInicio;

	@Column(name = "FECHAFIN")
	private String fechaFin;

	@Column(name = "CLAVEINSTITUCION")
	private String claveInstitucion;

	@Column(name = "NBINSTITUCION")
	private String nbInstitucion;

	@Column(name = "CALVECARRERA")
	private String claveCarrera;

	@Column(name = "NBCARRERA")
	private String nbCarrera;

	@Column(name = "CURP")
	private String curp;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "APELLIDOPATERNO")
	private String apellidoPaterno;

	@Column(name = "APELLIDOMATERNO")
	private String apellidoMaterno;

	@Column(name = "CORREOELECTRONICO")
	private String correoElectronico;

	@Column(name = "FECHAEXPEDICION")
	private String fechaExpedicion;

	@Column(name = "FIRMASECTECNICO")
	private String firmaSecTecnico;

	@Column(name = "IDPERSONASECTECNICO")
	private Long idPersonaSecTecnico;

	@Column(name = "NOMBRETEC")
	private String nombreTec;

	@Column(name = "APELLIDOPATERNOTEC")
	private String apellidoPaternoTec;

	@Column(name = "APELLIDOMATERNOTEC")
	private String apellidoMaternoTec;

	@Column(name = "CURPTEC")
	private String curpTec;

	@Column(name = "CARGOTEC")
	private String cargoTec;

	@Column(name = "TRATAMIENTOTEC")
	private String tratamientoTec;

	@Column(name = "IDPUESTOTEC")
	private Integer idPuestoTec;

	@Column(name = "FCFIRMASECTECNICO")
	private String fcFirmaSecTecnico;

	@Column(name = "FIRMACYRE")
	private String FirmaCyre;

	@Column(name = "IDPERSONACYRE")
	private Long idPersonaCyre;

	@Column(name = "NOMBRECYRE")
	private String nombreCyre;

	@Column(name = "APELLIDOPATERNOCYRE")
	private String apellidoPaternoCyre;

	@Column(name = "APELLIDOMATERNOCYRE")
	private String apellidoMaternoCyre;

	@Column(name = "CURPCYRE")
	private String curpCyre;

	@Column(name = "CARGOCYRE")
	private String cargoCyre;

	@Column(name = "TRATAMIENTOCYRE")
	private String tratamientoCyre;

	@Column(name = "IDPUESTOCYRE")
	private Integer idPuestoCyre;

	@Column(name = "FCFIRMACYRE")
	private String fcFirmaCyre;

	@Column(name = "CADENAORIGINAL")
	private String cadenaOriginal;

	@Column(name = "FCREVISADO")
	private String fcRevisado;

	@Column(name = "FIRMADIRECTOR")
	private String firmaDirector;

	@Column(name = "IDPERSONADIRECTOR")
	private Long idPersonaDirector;

	@Column(name = "NOMBREDIR")
	private String nombreDir;

	@Column(name = "APELLIDOPATERNODIR")
	private String apellidoPaternoDir;

	@Column(name = "APELLIDOMATERNODIR")
	private String apellidoMaternoDir;

	@Column(name = "CURPDIR")
	private String curpDir;

	@Column(name = "CARGODIR")
	private String cargoDir;

	@Column(name = "TRATAMIENTODIR")
	private String tratamientoDir;

	@Column(name = "IDPUESTODIR")
	private Integer idPuestoDir;

	@Column(name = "FCFIRMADIRECTOR")
	private String fcFirmaDirector;

	@Column(name = "FCSUPERVISADO")
	private String fcSupervisado;

	@Column(name = "FCSELLADO")
	private String fcSellado;

	@Column(name = "CADENAORIGINALSELLADO")
	private String cadenaOriginalSellado;

	@Column(name = "SELLO")
	private String sello;
	
	public Long getIdSolicitudDocumentoOficial() {
		return idSolicitudDocumentoOficial;
	}
	public void setIdSolicitudDocumentoOficial(Long idSolicitudDocumentoOficial) {
		this.idSolicitudDocumentoOficial = idSolicitudDocumentoOficial;
	}
	public Integer getIdDocumentoOficial() {
		return idDocumentoOficial;
	}
	public void setIdDocumentoOficial(Integer idDocumentoOficial) {
		this.idDocumentoOficial = idDocumentoOficial;
	}
	public String getNbDocumento() {
		return nbDocumento;
	}
	public void setNbDocumento(String nbDocumento) {
		this.nbDocumento = nbDocumento;
	}
	public String getFcSolicitud() {
		return fcSolicitud;
	}
	public void setFcSolicitud(String fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}
	public Long getNmFolioDocumento() {
		return nmFolioDocumento;
	}
	public void setNmFolioDocumento(Long nmFolioDocumento) {
		this.nmFolioDocumento = nmFolioDocumento;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getClaveInstitucion() {
		return claveInstitucion;
	}
	public void setClaveInstitucion(String claveInstitucion) {
		this.claveInstitucion = claveInstitucion;
	}
	public String getNbInstitucion() {
		return nbInstitucion;
	}
	public void setNbInstitucion(String nbInstitucion) {
		this.nbInstitucion = nbInstitucion;
	}
	public String getClaveCarrera() {
		return claveCarrera;
	}
	public void setClaveCarrera(String claveCarrera) {
		this.claveCarrera = claveCarrera;
	}
	public String getNbCarrera() {
		return nbCarrera;
	}
	public void setNbCarrera(String nbCarrera) {
		this.nbCarrera = nbCarrera;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getFechaExpedicion() {
		return fechaExpedicion;
	}
	public void setFechaExpedicion(String fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}
	public String getFirmaSecTecnico() {
		return firmaSecTecnico;
	}
	public void setFirmaSecTecnico(String firmaSecTecnico) {
		this.firmaSecTecnico = firmaSecTecnico;
	}
	public Long getIdPersonaSecTecnico() {
		return idPersonaSecTecnico;
	}
	public void setIdPersonaSecTecnico(Long idPersonaSecTecnico) {
		this.idPersonaSecTecnico = idPersonaSecTecnico;
	}
	public String getNombreTec() {
		return nombreTec;
	}
	public void setNombreTec(String nombreTec) {
		this.nombreTec = nombreTec;
	}
	public String getApellidoPaternoTec() {
		return apellidoPaternoTec;
	}
	public void setApellidoPaternoTec(String apellidoPaternoTec) {
		this.apellidoPaternoTec = apellidoPaternoTec;
	}
	public String getApellidoMaternoTec() {
		return apellidoMaternoTec;
	}
	public void setApellidoMaternoTec(String apellidoMaternoTec) {
		this.apellidoMaternoTec = apellidoMaternoTec;
	}
	public String getCurpTec() {
		return curpTec;
	}
	public void setCurpTec(String curpTec) {
		this.curpTec = curpTec;
	}
	public String getCargoTec() {
		return cargoTec;
	}
	public void setCargoTec(String cargoTec) {
		this.cargoTec = cargoTec;
	}
	public String getTratamientoTec() {
		return tratamientoTec;
	}
	public void setTratamientoTec(String tratamientoTec) {
		this.tratamientoTec = tratamientoTec;
	}
	public Integer getIdPuestoTec() {
		return idPuestoTec;
	}
	public void setIdPuestoTec(Integer idPuestoTec) {
		this.idPuestoTec = idPuestoTec;
	}
	public String getFcFirmaSecTecnico() {
		return fcFirmaSecTecnico;
	}
	public void setFcFirmaSecTecnico(String fcFirmaSecTecnico) {
		this.fcFirmaSecTecnico = fcFirmaSecTecnico;
	}
	public String getFirmaCyre() {
		return FirmaCyre;
	}
	public void setFirmaCyre(String firmaCyre) {
		FirmaCyre = firmaCyre;
	}
	public Long getIdPersonaCyre() {
		return idPersonaCyre;
	}
	public void setIdPersonaCyre(Long idPersonaCyre) {
		this.idPersonaCyre = idPersonaCyre;
	}
	public String getNombreCyre() {
		return nombreCyre;
	}
	public void setNombreCyre(String nombreCyre) {
		this.nombreCyre = nombreCyre;
	}
	public String getApellidoPaternoCyre() {
		return apellidoPaternoCyre;
	}
	public void setApellidoPaternoCyre(String apellidoPaternoCyre) {
		this.apellidoPaternoCyre = apellidoPaternoCyre;
	}
	public String getApellidoMaternoCyre() {
		return apellidoMaternoCyre;
	}
	public void setApellidoMaternoCyre(String apellidoMaternoCyre) {
		this.apellidoMaternoCyre = apellidoMaternoCyre;
	}
	public String getCurpCyre() {
		return curpCyre;
	}
	public void setCurpCyre(String curpCyre) {
		this.curpCyre = curpCyre;
	}
	public String getCargoCyre() {
		return cargoCyre;
	}
	public void setCargoCyre(String cargoCyre) {
		this.cargoCyre = cargoCyre;
	}
	public String getTratamientoCyre() {
		return tratamientoCyre;
	}
	public void setTratamientoCyre(String tratamientoCyre) {
		this.tratamientoCyre = tratamientoCyre;
	}
	public Integer getIdPuestoCyre() {
		return idPuestoCyre;
	}
	public void setIdPuestoCyre(Integer idPuestoCyre) {
		this.idPuestoCyre = idPuestoCyre;
	}
	public String getFcFirmaCyre() {
		return fcFirmaCyre;
	}
	public void setFcFirmaCyre(String fcFirmaCyre) {
		this.fcFirmaCyre = fcFirmaCyre;
	}
	public String getCadenaOriginal() {
		return cadenaOriginal;
	}
	public void setCadenaOriginal(String cadenaOriginal) {
		this.cadenaOriginal = cadenaOriginal;
	}
	public String getFcRevisado() {
		return fcRevisado;
	}
	public void setFcRevisado(String fcRevisado) {
		this.fcRevisado = fcRevisado;
	}
	public String getFirmaDirector() {
		return firmaDirector;
	}
	public void setFirmaDirector(String firmaDirector) {
		this.firmaDirector = firmaDirector;
	}
	public Long getIdPersonaDirector() {
		return idPersonaDirector;
	}
	public void setIdPersonaDirector(Long idPersonaDirector) {
		this.idPersonaDirector = idPersonaDirector;
	}
	public String getNombreDir() {
		return nombreDir;
	}
	public void setNombreDir(String nombreDir) {
		this.nombreDir = nombreDir;
	}
	public String getApellidoPaternoDir() {
		return apellidoPaternoDir;
	}
	public void setApellidoPaternoDir(String apellidoPaternoDir) {
		this.apellidoPaternoDir = apellidoPaternoDir;
	}
	public String getApellidoMaternoDir() {
		return apellidoMaternoDir;
	}
	public void setApellidoMaternoDir(String apellidoMaternoDir) {
		this.apellidoMaternoDir = apellidoMaternoDir;
	}
	public String getCurpDir() {
		return curpDir;
	}
	public void setCurpDir(String curpDir) {
		this.curpDir = curpDir;
	}
	public String getCargoDir() {
		return cargoDir;
	}
	public void setCargoDir(String cargoDir) {
		this.cargoDir = cargoDir;
	}
	public String getTratamientoDir() {
		return tratamientoDir;
	}
	public void setTratamientoDir(String tratamientoDir) {
		this.tratamientoDir = tratamientoDir;
	}
	public Integer getIdPuestoDir() {
		return idPuestoDir;
	}
	public void setIdPuestoDir(Integer idPuestoDir) {
		this.idPuestoDir = idPuestoDir;
	}
	public String getFcFirmaDirector() {
		return fcFirmaDirector;
	}
	public void setFcFirmaDirector(String fcFirmaDirector) {
		this.fcFirmaDirector = fcFirmaDirector;
	}
	public String getFcSupervisado() {
		return fcSupervisado;
	}
	public void setFcSupervisado(String fcSupervisado) {
		this.fcSupervisado = fcSupervisado;
	}
	public String getFcSellado() {
		return fcSellado;
	}
	public void setFcSellado(String fcSellado) {
		this.fcSellado = fcSellado;
	}
	public String getCadenaOriginalSellado() {
		return cadenaOriginalSellado;
	}
	public void setCadenaOriginalSellado(String cadenaOriginalSellado) {
		this.cadenaOriginalSellado = cadenaOriginalSellado;
	}
	public String getSello() {
		return sello;
	}
	public void setSello(String sello) {
		this.sello = sello;
	}

}
