package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtListadoMateriasPlan implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2356202273757743640L;
	@Id
	@Column(name="IDPLANMATERIA")
	private Long idPlanMateria;
	
	@Column(name="CVEMATERIA")
	private String cveMateria;
	
	@Column(name="DSMATERIA")
	private String strDsMateria;
	
	@Column(name="NMCREDITOS")
	private Integer nmCreditos;
	
	@Column(name="NMOTROSCREDITOS")
	private Integer nmOtrosCreditos;
	
	@Column(name="DSPERIODOCURSADO")
	private String strDsPeriodoCursado;
	
	@Column(name="DSTIPOMATERIA")
	private String strTipoMateria;
	
	@Column(name="DSAREAFORMACION")
	private String strAreaFormacion;
	
	@Column(name="IDMATERIAREAL")
	private Long lngIdMateriaReal;
	
	@Column(name="MODIFICAR")
	private boolean blnPermiteModificar; 
	
	@Column(name="ELIMINAR")
	private boolean blnPermiteEliminar;	
	
	@Column(name="PERMITESERIACIONES")
	private boolean blnPermiteSeriaciones;	
	
	@Column(name="PERMITEEQUIVALENCIAS")
	private boolean blnPermiteEquivalencias;
	
	@Column(name="PERMITEMATERIASREALES")
	private boolean blnPermiteMateriasReales;

	public Long getIdPlanMateria() {
		return idPlanMateria;
	}

	public void setIdPlanMateria(Long idPlanMateria) {
		this.idPlanMateria = idPlanMateria;
	}

	public String getStrDsMateria() {
		return strDsMateria;
	}

	public void setStrDsMateria(String strDsMateria) {
		this.strDsMateria = strDsMateria;
	}

	public String getStrDsPeriodoCursado() {
		return strDsPeriodoCursado;
	}

	public void setStrDsPeriodoCursado(String strDsPeriodoCursado) {
		this.strDsPeriodoCursado = strDsPeriodoCursado;
	}

	public String getStrTipoMateria() {
		return strTipoMateria;
	}

	public void setStrTipoMateria(String strTipoMateria) {
		this.strTipoMateria = strTipoMateria;
	}

	public String getStrAreaFormacion() {
		return strAreaFormacion;
	}

	public void setStrAreaFormacion(String strAreaFormacion) {
		this.strAreaFormacion = strAreaFormacion;
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

	public String getCveMateria() {
		return cveMateria;
	}

	public void setCveMateria(String cveMateria) {
		this.cveMateria = cveMateria;
	}

	public Integer getNmCreditos() {
		return nmCreditos;
	}

	public void setNmCreditos(Integer nmCreditos) {
		this.nmCreditos = nmCreditos;
	}

	public Integer getNmOtrosCreditos() {
		return nmOtrosCreditos;
	}

	public void setNmOtrosCreditos(Integer nmOtrosCreditos) {
		this.nmOtrosCreditos = nmOtrosCreditos;
	}

	public boolean isBlnPermiteSeriaciones() {
		return blnPermiteSeriaciones;
	}

	public void setBlnPermiteSeriaciones(boolean blnPermiteSeriaciones) {
		this.blnPermiteSeriaciones = blnPermiteSeriaciones;
	}

	public boolean isBlnPermiteEquivalencias() {
		return blnPermiteEquivalencias;
	}

	public void setBlnPermiteEquivalencias(boolean blnPermiteEquivalencias) {
		this.blnPermiteEquivalencias = blnPermiteEquivalencias;
	}

	public boolean isBlnPermiteMateriasReales() {
		return blnPermiteMateriasReales;
	}

	public void setBlnPermiteMateriasReales(boolean blnPermiteMateriasReales) {
		this.blnPermiteMateriasReales = blnPermiteMateriasReales;
	}

	public Long getLngIdMateriaReal() {
		return lngIdMateriaReal;
	}

	public void setLngIdMateriaReal(Long lngIdMateriaReal) {
		this.lngIdMateriaReal = lngIdMateriaReal;
	}
	
	
}


