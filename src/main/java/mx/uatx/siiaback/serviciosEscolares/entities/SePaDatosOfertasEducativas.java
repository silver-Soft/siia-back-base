package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosOfertasEducativas implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5202404848073447746L;

	@Id
	@Column(name = "IDOFERTA")
	private Long lngIdOferta;

	@Column(name = "DSPERIODOTEMPORADA")
	private String strPeriodo;

	@Column(name = "NBPLANESTUDIO")
	private String strPlanEstudio;

	@Column(name = "DSESTATUSOFERTA")
	private String strEstatus;

	@Column(name = "PROGRAMACAMPUS")
	private String strProgramaCampus;

	@Column(name = "AREACAMPUS")
	private String strAreaCampus;

	@Column(name = "DSMATERIA")
	private String strMateria;

	@Column(name = "CLESTATUSOFERTA")
	private String strClEstatus;

	@Column(name = "CLPERIODOCURSADO")
	private Integer intIdGrado;

	@Column(name = "CLTURNOS")
	private String strClTurno;

	@Column(name = "IDGRUPOPROGRAMA")
	private Integer intIdGrupoPrograma;

	@Column(name = "IDMATERIAREAL")
	private Integer intIdMateria;

	@Column(name = "IDPERIODO")
	private String strIdPeriodo;

	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdProgramaCampus;

	@Column(name = "NMHORAS")
	private Integer intNumHoras;

	@Column(name = "NMMAXIMOALUMNOS")
	private Integer intNumMaximoAlumnos;

	@Column(name = "NMMINIMOALUMNOS")
	private Integer intNumMinimoAlumnos;

	@Column(name = "PERMITEMODIFICAR")
	private boolean blnPermiteModificar;

	@Column(name = "DESHABILITAR")
	private boolean blnDesHabilitado;
	
	@Column(name = "PERMITELISTA")
	private boolean blnPermiteLista;
	
	@Column(name = "PERMITECALIFICACIONES")
	private boolean blnPermiteCalificaciones;
	
	@Column(name = "PERMITEACTAS")
	private boolean blnPermiteActas;
	
	@Column(name = "NMCUPOFORANEOS")
	private Integer intCupoForaneo;
	
	@Column(name = "IDPLANESTUDIO")
	private Integer intIdPlanEstudio;
	
	@Column(name = "PERMITEHORARIO")
	private boolean blnPermiteHorario;
	
	@Column(name = "PERMITEALUMNOS")
	private boolean blnPermiteAlumnos;
	
	
	@Column(name = "PERMITEAGREGARDOCENTES")
	private boolean blnPermiteAgregarDocentes;
	
	
	@Column(name = "NOMBRECAMPUS")
	private String strCampus;
	
	@Column(name = "DSGRUPOPROGRAMA")
	private String strGrupo;
	
	@Column(name = "NIVELEDUCATIVO")
	private String strNivelEducativo;
	
	@Column(name = "PERIODOCURSADOOFERTA")
	private String strPeriodoCursadoOferta;
	
	@Column(name = "NOMBREAREA")
	private String StrFacultad;
	
	@Column(name = "DOCENTE")
	private String strJurado;
	
	
	@Column(name = "DSTURNO")
	private String strTurno;
	
	@Column(name = "IDMODALIDADOFERTA")
	private Integer intIdModalidadOferta;
	

	public Long getLngIdOferta() {
		return lngIdOferta;
	}

	public void setLngIdOferta(Long lngIdOferta) {
		this.lngIdOferta = lngIdOferta;
	}

	public String getStrPeriodo() {
		return strPeriodo;
	}

	public void setStrPeriodo(String strPeriodo) {
		this.strPeriodo = strPeriodo;
	}

	public String getStrPlanEstudio() {
		return strPlanEstudio;
	}

	public void setStrPlanEstudio(String strPlanEstudio) {
		this.strPlanEstudio = strPlanEstudio;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public String getStrProgramaCampus() {
		return strProgramaCampus;
	}

	public void setStrProgramaCampus(String strProgramaCampus) {
		this.strProgramaCampus = strProgramaCampus;
	}

	public String getStrAreaCampus() {
		return strAreaCampus;
	}

	public void setStrAreaCampus(String strAreaCampus) {
		this.strAreaCampus = strAreaCampus;
	}

	public String getStrMateria() {
		return strMateria;
	}

	public void setStrMateria(String strMateria) {
		this.strMateria = strMateria;
	}

	public String getStrClEstatus() {
		return strClEstatus;
	}

	public void setStrClEstatus(String strClEstatus) {
		this.strClEstatus = strClEstatus;
	}

	

	public Integer getIntIdGrado() {
		return intIdGrado;
	}

	public void setIntIdGrado(Integer intIdGrado) {
		this.intIdGrado = intIdGrado;
	}

	public String getStrClTurno() {
		return strClTurno;
	}

	public void setStrClTurno(String strClTurno) {
		this.strClTurno = strClTurno;
	}

	public Integer getIntIdGrupoPrograma() {
		return intIdGrupoPrograma;
	}

	public void setIntIdGrupoPrograma(Integer intIdGrupoPrograma) {
		this.intIdGrupoPrograma = intIdGrupoPrograma;
	}

	public Integer getIntIdMateria() {
		return intIdMateria;
	}

	public void setIntIdMateria(Integer intIdMateria) {
		this.intIdMateria = intIdMateria;
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
	}

	public Integer getIntNumHoras() {
		return intNumHoras;
	}

	public void setIntNumHoras(Integer intNumHoras) {
		this.intNumHoras = intNumHoras;
	}

	public Integer getIntNumMaximoAlumnos() {
		return intNumMaximoAlumnos;
	}

	public void setIntNumMaximoAlumnos(Integer intNumMaximoAlumnos) {
		this.intNumMaximoAlumnos = intNumMaximoAlumnos;
	}

	public Integer getIntNumMinimoAlumnos() {
		return intNumMinimoAlumnos;
	}

	public void setIntNumMinimoAlumnos(Integer intNumMinimoAlumnos) {
		this.intNumMinimoAlumnos = intNumMinimoAlumnos;
	}

	public boolean isBlnPermiteModificar() {
		return blnPermiteModificar;
	}

	public void setBlnPermiteModificar(boolean blnPermiteModificar) {
		this.blnPermiteModificar = blnPermiteModificar;
	}

	public boolean isBlnDesHabilitado() {
		return blnDesHabilitado;
	}

	public void setBlnDesHabilitado(boolean blnDesHabilitado) {
		this.blnDesHabilitado = blnDesHabilitado;
	}

	public boolean isBlnPermiteLista() {
		return blnPermiteLista;
	}

	public void setBlnPermiteLista(boolean blnPermiteLista) {
		this.blnPermiteLista = blnPermiteLista;
	}

	public boolean isBlnPermiteCalificaciones() {
		return blnPermiteCalificaciones;
	}

	public void setBlnPermiteCalificaciones(boolean blnPermiteCalificaciones) {
		this.blnPermiteCalificaciones = blnPermiteCalificaciones;
	}

	public boolean isBlnPermiteActas() {
		return blnPermiteActas;
	}

	public void setBlnPermiteActas(boolean blnPermiteActas) {
		this.blnPermiteActas = blnPermiteActas;
	}

	public Integer getIntCupoForaneo() {
		return intCupoForaneo;
	}

	public void setIntCupoForaneo(Integer intCupoForaneo) {
		this.intCupoForaneo = intCupoForaneo;
	}

	public Integer getIntIdPlanEstudio() {
		return intIdPlanEstudio;
	}

	public void setIntIdPlanEstudio(Integer intIdPlanEstudio) {
		this.intIdPlanEstudio = intIdPlanEstudio;
	}

	public boolean isBlnPermiteHorario() {
		return blnPermiteHorario;
	}

	public void setBlnPermiteHorario(boolean blnPermiteHorario) {
		this.blnPermiteHorario = blnPermiteHorario;
	}

	public boolean isBlnPermiteAlumnos() {
		return blnPermiteAlumnos;
	}

	public void setBlnPermiteAlumnos(boolean blnPermiteAlumnos) {
		this.blnPermiteAlumnos = blnPermiteAlumnos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getStrCampus() {
		return strCampus;
	}

	public void setStrCampus(String strCampus) {
		this.strCampus = strCampus;
	}

	public String getStrGrupo() {
		return strGrupo;
	}

	public void setStrGrupo(String strGrupo) {
		this.strGrupo = strGrupo;
	}

	public String getStrNivelEducativo() {
		return strNivelEducativo;
	}

	public void setStrNivelEducativo(String strNivelEducativo) {
		this.strNivelEducativo = strNivelEducativo;
	}

	public String getStrPeriodoCursadoOferta() {
		return strPeriodoCursadoOferta;
	}

	public void setStrPeriodoCursadoOferta(String strPeriodoCursadoOferta) {
		this.strPeriodoCursadoOferta = strPeriodoCursadoOferta;
	}

	public String getStrFacultad() {
		return StrFacultad;
	}

	public void setStrFacultad(String strFacultad) {
		StrFacultad = strFacultad;
	}

	public String getStrJurado() {
		return strJurado;
	}

	public void setStrJurado(String strJurado) {
		this.strJurado = strJurado;
	}

	public String getStrTurno() {
		return strTurno;
	}

	public void setStrTurno(String strTurno) {
		this.strTurno = strTurno;
	}

	public boolean isBlnPermiteAgregarDocentes() {
		return blnPermiteAgregarDocentes;
	}

	public void setBlnPermiteAgregarDocentes(boolean blnPermiteAgregarDocentes) {
		this.blnPermiteAgregarDocentes = blnPermiteAgregarDocentes;
	}

	public Integer getIntIdModalidadOferta() {
		return intIdModalidadOferta;
	}

	public void setIntIdModalidadOferta(Integer intIdModalidadOferta) {
		this.intIdModalidadOferta = intIdModalidadOferta;
	}
	
	
	
	
		
}
