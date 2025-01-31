package mx.uatx.siiaback.serviciosUniversitarios.enums;

import java.io.Serializable;

public enum TipoConvocatoriaEnum implements Serializable {
	
	NUEVO("N");

	private String tipo;

	TipoConvocatoriaEnum(final String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
