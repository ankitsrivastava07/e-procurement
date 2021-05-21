package frontend.controller;

import lombok.Data;

@Data
public class ChangePasswordRequestDto {

	private String password;
	private String token;
}
