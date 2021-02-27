package com.fcocesar.cursospring.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String agrs) {
		super(agrs);
	}
	
	public ObjectNotFoundException(String agrs, Throwable cause) {
		super(agrs, cause);
	}

}
