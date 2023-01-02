package br.com.user.usecases.service.dto;

import br.com.user.domain.User;
import br.com.user.repository.entity.UserEntity;

public class UserDto {
    private String name;
    private String email;

    public UserDto(UserEntity user) {
        this.email = user.getEmail();
        this.name = user.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
