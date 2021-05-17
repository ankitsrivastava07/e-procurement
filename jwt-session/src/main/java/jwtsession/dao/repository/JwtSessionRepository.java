package jwtsession.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jwtsession.dao.entity.JwtSessionEntity;

public interface JwtSessionRepository extends JpaRepository<JwtSessionEntity, Long> {

	JwtSessionEntity findBytoken(String jwt);
}
