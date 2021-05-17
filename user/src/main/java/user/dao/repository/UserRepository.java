package user.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import user.dao.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

	@Query(value = "select user_name from login where user_name = ?1 or email = ?1", nativeQuery = true)
	String findByUserNameOrEmail(String email);

	@Query(value = "select * from login where (user_name = ?1 or email = ?1) and password = ?2", nativeQuery = true)
	UserEntity findByUserNameAndPassword(String username, String password);

	@Query(value = "select is_blocked from login where (user_name = ?1 or email = ?1) and (is_blocked = false or is_blocked=true)", nativeQuery = true)
	Boolean isUserBlocked(String username);

	UserEntity findByUserName(String userName);

}
