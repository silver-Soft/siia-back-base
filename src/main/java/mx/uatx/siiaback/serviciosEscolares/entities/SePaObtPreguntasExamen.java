package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SePaObtPreguntasExamen implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2315093657054681208L;
	@Id
	@Column(name = "ID")
	private Long lngdId;

	@Column(name = "DSAREACONOCIMIENTO")
	private String strDsAreaConocimiento;

	@Column(name = "TIEMPO")
	private Integer intTiempo;

	@Column(name = "NBORDEN")
	private Integer intNbOrden;

	@Column(name = "IDPREGUNTA")
	private Integer intIdPregunta;

	@Column(name = "DSPREGUNTA")
	private String strDsPregunta;

	@Lob
	@Column(name = "IMAGENPREGUNTA")
	private byte[] imagenPregunta;

	@Column(name = "IDOPCION")
	private Integer intIdOpcion;

	@Column(name = "DSOPCION")
	private String strDsOpcion;
	
	@Lob
	@Column(name = "IMAGENOPCION")
	private byte[] imagenOpcion;

	@Column(name = "PERMITELECTURA")
	private Integer blnTieneDocumento;

	@Column(name = "HRINICIOTOTAL")
	private String horaInicioTotal;

	@Column(name = "HRFINTOTAL")
	private String horaFinTotal;
	
	@Column(name = "IDAREACONOCIMIENTO")
	private Integer intIdAreaConocimiento;

	@Column(name = "LECTURA1")
	private String lectura1;

	@Column(name = "LECTURA2")
	private String lectura2;

	@Column(name = "LECTURA3")
	private String lectura3;

	@Column(name = "LECTURA4")
	private String lectura4;

	public SePaObtPreguntasExamen() {
		super();
	}

	public Long getLngdId() {
		return lngdId;
	}

	public void setLngdId(Long lngdId) {
		this.lngdId = lngdId;
	}

	public String getStrDsAreaConocimiento() {
		return strDsAreaConocimiento;
	}

	public void setStrDsAreaConocimiento(String strDsAreaConocimiento) {
		this.strDsAreaConocimiento = strDsAreaConocimiento;
	}

	public Integer getIntTiempo() {
		return intTiempo;
	}

	public void setIntTiempo(Integer intTiempo) {
		this.intTiempo = intTiempo;
	}

	public Integer getIntNbOrden() {
		return intNbOrden;
	}

	public void setIntNbOrden(Integer intNbOrden) {
		this.intNbOrden = intNbOrden;
	}

	public Integer getIntIdPregunta() {
		return intIdPregunta;
	}

	public void setIntIdPregunta(Integer intIdPregunta) {
		this.intIdPregunta = intIdPregunta;
	}

	public String getStrDsPregunta() {
		return strDsPregunta;
	}

	public void setStrDsPregunta(String strDsPregunta) {
		this.strDsPregunta = strDsPregunta;
	}

	public byte[] getImagenPregunta() {
		return imagenPregunta;
	}

	public void setImagenPregunta(byte[] imagenPregunta) {
		this.imagenPregunta = imagenPregunta;
	}

	public Integer getIntIdOpcion() {
		return intIdOpcion;
	}

	public void setIntIdOpcion(Integer intIdOpcion) {
		this.intIdOpcion = intIdOpcion;
	}

	public String getStrDsOpcion() {
		return strDsOpcion;
	}

	public void setStrDsOpcion(String strDsOpcion) {
		this.strDsOpcion = strDsOpcion;
	}

	public byte[] getImagenOpcion() {
		return imagenOpcion;
	}

	public void setImagenOpcion(byte[] imagenOpcion) {
		this.imagenOpcion = imagenOpcion;
	}

	public Integer getBlnTieneDocumento() {
		return blnTieneDocumento;
	}

	public void setBlnTieneDocumento(Integer blnTieneDocumento) {
		this.blnTieneDocumento = blnTieneDocumento;
	}

	public String getHoraInicioTotal() {
		return horaInicioTotal;
	}

	public void setHoraInicioTotal(String horaInicioTotal) {
		this.horaInicioTotal = horaInicioTotal;
	}

	public String getHoraFinTotal() {
		return horaFinTotal;
	}

	public void setHoraFinTotal(String horaFinTotal) {
		this.horaFinTotal = horaFinTotal;
	}

	public Integer getIntIdAreaConocimiento() {
		return intIdAreaConocimiento;
	}

	public void setIntIdAreaConocimiento(Integer intIdAreaConocimiento) {
		this.intIdAreaConocimiento = intIdAreaConocimiento;
	}

	public String getLectura1() {
		return lectura1;
	}

	public void setLectura1(String lectura1) {
		this.lectura1 = lectura1;
	}

	public String getLectura2() {
		return lectura2;
	}

	public void setLectura2(String lectura2) {
		this.lectura2 = lectura2;
	}

	public String getLectura3() {
		return lectura3;
	}

	public void setLectura3(String lectura3) {
		this.lectura3 = lectura3;
	}

	public String getLectura4() {
		return lectura4;
	}

	public void setLectura4(String lectura4) {
		this.lectura4 = lectura4;
	}
	
	

	

}
