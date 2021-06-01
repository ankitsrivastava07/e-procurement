package jwtsession.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import jwtsession.dao.entity.JwtSessionEntity;

public interface JwtSessionRepository extends JpaRepository<JwtSessionEntity, Long> {

	@Query(value = "select * from token_session where token = ?1 ", nativeQuery = true)
	JwtSessionEntity findByToken(String token);

	@Modifying
	@Query(value = "delete from token_session where not token = ?1 and user_id = ?2 ", nativeQuery = true)
	void removeAllTokensNot(String token, Long user_id);

	@Modifying
	@Query(value = "delete from token_session where user_id = ?1", nativeQuery = true)
	void removeAllTokensById(Long userId);

	@Modifying
	@Query(value = "delete from token_session where token = ?1", nativeQuery = true)
	Integer removeToken(String token);
}