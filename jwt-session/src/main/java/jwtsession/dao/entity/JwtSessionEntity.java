package jwtsession.dao.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "token_session")
@Data
public class JwtSessionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "username", nullable = false)
	private String userName;
	@Column(name = "token", nullable = false)
	private String token;
	@Column(name = "created_at", nullable = false)
	private LocalDateTime createdAt;

	@PrePersist
	public void prePersist() {
		this.createdAt = LocalDateTime.now();
	}
}
