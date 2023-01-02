package br.com.user.usecases.service.dto;

import br.com.user.repository.entity.UserEntity;

public class UserSaveDto {
    private String name;
    private String email;
    private String password;
    private String cpf;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public UserEntity toEntity() {
        return new UserEntity(this.name, this.cpf, this.password, this.email);
    }

}
