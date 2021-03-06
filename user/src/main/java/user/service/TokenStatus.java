package user.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class TokenStatus {

	private boolean status;

	private String message;

	private String accessToken;

	private LocalDateTime createdAt;

	private String firstName;
}
