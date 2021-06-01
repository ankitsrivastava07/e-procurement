package user.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import user.dao.entity.LoginEntity;

public interface LoginRepository extends JpaRepository<LoginEntity, Long> {

	@Query(value = "select * from login l where email = ?1 or mobile = ?1", nativeQuery = true)
	LoginEntity findByEmailOrMobile(String emailOrMobile);

	@Query(value = "select * from login where (mobile = ?1 or email = ?1) and new_password = ?2", nativeQuery = true)
	LoginEntity findByEmailAndPassword(String email, String password);

	@Query(value = "select is_blocked from login where (mobile = ?1 or email = ?1)", nativeQuery = true)
	Boolean isUserBlocked(String email);

}