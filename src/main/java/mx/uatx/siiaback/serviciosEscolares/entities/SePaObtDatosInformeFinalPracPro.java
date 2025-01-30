package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtDatosInformeFinalPracPro implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5926158773045622300L;
	@Id
    @Column(name = "IDINFORMEFINALPRACPRO")
	private Long lngIdInformeFinalPracPro;	
	
	@Column(name = "NBDEPENDECIA")
	private String strNbDependencia;
	
	@Column(name = "SERVICIOSDEPENDENCIA")
	private String strServiciosDependencia;
	
	@Column(name = "ACTIVIDADESDESARROLLADAS")
	private String strActividadesDesarrolladas;
	
	@Column(name = "DSAPRENDIZAJEACTIVIDADES")
	private String strDsAprendizajeActividades;
	
	@Column(name = "AREASOPORTUNIDAD")
	private String strAreasOportunidad;
	
	@Column(name = "ESTRATEGIASSUGERIDAS")
	private String strEstrategiasSugeridas;
	
	@Column(name = "PUNTUALIDADASISTENCIA")
	private String strPuntualidadAsistencia;
	
	@Column(name = "PRESENTACION")
	private String strPresentacion;
	
	@Column(name = "DESENVOLVIMIENTO")
	private String strDesenvolvimiento;
	
	@Column(name = "COMPROMISOACTIVIDADES")
	private String strCompromisoActividades;
	
	@Column(name = "DOMINIOCONOCIMIENTOS")
	private String strDominioConocimientos;
	
	@Column(name = "PUNTUALIDADRESULTADOS")
	private String strPuntualidadResultados;
	
	@Column(name = "CALIDADACTIVIDADES")
	private String strCalidadActividades;
	
	@Column(name = "MANEJOTICS")
	private String strManejoTics;
	
	@Column(name = "CONCLUSIONES")
	private String strConclusiones;
	
	@Column(name = "FCELABORACION")
	private Date fcElaboracion;
	
	@Column(name = "LUGARELABORACION")
	private String strLugarElaboracion;
	
	@Column(name = "NOMBREPRACTICANTE")
	private String strNombrePracticante;
	
	@Column(name = "NB_JEFE")
	private String strNbJefe;
	
	public SePaObtDatosInformeFinalPracPro() {
		super();
	}

	public Long getLngIdInformeFinalPracPro() {
		return lngIdInformeFinalPracPro;
	}

	public void setLngIdInformeFinalPracPro(Long lngIdInformeFinalPracPro) {
		this.lngIdInformeFinalPracPro = lngIdInformeFinalPracPro;
	}

	public String getStrNbDependencia() {
		return strNbDependencia;
	}

	public void setStrNbDependencia(String strNbDependencia) {
		this.strNbDependencia = strNbDependencia;
	}

	public String getStrServiciosDependencia() {
		return strServiciosDependencia;
	}

	public void setStrServiciosDependencia(String strServiciosDependencia) {
		this.strServiciosDependencia = strServiciosDependencia;
	}

	public String getStrActividadesDesarrolladas() {
		return strActividadesDesarrolladas;
	}

	public void setStrActividadesDesarrolladas(String strActividadesDesarrolladas) {
		this.strActividadesDesarrolladas = strActividadesDesarrolladas;
	}

	public String getStrDsAprendizajeActividades() {
		return strDsAprendizajeActividades;
	}

	public void setStrDsAprendizajeActividades(String strDsAprendizajeActividades) {
		this.strDsAprendizajeActividades = strDsAprendizajeActividades;
	}

	public String getStrAreasOportunidad() {
		return strAreasOportunidad;
	}

	public void setStrAreasOportunidad(String strAreasOportunidad) {
		this.strAreasOportunidad = strAreasOportunidad;
	}

	public String getStrEstrategiasSugeridas() {
		return strEstrategiasSugeridas;
	}

	public void setStrEstrategiasSugeridas(String strEstrategiasSugeridas) {
		this.strEstrategiasSugeridas = strEstrategiasSugeridas;
	}

	public String getStrPuntualidadAsistencia() {
		return strPuntualidadAsistencia;
	}

	public void setStrPuntualidadAsistencia(String strPuntualidadAsistencia) {
		this.strPuntualidadAsistencia = strPuntualidadAsistencia;
	}

	public String getStrPresentacion() {
		return strPresentacion;
	}

	public void setStrPresentacion(String strPresentacion) {
		this.strPresentacion = strPresentacion;
	}

	public String getStrDesenvolvimiento() {
		return strDesenvolvimiento;
	}

	public void setStrDesenvolvimiento(String strDesenvolvimiento) {
		this.strDesenvolvimiento = strDesenvolvimiento;
	}

	public String getStrCompromisoActividades() {
		return strCompromisoActividades;
	}

	public void setStrCompromisoActividades(String strCompromisoActividades) {
		this.strCompromisoActividades = strCompromisoActividades;
	}

	public String getStrDominioConocimientos() {
		return strDominioConocimientos;
	}

	public void setStrDominioConocimientos(String strDominioConocimientos) {
		this.strDominioConocimientos = strDominioConocimientos;
	}

	public String getStrPuntualidadResultados() {
		return strPuntualidadResultados;
	}

	public void setStrPuntualidadResultados(String strPuntualidadResultados) {
		this.strPuntualidadResultados = strPuntualidadResultados;
	}

	public String getStrCalidadActividades() {
		return strCalidadActividades;
	}

	public void setStrCalidadActividades(String strCalidadActividades) {
		this.strCalidadActividades = strCalidadActividades;
	}

	public String getStrManejoTics() {
		return strManejoTics;
	}

	public void setStrManejoTics(String strManejoTics) {
		this.strManejoTics = strManejoTics;
	}

	public String getStrConclusiones() {
		return strConclusiones;
	}

	public void setStrConclusiones(String strConclusiones) {
		this.strConclusiones = strConclusiones;
	}

	public Date getFcElaboracion() {
		return fcElaboracion;
	}

	public void setFcElaboracion(Date fcElaboracion) {
		this.fcElaboracion = fcElaboracion;
	}

	public String getStrLugarElaboracion() {
		return strLugarElaboracion;
	}

	public void setStrLugarElaboracion(String strLugarElaboracion) {
		this.strLugarElaboracion = strLugarElaboracion;
	}

	public String getStrNombrePracticante() {
		return strNombrePracticante;
	}

	public void setStrNombrePracticante(String strNombrePracticante) {
		this.strNombrePracticante = strNombrePracticante;
	}

	public String getStrNbJefe() {
		return strNbJefe;
	}

	public void setStrNbJefe(String strNbJefe) {
		this.strNbJefe = strNbJefe;
	}
	
	
}
