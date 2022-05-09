package com.example.demo.controller;

public class CutomException extends RuntimeException {
	
	String message;
	
	public CutomException(String message) {
		this.message = message;
	}
}
