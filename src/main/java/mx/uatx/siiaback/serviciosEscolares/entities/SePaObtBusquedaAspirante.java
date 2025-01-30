package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SePaObtBusquedaAspirante implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2537789770747311697L;

	@Id
	@Column(name = "FOLIOUATX")
	private Long lngFolioUatx;
	
	@Column(name = "NBASPIRANTE")
	private String strNbAspirante;
	
	@Column(name = "CONTRASENA")
	private String strContraseña;
	
	@Column(name = "TIPOREGISTRO")
	private String strTipoRegistro;
	
	@Column(name = "SOV")
	private String strSov;
	
	@Column(name = "ESTATUS")
	private String strEstatus;
	
	@Column(name = "CLESTATUSASPIRANTE")
	private Integer intClEstatus;
	
	@Column(name = "FOLIOCENEVAL")
	private Long lngFolioCeneval;
	
	@Column(name = "IDASPIRANTE")
	private Long lngIdAspirante;
	
	@Lob
    @Column(name = "RESULTADOCENEVAL")
    private byte[] archivo;
	
	@Column(name = "NMTELEFONO")
	private Long lngNmTelefono;
	
	@Column(name = "CORREOELECTRONICO")
	private String strCorreo;
	
	@Column(name = "IDFAMILIARPADRE")
	private Long lngIdFamiliarPadre;
	
	@Column(name = "IDFAMILIARMADRE")
	private Long lngIdFamiliarMadre;
	
	@Column(name = "IDFAMILIARTUTOR")
	private Long lngIdFamiliarTutor;
	
	@Column(name = "PERMITEFOLIOCENEVAL")
	private boolean blnPermiteFolioCeneval;
	
	@Column(name = "PERMITEACEPTAR")
	private boolean blnPermiteAceptar;
	
	@Column(name = "PERMITEACEPTARINDIVIDUAL")
	private boolean blnPermiteAceptarIndividual;
	
	@Column(name = "PERMITEFORMATO")
	private boolean blnPermiteFormato;
	
	@Column(name = "PERMITECARGARCENEVAL")
	private boolean blnPermiteCargarCeneval;
	
	@Column(name = "PERMITEDESCARGACENEVAL")
	private boolean blnPermiteDescargarCeneval;
	
	@Column(name = "PERMITEMODIFICAR")
	private boolean blnPermiteModificar;
	
	@Column(name = "PERMITEDESCARGARCONSTANCIA")
	private boolean blnPermiteDescargarConstancia;
	
	@Column(name = "PERMITEDESCARGARFOTO")
	private boolean blnPermiteDescargarFoto;
	
	@Column(name = "IDFICHASOLICITUDINGRESO")
	private Long lngIdFichaSolicitudIngreso;
	
	@Column(name = "CLESTATUSVIVENCIA")
	private Integer intClEstatusVivencia;
	
	@Column(name = "ESTATUSEXAMEN")
	private String estatusExamen;
	
	@Column(name = "PERMITECAMBIARPE")
	private boolean blnPermiteCambiarPE;

	public Long getLngFolioUatx() {
		return lngFolioUatx;
	}

	public void setLngFolioUatx(Long lngFolioUatx) {
		this.lngFolioUatx = lngFolioUatx;
	}

	public String getStrNbAspirante() {
		return strNbAspirante;
	}

	public void setStrNbAspirante(String strNbAspirante) {
		this.strNbAspirante = strNbAspirante;
	}

	public String getStrContraseña() {
		return strContraseña;
	}

	public void setStrContraseña(String strContraseña) {
		this.strContraseña = strContraseña;
	}

	public String getStrTipoRegistro() {
		return strTipoRegistro;
	}

	public void setStrTipoRegistro(String strTipoRegistro) {
		this.strTipoRegistro = strTipoRegistro;
	}

	public String getStrSov() {
		return strSov;
	}

	public void setStrSov(String strSov) {
		this.strSov = strSov;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public Long getLngFolioCeneval() {
		return lngFolioCeneval;
	}

	public void setLngFolioCeneval(Long lngFolioCeneval) {
		this.lngFolioCeneval = lngFolioCeneval;
	}

	public byte[] getArchivo() {
		return archivo;
	}

	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}

	public Integer getIntClEstatus() {
		return intClEstatus;
	}

	public void setIntClEstatus(Integer intClEstatus) {
		this.intClEstatus = intClEstatus;
	}

	public Long getLngIdAspirante() {
		return lngIdAspirante;
	}

	public void setLngIdAspirante(Long lngIdAspirante) {
		this.lngIdAspirante = lngIdAspirante;
	}

	public Long getLngIdFamiliarPadre() {
		return lngIdFamiliarPadre;
	}

	public void setLngIdFamiliarPadre(Long lngIdFamiliarPadre) {
		this.lngIdFamiliarPadre = lngIdFamiliarPadre;
	}

	public Long getLngIdFamiliarMadre() {
		return lngIdFamiliarMadre;
	}

	public void setLngIdFamiliarMadre(Long lngIdFamiliarMadre) {
		this.lngIdFamiliarMadre = lngIdFamiliarMadre;
	}

	public Long getLngIdFamiliarTutor() {
		return lngIdFamiliarTutor;
	}

	public void setLngIdFamiliarTutor(Long lngIdFamiliarTutor) {
		this.lngIdFamiliarTutor = lngIdFamiliarTutor;
	}

	public boolean isBlnPermiteFolioCeneval() {
		return blnPermiteFolioCeneval;
	}

	public void setBlnPermiteFolioCeneval(boolean blnPermiteFolioCeneval) {
		this.blnPermiteFolioCeneval = blnPermiteFolioCeneval;
	}

	public boolean isBlnPermiteAceptar() {
		return blnPermiteAceptar;
	}

	public void setBlnPermiteAceptar(boolean blnPermiteAceptar) {
		this.blnPermiteAceptar = blnPermiteAceptar;
	}

	public boolean isBlnPermiteAceptarIndividual() {
		return blnPermiteAceptarIndividual;
	}

	public void setBlnPermiteAceptarIndividual(boolean blnPermiteAceptarIndividual) {
		this.blnPermiteAceptarIndividual = blnPermiteAceptarIndividual;
	}

	public boolean isBlnPermiteFormato() {
		return blnPermiteFormato;
	}

	public void setBlnPermiteFormato(boolean blnPermiteFormato) {
		this.blnPermiteFormato = blnPermiteFormato;
	}

	public boolean isBlnPermiteCargarCeneval() {
		return blnPermiteCargarCeneval;
	}

	public void setBlnPermiteCargarCeneval(boolean blnPermiteCargarCeneval) {
		this.blnPermiteCargarCeneval = blnPermiteCargarCeneval;
	}

	public boolean isBlnPermiteDescargarCeneval() {
		return blnPermiteDescargarCeneval;
	}

	public void setBlnPermiteDescargarCeneval(boolean blnPermiteDescargarCeneval) {
		this.blnPermiteDescargarCeneval = blnPermiteDescargarCeneval;
	}

	public boolean isBlnPermiteModificar() {
		return blnPermiteModificar;
	}

	public void setBlnPermiteModificar(boolean blnPermiteModificar) {
		this.blnPermiteModificar = blnPermiteModificar;
	}

	public Long getLngNmTelefono() {
		return lngNmTelefono;
	}

	public void setLngNmTelefono(Long lngNmTelefono) {
		this.lngNmTelefono = lngNmTelefono;
	}

	public String getStrCorreo() {
		return strCorreo;
	}

	public void setStrCorreo(String strCorreo) {
		this.strCorreo = strCorreo;
	}

	public boolean isBlnPermiteDescargarConstancia() {
		return blnPermiteDescargarConstancia;
	}

	public void setBlnPermiteDescargarConstancia(boolean blnPermiteDescargarConstancia) {
		this.blnPermiteDescargarConstancia = blnPermiteDescargarConstancia;
	}

	public boolean isBlnPermiteDescargarFoto() {
		return blnPermiteDescargarFoto;
	}

	public void setBlnPermiteDescargarFoto(boolean blnPermiteDescargarFoto) {
		this.blnPermiteDescargarFoto = blnPermiteDescargarFoto;
	}

	public Long getLngIdFichaSolicitudIngreso() {
		return lngIdFichaSolicitudIngreso;
	}

	public void setLngIdFichaSolicitudIngreso(Long lngIdFichaSolicitudIngreso) {
		this.lngIdFichaSolicitudIngreso = lngIdFichaSolicitudIngreso;
	}

	public Integer getIntClEstatusVivencia() {
		return intClEstatusVivencia;
	}

	public void setIntClEstatusVivencia(Integer intClEstatusVivencia) {
		this.intClEstatusVivencia = intClEstatusVivencia;
	}

	public String getEstatusExamen() {
		return estatusExamen;
	}

	public void setEstatusExamen(String estatusExamen) {
		this.estatusExamen = estatusExamen;
	}

	public boolean isBlnPermiteCambiarPE() {
		return blnPermiteCambiarPE;
	}

	public void setBlnPermiteCambiarPE(boolean blnPermiteCambiarPE) {
		this.blnPermiteCambiarPE = blnPermiteCambiarPE;
	}	
	
	
}
