package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDatosCertificado {
	
	@Id
	@Column(name = "IDSOLICITUDDOCUMENTOOFICIAL")
	private Long idSolicitudDocumentoOficial;
	
	@Column(name = "MATRICULA")
	private String matricula;

	@Column(name = "NBPERSONA")
	private String nombre;
	
	@Column(name = "APPATERNO")
	private String apPaterno;
	
	@Column(name = "APMATERNO")
	private String apMaterno;

	@Column(name = "NMFOLIODOCUMENTO")
	private Long nmFolioDocumento;

	@Column(name = "FCSOLICITUD")
	private Date fcSolicitud;

	@Column(name = "IDAREACAMPUS")
	private Long idAreaCampus;

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
	
	@Column(name = "NBPLANESTUDIO")
	private String nbPlanEstudio;
	
	@Column(name = "IDPLANESTUDIO")
	private Long idPlanEstudio;
	
	@Column(name = "NIVEL")
	private String nivel;

	@Column(name = "NBJEFECYRE")
	private String nbJefeCyre;

	@Column(name = "NBSECTECNICO")
	private String nbSecTecnico;
	
	@Column(name = "NBSECTECNICOENCABEZADO")
	private String nbSecTecnicoEncabezado;

	@Column(name = "NBDIRECTOR")
	private String nbDirector;

	@Column(name = "PUESTOCYRE")
	private String puestoCyre;

	@Column(name = "PUESTOSECTEC")
	private String puestoSecTec;

	@Column(name = "PUESTODIRECTOR")
	private String puestoDirector;

	@Column(name = "CADENAQR")
	private String cadenaQr;

	@Column(name = "COTEJA")
	private String coteja;
	
	@Column(name = "ARTICULODEFINIDO")
	private String articuloDefinido;
	
	@Column(name = "ARTICULODEFINIDO2")
	private String articuloDefinido2;
	
	@Column(name = "PROGRAMA")
	private String programa;
	
	@Column(name = "TEXTOUNIDADESPLURAL")
	private String textoUnidadesPlural;
	
	@Column(name = "TEXTOUNIDADESSINGULAR")
	private String textoUnidadesSingular;
	
	@Column(name = "LEYENDAASIGNATURAS")
	private String leyendaAsignaturas;
	
	@Column(name = "FECHAIMPRESION")
	private String fechaImpresion;
	
	@Column(name = "TIPODUPLICADO")
	private String leyendaLaPresente;
	
	@Column(name = "PROMEDIO")
	private Double promedio;
	
	@Column(name = "PROMEDIOLETRA")
	private String promedioLetra;
	
	@Column(name = "CLESTATUSELECTRONICO")
	private Integer clEstatusEsElectronico;
	
	@Column(name = "ESCALA")
	private String strEscala;
	
	@Column(name = "PERIODO")
	private String periodo;
	
	@Column(name = "MINIMO")
	private Integer minimo;
	
	@Column(name = "CREDITOS")
	private Integer creditos;
	
	@Column(name = "FACULTAD")
	private String facultad;
	
	@Column(name = "APROBADAS")
	private Integer matAprobadas;
	
	@Column(name = "APROBADASLETRA")
	private String matAprobadasLetra;
	
	@Column(name = "REPROBADAS")
	private Integer matReprobadas;
	
	@Column(name = "REPROBADASLETRA")
	private String matReprobadasLetra;
	
	@Column(name = "ACREDITADAS")
	private Integer matAcreditadas;
	
	@Column(name = "NBDOCUMENTO")
	private String nombreDocumento;
	
	@Column(name = "NIVELDOCUMENTO")
	private String nivelDocumento;

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

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
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

	public Long getIdAreaCampus() {
		return idAreaCampus;
	}

	public void setIdAreaCampus(Long idAreaCampus) {
		this.idAreaCampus = idAreaCampus;
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

	public String getNbPlanEstudio() {
		return nbPlanEstudio;
	}

	public void setNbPlanEstudio(String nbPlanEstudio) {
		this.nbPlanEstudio = nbPlanEstudio;
	}

	public Long getIdPlanEstudio() {
		return idPlanEstudio;
	}

	public void setIdPlanEstudio(Long idPlanEstudio) {
		this.idPlanEstudio = idPlanEstudio;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
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

	public String getArticuloDefinido() {
		return articuloDefinido;
	}

	public void setArticuloDefinido(String articuloDefinido) {
		this.articuloDefinido = articuloDefinido;
	}

	public String getArticuloDefinido2() {
		return articuloDefinido2;
	}

	public void setArticuloDefinido2(String articuloDefinido2) {
		this.articuloDefinido2 = articuloDefinido2;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
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

	public String getLeyendaLaPresente() {
		return leyendaLaPresente;
	}

	public void setLeyendaLaPresente(String leyendaLaPresente) {
		this.leyendaLaPresente = leyendaLaPresente;
	}

	public Double getPromedio() {
		return promedio;
	}

	public void setPromedio(Double promedio) {
		this.promedio = promedio;
	}

	public Integer getClEstatusEsElectronico() {
		return clEstatusEsElectronico;
	}

	public void setClEstatusEsElectronico(Integer clEstatusEsElectronico) {
		this.clEstatusEsElectronico = clEstatusEsElectronico;
	}

	public String getPromedioLetra() {
		return promedioLetra;
	}

	public void setPromedioLetra(String promedioLetra) {
		this.promedioLetra = promedioLetra;
	}

	public String getStrEscala() {
		return strEscala;
	}

	public void setStrEscala(String strEscala) {
		this.strEscala = strEscala;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Integer getMinimo() {
		return minimo;
	}

	public void setMinimo(Integer minimo) {
		this.minimo = minimo;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public Integer getMatAprobadas() {
		return matAprobadas;
	}

	public void setMatAprobadas(Integer matAprobadas) {
		this.matAprobadas = matAprobadas;
	}

	public String getMatAprobadasLetra() {
		return matAprobadasLetra;
	}

	public void setMatAprobadasLetra(String matAprobadasLetra) {
		this.matAprobadasLetra = matAprobadasLetra;
	}

	public Integer getMatReprobadas() {
		return matReprobadas;
	}

	public void setMatReprobadas(Integer matReprobadas) {
		this.matReprobadas = matReprobadas;
	}

	public String getMatReprobadasLetra() {
		return matReprobadasLetra;
	}

	public void setMatReprobadasLetra(String matReprobadasLetra) {
		this.matReprobadasLetra = matReprobadasLetra;
	}

	public Integer getMatAcreditadas() {
		return matAcreditadas;
	}

	public void setMatAcreditadas(Integer matAcreditadas) {
		this.matAcreditadas = matAcreditadas;
	}

	public String getNombreDocumento() {
		return nombreDocumento;
	}

	public void setNombreDocumento(String nombreDocumento) {
		this.nombreDocumento = nombreDocumento;
	}

	public String getNivelDocumento() {
		return nivelDocumento;
	}

	public void setNivelDocumento(String nivelDocumento) {
		this.nivelDocumento = nivelDocumento;
	}

	public String getNbSecTecnicoEncabezado() {
		return nbSecTecnicoEncabezado;
	}

	public void setNbSecTecnicoEncabezado(String nbSecTecnicoEncabezado) {
		this.nbSecTecnicoEncabezado = nbSecTecnicoEncabezado;
	}
	
	
}
