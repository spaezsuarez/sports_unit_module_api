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
	
	public static class DatabaseOperations{
		
		public static final String LOGIN_AUXILIAR = "SELECT E.\"NOMEMPLEADO\" || ' ' || E.\"APELLEMPLEADO\" employee,\n"
				+ "S.\"NOMESPACIO\" campus,C.\"DESCARGO\" charge,TO_CHAR(EC.\"FECHACARGO\",'YYYY-MM-DD') dateCharge,\n"
				+ "TO_CHAR(EC.\"FECHACARGO\",'HH24:MI') hourCharge FROM \"SPORTS_UNIT\".\"EMPLEADO\" E\n"
				+ "INNER JOIN \"SPORTS_UNIT\".\"EMPLEADO_CARGO\" EC ON E.\"CODEMPLEADO\" = EC.\"CODEMPLEADO\"\n"
				+ "INNER JOIN \"SPORTS_UNIT\".\"CARGO\" C ON EC.\"IDCARGO\" = C.\"IDCARGO\"\n"
				+ "INNER JOIN \"SPORTS_UNIT\".\"ESPACIO\" S ON EC.\"CODESPACIO\" = S.\"CODESPACIO\"\n"
				+ "WHERE C.\"IDCARGO\" =  1 AND E.\"CODEMPLEADO\" = ?\n"
				+ "ORDER BY EC.\"FECHACARGO\" DESC";
		
		private DatabaseOperations() {
			
		}
		
	}
}
