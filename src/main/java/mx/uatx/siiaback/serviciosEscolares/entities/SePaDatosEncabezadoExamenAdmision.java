package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosEncabezadoExamenAdmision {
	
	@Id
	@Column(name = "IDSOLICITUDINGRESO")
	private Long idSolicitudIngreso;
	
	@Column(name = "TITULO")
	private String titulo;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "PROGRAMA")
	private String programa;

	@Column(name = "FCAPLICACION")
	private String dcAplicacion;

	@Column(name = "PUNTAJETOTAL")
	private Long puntajeTotal;

	@Column(name = "NMREACTIVOS")
	private Integer nmReactivos;

	@Column(name = "CALIFICACIONMAYOR")
	private Long calificacionMayor;

	@Column(name = "LUGARSUSTENTANTE")
	private Long LugarSustentante;

	@Column(name = "TOTALSUSTENTANTES")
	private Long totalSustentantes;
	
	
	public Long getIdSolicitudIngreso() {
		return idSolicitudIngreso;
	}
	public void setIdSolicitudIngreso(Long idSolicitudIngreso) {
		this.idSolicitudIngreso = idSolicitudIngreso;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	public Long getPuntajeTotal() {
		return puntajeTotal;
	}
	public void setPuntajeTotal(Long puntajeTotal) {
		this.puntajeTotal = puntajeTotal;
	}
	public Integer getNmReactivos() {
		return nmReactivos;
	}
	public void setNmReactivos(Integer nmReactivos) {
		this.nmReactivos = nmReactivos;
	}
	public Long getCalificacionMayor() {
		return calificacionMayor;
	}
	public void setCalificacionMayor(Long calificacionMayor) {
		this.calificacionMayor = calificacionMayor;
	}
	public Long getTotalSustentantes() {
		return totalSustentantes;
	}
	public void setTotalSustentantes(Long totalSustentantes) {
		this.totalSustentantes = totalSustentantes;
	}
	public String getDcAplicacion() {
		return dcAplicacion;
	}
	public void setDcAplicacion(String dcAplicacion) {
		this.dcAplicacion = dcAplicacion;
	}
	public Long getLugarSustentante() {
		return LugarSustentante;
	}
	public void setLugarSustentante(Long lugarSustentante) {
		LugarSustentante = lugarSustentante;
	}
	
}
