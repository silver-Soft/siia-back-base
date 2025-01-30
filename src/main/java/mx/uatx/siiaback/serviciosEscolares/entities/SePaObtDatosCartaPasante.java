package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDatosCartaPasante {

	@Id
	@Column(name = "IDSOLICITUDDOCUMENTOOFICIAL")
	private Long idSolicitudDocumentoOficial;
	
	@Column(name = "MATRICULA")
	private String matricula;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "NMFOLIODOCUMENTO")
	private Long nmFolioDocumento;

	@Column(name = "FCSOLICITUD")
	private Date fcSolicitud;

	@Column(name = "IDPROGRAMACAMPUS")
	private Long idProgramaCampus;

	@Column(name = "FIRMASECTECNICO")
	private String firmaSecTecnico;

	@Column(name = "FIRMACYRE")
	private String firmaCyre;

	@Column(name = "FIRMADIRECTOR")
	private String firmaDirector;

	@Column(name = "CADENAORIGINAL")
	private String cadenaOriginal;

	@Column(name = "SELLO")
	private String sello;

	@Column(name = "FOTO")
	private byte[] foto;

	@Column(name = "PROGRAMA")
	private String programa;

	@Column(name = "NIVEL")
	private String nivel;

	@Column(name = "LEYENDAHACECONSTAR")
	private String leyendaHaceConstar;

	@Column(name = "NBJEFECYRE")
	private String nbJefeCyre;

	@Column(name = "NBSECTECNICO")
	private String nbSecTecnico;

	@Column(name = "NBDIRECTOR")
	private String nbDirector;

	@Column(name = "PUESTOCYRE")
	private String puestoCyre;

	@Column(name = "PUESTOSECTEC")
	private String puestoSecTec;

	@Column(name = "PUESTODIRECTOR")
	private String puestoDirector;

	@Column(name = "TEXTOUNIDADESPLURAL")
	private String textoUnidadesPlural;

	@Column(name = "TEXTOUNIDADESSINGULAR")
	private String textoUnidadesSingular;

	@Column(name = "LEYENDAASIGNATURAS")
	private String leyendaAsignaturas;

	@Column(name = "FECHAIMPRESION")
	private String fechaImpresion;

	@Column(name = "TIPODUPLICADO")
	private String tipoDuplicado;

	@Column(name = "CADENAQR")
	private String cadenaQr;

	@Column(name = "COTEJA")
	private String coteja;
	
	@Column(name = "IDAREACAMPUS")
	private Long idAreaCampus;
	
	@Column(name = "CLESTATUSELECTRONICO")
	private Integer clEstatusEsElectronico;

	public Long getIdSolicitudDocumentoOficial() {
		return idSolicitudDocumentoOficial;
	}

	public void setIdSolicitudDocumentoOficial(Long idSolicitudDocumentoOficial) {
		this.idSolicitudDocumentoOficial = idSolicitudDocumentoOficial;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getNmFolioDocumento() {
		return nmFolioDocumento;
	}

	public void setNmFolioDocumento(Long nmFolioDocumento) {
		this.nmFolioDocumento = nmFolioDocumento;
	}

	public Date getFcSolicitud() {
		return fcSolicitud;
	}

	public void setFcSolicitud(Date fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

	public Long getIdProgramaCampus() {
		return idProgramaCampus;
	}

	public void setIdProgramaCampus(Long idProgramaCampus) {
		this.idProgramaCampus = idProgramaCampus;
	}

	public String getFirmaSecTecnico() {
		return firmaSecTecnico;
	}

	public void setFirmaSecTecnico(String firmaSecTecnico) {
		this.firmaSecTecnico = firmaSecTecnico;
	}

	public String getFirmaCyre() {
		return firmaCyre;
	}

	public void setFirmaCyre(String firmaCyre) {
		this.firmaCyre = firmaCyre;
	}

	public String getFirmaDirector() {
		return firmaDirector;
	}

	public void setFirmaDirector(String firmaDirector) {
		this.firmaDirector = firmaDirector;
	}

	public String getCadenaOriginal() {
		return cadenaOriginal;
	}

	public void setCadenaOriginal(String cadenaOriginal) {
		this.cadenaOriginal = cadenaOriginal;
	}

	public String getSello() {
		return sello;
	}

	public void setSello(String sello) {
		this.sello = sello;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getLeyendaHaceConstar() {
		return leyendaHaceConstar;
	}

	public void setLeyendaHaceConstar(String leyendaHaceConstar) {
		this.leyendaHaceConstar = leyendaHaceConstar;
	}

	public String getNbJefeCyre() {
		return nbJefeCyre;
	}

	public void setNbJefeCyre(String nbJefeCyre) {
		this.nbJefeCyre = nbJefeCyre;
	}

	public String getNbSecTecnico() {
		return nbSecTecnico;
	}

	public void setNbSecTecnico(String nbSecTecnico) {
		this.nbSecTecnico = nbSecTecnico;
	}

	public String getNbDirector() {
		return nbDirector;
	}

	public void setNbDirector(String nbDirector) {
		this.nbDirector = nbDirector;
	}

	public String getPuestoCyre() {
		return puestoCyre;
	}

	public void setPuestoCyre(String puestoCyre) {
		this.puestoCyre = puestoCyre;
	}

	public String getPuestoSecTec() {
		return puestoSecTec;
	}

	public void setPuestoSecTec(String puestoSecTec) {
		this.puestoSecTec = puestoSecTec;
	}

	public String getPuestoDirector() {
		return puestoDirector;
	}

	public void setPuestoDirector(String puestoDirector) {
		this.puestoDirector = puestoDirector;
	}

	public String getTextoUnidadesPlural() {
		return textoUnidadesPlural;
	}

	public void setTextoUnidadesPlural(String textoUnidadesPlural) {
		this.textoUnidadesPlural = textoUnidadesPlural;
	}

	public String getTextoUnidadesSingular() {
		return textoUnidadesSingular;
	}

	public void setTextoUnidadesSingular(String textoUnidadesSingular) {
		this.textoUnidadesSingular = textoUnidadesSingular;
	}

	public String getLeyendaAsignaturas() {
		return leyendaAsignaturas;
	}

	public void setLeyendaAsignaturas(String leyendaAsignaturas) {
		this.leyendaAsignaturas = leyendaAsignaturas;
	}

	public String getFechaImpresion() {
		return fechaImpresion;
	}

	public void setFechaImpresion(String fechaImpresion) {
		this.fechaImpresion = fechaImpresion;
	}

	public String getTipoDuplicado() {
		return tipoDuplicado;
	}

	public void setTipoDuplicado(String tipoDuplicado) {
		this.tipoDuplicado = tipoDuplicado;
	}

	public String getCadenaQr() {
		return cadenaQr;
	}

	public void setCadenaQr(String cadenaQr) {
		this.cadenaQr = cadenaQr;
	}

	public String getCoteja() {
		return coteja;
	}

	public void setCoteja(String coteja) {
		this.coteja = coteja;
	}

	public Long getIdAreaCampus() {
		return idAreaCampus;
	}

	public void setIdAreaCampus(Long idAreaCampus) {
		this.idAreaCampus = idAreaCampus;
	}

	public Integer getClEstatusEsElectronico() {
		return clEstatusEsElectronico;
	}

	public void setClEstatusEsElectronico(Integer clEstatusEsElectronico) {
		this.clEstatusEsElectronico = clEstatusEsElectronico;
	}

}
