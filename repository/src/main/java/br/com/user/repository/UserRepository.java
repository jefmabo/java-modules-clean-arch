package br.com.user.repository;

import br.com.user.domain.interfaces.UserDomainRepository;
import br.com.user.repository.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends UserDomainRepository, JpaRepository<UserEntity, Long> {
}
