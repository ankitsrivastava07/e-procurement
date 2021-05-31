package frontend.controller;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class CreateUserResponseStatus {

	private boolean status;

	private String message;

	private LocalDateTime createdAt;
}