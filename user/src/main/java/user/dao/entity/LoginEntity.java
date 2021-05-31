package user.dao.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "login")
@Entity
@Data
public class LoginEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name = "email", nullable = false)
	private String email;
	@Column(name = "new_password", nullable = false)
	private String newPassword;
	@Column(name = "is_blocked", columnDefinition = "boolean default false")
	private Boolean isBlocked;
	@Column(name = "old_password", nullable = true)
	private String oldPassword;

	@Column(name = "mobile", nullable = false)
	private String mobile;

	@Column(name = "created_at", nullable = true)
	private LocalDateTime createdAt;
}
