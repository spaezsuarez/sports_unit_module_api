package com.udistrital.sports.unit.util;

import org.springframework.http.HttpStatus;
import com.udistrital.sports.unit.dto.APIResponseDTO;

public class Util {
	
	public static HttpStatus findHttpStatusResponse(APIResponseDTO<?> response) {
		HttpStatus httpStatus;
		Constants.MESSAGES message = Constants.MESSAGES.getMessageForCode(response.getCode());

		switch (message) {

		case FAIL_SERVICE:
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
			break;

		case SYSTEM_FAILURE:
			httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
			break;

		case NO_RESULTS_FOUND:
			httpStatus = HttpStatus.NOT_FOUND;
			break;

		case SUCCESSFUL_REGISTRATION:
			httpStatus = HttpStatus.CREATED;
			break;

		case SUCCESSFUL_TRANSACTION:
			httpStatus = HttpStatus.OK;
			break;

		case SUCCESSFUL_UPDATE:
			httpStatus = HttpStatus.OK;
			break;


		case FAIL_QUERY:
			httpStatus = HttpStatus.NOT_FOUND;
			break;

		default:
			httpStatus = HttpStatus.SERVICE_UNAVAILABLE;
			break;
		}
		return httpStatus;
	}

}
