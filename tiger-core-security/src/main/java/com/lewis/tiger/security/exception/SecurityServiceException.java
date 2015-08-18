package com.lewis.tiger.security.exception;

public class SecurityServiceException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private String messageKey;

	private String[] messageArgs;

	public SecurityServiceException() {
		super();
	}

	public SecurityServiceException(String message) {
		super(message);
	}

	public SecurityServiceException(Throwable throwable) {
		super(throwable);
	}

	public SecurityServiceException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public SecurityServiceException(String messageKey, String message) {
		super(message);
		this.messageKey = messageKey;
	}

	public SecurityServiceException(String messageKey, String messageArgs, String message) {
		super(message);
		this.messageKey = messageKey;
		this.messageArgs = new String[] { messageArgs };
	}

	public SecurityServiceException(String messageKey, String[] messageArgs, String message) {
		super(message);
		this.messageKey = messageKey;
		this.messageArgs = messageArgs;
	}

	public String getMessageKey() {
		return messageKey;
	}

	public String[] getMessageArgs() {
		return messageArgs;
	}
}
