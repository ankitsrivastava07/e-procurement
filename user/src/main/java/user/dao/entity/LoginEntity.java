package user.dao.entity;

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
	@Column(name = "user_id",nullable = false)
	private Long userId;
	@Column(name = "user_name", nullable = false)
	private String userName;
	private String email;
	private String password;
	@Column(name = "is_blocked", columnDefinition = "boolean default false")
	private Boolean isBlocked;

}
