package com.demo;

public class CreateJobResponse {

	private int status;
	private String message;
	private String name;
	private boolean isPublic;
	private boolean isOperational;

	public CreateJobResponse(int status, String message, String name, boolean isPublic, boolean isOperational) {
		super();
		this.status = status;
		this.message = message;
		this.name = name;
		this.isPublic = isPublic;
		this.isOperational = isOperational;
	}

	public int getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public String getName() {
		return name;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public boolean isOperational() {
		return isOperational;
	}

	@Override
	public String toString() {
		return "CreateJobResponse [status=" + status + ", message=" + message + ", name=" + name + ", isPublic="
				+ isPublic + ", isOperational=" + isOperational + "]";
	}

}
