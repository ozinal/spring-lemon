package com.naturalprogrammer.spring.lemon.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.naturalprogrammer.spring.lemon.util.LemonUtils;

/**
 * Version exception, to be thrown when concurrent
 * updates of an entity is noticed. 
 * 
 * @author Sanjay Patel
 */
@ResponseStatus(HttpStatus.CONFLICT)
public class VersionException extends RuntimeException {

	private static final long serialVersionUID = 6020532846519363456L;
	
	public VersionException(String entityName, String entityId) {
		
		super(LemonUtils.getMessage(
			"com.naturalprogrammer.spring.versionException", entityName, entityId));		
	}
}
