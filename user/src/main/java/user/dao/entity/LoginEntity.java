package user.dao.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "login")
@Entity
@Data
public class LoginEntity {

	@Id
	@Column(name = "user_id", nullable = false)
	private Long userId;
	@Column(name = "user_name", nullable = false)
	private String userName;
	@Column(name = "email", nullable = false)
	private String email;
	@Column(name = "new_password", nullable = false)
	private String newPassword;
	@Column(name = "is_blocked", columnDefinition = "boolean default false")
	private Boolean isBlocked;
	@Column(name = "old_password", nullable = true)
	private String oldPassword;

	@Column(name = "created_at", nullable = true)
	private LocalDateTime createdAt;
}
