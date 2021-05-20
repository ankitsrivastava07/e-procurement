package user.controller;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class TokenUtil {

	private String token;
	private Long userId;

}
