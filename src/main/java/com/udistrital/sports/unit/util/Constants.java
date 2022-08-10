package com.udistrital.sports.unit.util;

public class Constants {

	public static class DatabaseOperations{
		
		public static final String LOGIN_AUXILIAR = "SELECT E.CODEMPLEADO  id,E.\"NOMEMPLEADO\" || ' ' || E.\"APELLEMPLEADO\" employee,\n"
				+ "S.\"NOMESPACIO\" campus,C.\"DESCARGO\" charge,TO_CHAR(EC.\"FECHACARGO\",'YYYY-MM-DD') dateCharge,\n"
				+ "TO_CHAR(EC.\"FECHACARGO\",'HH24:MI') hourCharge FROM \"SPORTS_UNIT\".\"EMPLEADO\" E\n"
				+ "INNER JOIN \"SPORTS_UNIT\".\"EMPLEADO_CARGO\" EC ON E.\"CODEMPLEADO\" = EC.\"CODEMPLEADO\"\n"
				+ "INNER JOIN \"SPORTS_UNIT\".\"CARGO\" C ON EC.\"IDCARGO\" = C.\"IDCARGO\"\n"
				+ "INNER JOIN \"SPORTS_UNIT\".\"ESPACIO\" S ON EC.\"CODESPACIO\" = S.\"CODESPACIO\"\n"
				+ "WHERE C.\"IDCARGO\" =  1 AND E.\"CODEMPLEADO\" = :codeEmployee\n"
				+ "ORDER BY EC.\"FECHACARGO\" DESC";
		
		public static final String TEACHING_PRE_REQUEST = "SELECT E.\"CODEMPLEADO\"  id,E.\"NOMEMPLEADO\" || ' ' || E.\"APELLEMPLEADO\" employee,\n"
				+ "S.\"NOMESPACIO\" campus,C.\"DESCARGO\" charge,EC.\"FECHACARGO\" dateCharge\n"
				+ "FROM \"SPORTS_UNIT\".\"EMPLEADO\" E\n"
				+ "INNER JOIN \"SPORTS_UNIT\".\"EMPLEADO_CARGO\" EC ON E.\"CODEMPLEADO\" = EC.\"CODEMPLEADO\"\n"
				+ "INNER JOIN \"SPORTS_UNIT\".\"CARGO\" C ON EC.\"IDCARGO\" = C.\"IDCARGO\"\n"
				+ "INNER JOIN \"SPORTS_UNIT\".\"ESPACIO\" S ON EC.\"CODESPACIO\" = S.\"CODESPACIO\"\n"
				+ "WHERE E.\"CODEMPLEADO\" = (SELECT E.\"CODEMPLEADO\" FROM \"SPORTS_UNIT\".\"EMPLEADO\" E WHERE \n"
				+ "LOWER(E.\"NOMEMPLEADO\" || ' ' || E.\"APELLEMPLEADO\") LIKE(LOWER(?))) AND C.\"IDCARGO\" = 2";
		
		public static final String TEACHING_CAMPUS_SPORT = "select A.\"DESCACTIVIDAD\" typeActivity,ES.\"ESP_CODESPACIO\" idSpace,ES.\"NOMESPACIO\" \"space\" ,D.\"IDDEPORTE\" idSport ,D.\"NOMDEPORTE\" sport, \n"
				+ "E.\"NOMEMPLEADO\" || ' ' || E.\"APELLEMPLEADO\" employee from \n"
				+ "\"SPORTS_UNIT\".\"PROGRAMACION\" P\n"
				+ "    inner join \"SPORTS_UNIT\".\"RESPONSABLE\" R on R.\"CONSECPROGRA\" = P.\"CONSECPROGRA\"\n"
				+ "    inner join \"SPORTS_UNIT\".\"ACTIVIDAD\" A on A.\"IDACTIVIDAD\" = P.\"IDACTIVIDAD\"\n"
				+ "    inner join \"SPORTS_UNIT\".\"EMPLEADO\" E on E.\"CODEMPLEADO\" = R.\"CODEMPLEADO\"\n"
				+ "    inner join \"SPORTS_UNIT\".\"DEPORTE\" D on D.\"IDDEPORTE\" = P.\"IDDEPORTE\"\n"
				+ "    INNER JOIN \"SPORTS_UNIT\".\"ESPACIO\" ES ON P.\"CODESPACIO\" = ES.\"CODESPACIO\"\n"
				+ "    WHERE E.\"CODEMPLEADO\" = ?\n"
				+ "AND current_date - 9 >=  P.\"IDHORA\" and P.\"HOR_IDHORA\" >= current_date - 9";
		
		public static final String TEACHING_ELEMENTS_QUERY = "SELECT ED.\"CONSECELEMENTO\" idElement, TE.\"DESCTIPOELEMENTO\" typeElement, M.\"NOMMARCA\" \"element\", \n"
				+ "EST.\"DESCESTADO\" state FROM \"SPORTS_UNIT\".\"DEPORTE\" D\n"
				+ "INNER JOIN \"SPORTS_UNIT\".\"DEPORTE_TIPO\" DT ON D.\"IDDEPORTE\" = DT.\"IDDEPORTE\"\n"
				+ "INNER JOIN \"SPORTS_UNIT\".\"TIPOELEMENTO\" TE ON DT.\"IDTIPOELEMENTO\" = TE.\"IDTIPOELEMENTO\"\n"
				+ "INNER JOIN \"SPORTS_UNIT\".\"ELEMENTODEPORTIVO\" ED ON TE.\"IDTIPOELEMENTO\" = ED.\"IDTIPOELEMENTO\"\n"
				+ "INNER JOIN \"SPORTS_UNIT\".\"MARCA\" M ON ED.\"IDMARCA\" = M.\"IDMARCA\"\n"
				+ "INNER JOIN \"SPORTS_UNIT\".\"ESTADO\" EST ON ED.\"IDESTADO\" = EST.IDESTADO\n"
				+ "WHERE D.\"IDDEPORTE\" = ?\n"
				+ "	AND ED.\"CODESPACIO\" = ?\n"
				+ "	AND EST.\"IDESTADO\" = 1";
		
		private DatabaseOperations() {
			
		}
		
	}
}
