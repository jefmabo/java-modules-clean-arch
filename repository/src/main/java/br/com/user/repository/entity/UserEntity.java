package br.com.user.repository.entity;

import br.com.user.domain.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntity extends User {

    public UserEntity() {}

    public UserEntity(String name, String cpf, String password, String email) {
        this.setCpf(cpf);
        this.setPassword(password);
        this.setName(name);
        this.setEmail(email);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private String password;
    private String cpf;

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
