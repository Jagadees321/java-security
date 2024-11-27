package com.masai.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyErrorDetails {
	public MyErrorDetails(LocalDateTime now, String message2, String description) {
		// TODO Auto-generated constructor stub
	}
	private LocalDateTime timestamp;
	private String message;
	private String details;

}
