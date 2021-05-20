package jwtsession.controller;

import lombok.Data;

@Data
public class JwtSessionDto {

	private String token;
	private Long userId;
}
