package user.controller;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ChangePasswordResponseStatus {

	private boolean status;

	private String message;

	private String token;
}
