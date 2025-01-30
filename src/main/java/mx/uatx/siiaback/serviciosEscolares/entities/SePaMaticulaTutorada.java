package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaMaticulaTutorada {
	
	@Id
	@Column(name = "PROGRAMAEDUCATIVO")
	private String strProgramaEducativo;
	
	@Column(name = "PRIMERO")
	private String strPrimero;
	
	@Column(name = "SEGUNDO")
	private String strSegundo;
	
	@Column(name = "TERCERO")
	private String strTercero;
	
	@Column(name = "CUARTO")
	private String strCuarto;
	
	@Column(name = "QUINTO")
	private String strQuinto;
	
	@Column(name = "SEXTO")
	private String strSexto;
	
	@Column(name = "SEPTIMO")
	private String strSeptimo;
	
	@Column(name = "OCTAVO")
	private String strOctavo;
	
	@Column(name = "NOVENO")
	private String strNoveno;
	
	@Column(name = "DECIMO")
	private String strDecimo;
	

	public SePaMaticulaTutorada() {
		super();
	}
	

	public String getStrProgramaEducativo() {
		return strProgramaEducativo;
	}

	public void setStrProgramaEducativo(String strProgramaEducativo) {
		this.strProgramaEducativo = strProgramaEducativo;
	}

	public String getStrPrimero() {
		return strPrimero;
	}

	public void setStrPrimero(String strPrimero) {
		this.strPrimero = strPrimero;
	}

	public String getStrSegundo() {
		return strSegundo;
	}

	public void setStrSegundo(String strSegundo) {
		this.strSegundo = strSegundo;
	}

	public String getStrTercero() {
		return strTercero;
	}

	public void setStrTercero(String strTercero) {
		this.strTercero = strTercero;
	}

	public String getStrCuarto() {
		return strCuarto;
	}

	public void setStrCuarto(String strCuarto) {
		this.strCuarto = strCuarto;
	}

	public String getStrQuinto() {
		return strQuinto;
	}

	public void setStrQuinto(String strQuinto) {
		this.strQuinto = strQuinto;
	}

	public String getStrSexto() {
		return strSexto;
	}

	public void setStrSexto(String strSexto) {
		this.strSexto = strSexto;
	}

	public String getStrSeptimo() {
		return strSeptimo;
	}

	public void setStrSeptimo(String strSeptimo) {
		this.strSeptimo = strSeptimo;
	}

	public String getStrOctavo() {
		return strOctavo;
	}

	public void setStrOctavo(String strOctavo) {
		this.strOctavo = strOctavo;
	}

	public String getStrNoveno() {
		return strNoveno;
	}

	public void setStrNoveno(String strNoveno) {
		this.strNoveno = strNoveno;
	}

	public String getStrDecimo() {
		return strDecimo;
	}

	public void setStrDecimo(String strDecimo) {
		this.strDecimo = strDecimo;
	}
	
	
	
	
	

}
