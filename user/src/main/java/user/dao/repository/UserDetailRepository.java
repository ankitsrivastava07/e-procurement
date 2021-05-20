package user.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import user.dao.entity.UserDetailEntity;

public interface UserDetailRepository extends JpaRepository<UserDetailEntity, Long> {

}
