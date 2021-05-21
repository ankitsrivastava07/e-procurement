package jwtsession.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import jwtsession.dao.entity.JwtSessionEntity;

public interface JwtSessionRepository extends JpaRepository<JwtSessionEntity, Long> {

	@Query(value = "select * from token_session where token = ?1 ", nativeQuery = true)
	JwtSessionEntity findBytoken(String token);

	@Modifying
	Long deleteByUserId(Long userId);
}
