package com.udistrital.sports.unit.util;

public class Constants {

	public enum MESSAGES {

		// SUCCESS
		SUCCESSFUL_REGISTRATION("Registro creado exitosamente.", "201"),
		SUCCESSFUL_TRANSACTION("Transacción exitosa.", "200"),
		SUCCESSFUL_UPDATE("Registro actualizado exitosamente.", "200"),
		SUCCESSFUL_QUERY("Consulta exitosa.", "00"),

		// FAIL
		SYSTEM_FAILURE("Fallo del sistema.", "500"), 
		FAIL_SERVICE("Fallo del servicio.", "500"),
		NO_RESULTS_FOUND("No se encontraron resultados.", "404"), 
		FAIL_QUERY("Fallo en la consulta.", "404"),
		REQUEST_ERROR("Error en los datos de la petición.", "400");

		private String tag;
		private String code;

		public static MESSAGES getMessageForCode(String code) {
			MESSAGES message = MESSAGES.SUCCESSFUL_TRANSACTION;
			for (MESSAGES m : MESSAGES.values()) {
				if (m.getCode().equals(code)) {
					message = m;
					break;
				}
			}
			return message;
		}

		private MESSAGES(String tag, String code) {
			this.tag = tag;
			this.code = code;
		}

		public String getTag() {
			return this.tag;
		}

		public String getCode() {
			return this.code;
		}

		public static String getCodeByMsg(String s) {
			String code = MESSAGES.SYSTEM_FAILURE.getCode();
			for (MESSAGES m : MESSAGES.values()) {
				if (m.getTag().equals(s)) {
					code = m.getCode();
				}
			}
			return code;
		}
	}
}
