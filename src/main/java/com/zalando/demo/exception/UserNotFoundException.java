package com.zalando.demo.exception;

import java.net.URI;
import java.util.Map;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.StatusType;
import org.zalando.problem.ThrowableProblem;

public class UserNotFoundException  extends AbstractThrowableProblem{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException() {
		super();
	}

	public UserNotFoundException(URI type, String title, StatusType status, String detail, URI instance,
			ThrowableProblem cause, Map<String, Object> parameters) {
		super(type, title, status, detail, instance, cause, parameters);
	}

	public UserNotFoundException(URI type, String title, StatusType status, String detail, URI instance,
			ThrowableProblem cause) {
		super(type, title, status, detail, instance, cause);
	}

	public UserNotFoundException(URI type, String title, StatusType status, String detail, URI instance) {
		super(type, title, status, detail, instance);
	}

	public UserNotFoundException(URI type, String title, StatusType status, String detail) {
		super(type, title, status, detail);
	}

	public UserNotFoundException(URI type, String title, StatusType status) {
		super(type, title, status);
	}

	public UserNotFoundException(URI type, String title) {
		super(type, title);
	}

	public UserNotFoundException(URI type) {
		super(type);
	}

	
}
