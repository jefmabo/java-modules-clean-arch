package br.com.user.domain.interfaces;

import br.com.user.domain.User;

public interface UserDomainRepository {
    User findById(long id);
}
