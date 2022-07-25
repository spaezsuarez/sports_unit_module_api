package com.udistrital.sports.unit.dto;

import java.io.Serializable;

import com.udistrital.sports.unit.util.Constants;

import lombok.Data;

@Data
public class APIResponseDTO<T> implements Serializable{
	
	private boolean state = false;
	private String message = null;
	private String code = null;
	private T data = null;

	public void setSuccessRegistration() {
		this.setMessage(Constants.MESSAGES.SUCCESSFUL_REGISTRATION.getTag());
		this.setCode(Constants.MESSAGES.SUCCESSFUL_REGISTRATION.getCode());
		this.setState(Boolean.TRUE);
	}
	
	public void setSuccessRegistration(T data) {
		this.setSuccessRegistration();
		this.setData(data);
	}

	public void setSuccessUpdate() {
		this.setMessage(Constants.MESSAGES.SUCCESSFUL_UPDATE.getTag());
		this.setCode(Constants.MESSAGES.SUCCESSFUL_UPDATE.getCode());
		this.setState(Boolean.TRUE);
	}
	
	public void setSuccessUpdate(T data) {
		this.setSuccessUpdate();
		this.setData(data);
	}
	
	public void setFailService() {
		this.setMessage(Constants.MESSAGES.FAIL_SERVICE.getTag());
		this.setCode(Constants.MESSAGES.FAIL_SERVICE.getCode());
		this.setState(Boolean.FALSE);
	}
	
	public void setFailQuery() {
		this.setMessage(Constants.MESSAGES.FAIL_QUERY.getTag());
		this.setCode(Constants.MESSAGES.FAIL_QUERY.getCode());
		this.setState(Boolean.FALSE);
	}
	
	public void setFailQuery(String msg) {
		this.setMessage(msg);
		this.setCode(Constants.MESSAGES.FAIL_QUERY.getCode());
		this.setState(Boolean.FALSE);
	}
	
	public void setFailQuery(T data) {
		this.setFailQuery();
		this.setData(data);
	}
	
	public void setSuccesQuery(T data) {
		this.setMessage(Constants.MESSAGES.SUCCESSFUL_QUERY.getTag());
		this.setCode(Constants.MESSAGES.SUCCESSFUL_QUERY.getCode());
		this.setState(Boolean.TRUE);
		this.setData(data);
	}

	public void setSuccesQuery() {
		this.setMessage(Constants.MESSAGES.SUCCESSFUL_QUERY.getTag());
		this.setCode(Constants.MESSAGES.SUCCESSFUL_QUERY.getCode());
		this.setState(Boolean.TRUE);
	}
	
	public void setFailRequest() {
		this.setMessage(Constants.MESSAGES.REQUEST_ERROR.getTag());
		this.setCode(Constants.MESSAGES.REQUEST_ERROR.getCode());
		this.setState(Boolean.FALSE);
	}
	
	public void setFailRequest(String message) {
		this.setMessage(message);
		this.setCode(Constants.MESSAGES.REQUEST_ERROR.getCode());
		this.setState(Boolean.FALSE);
	}
	private static final long serialVersionUID = -4545344227922434810L;

}
