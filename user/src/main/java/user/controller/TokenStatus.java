package user.controller;

import lombok.Data;

@Data
public class TokenStatus {

	private boolean status;

	private String message;

	private String token;

	private Long userId;
}
