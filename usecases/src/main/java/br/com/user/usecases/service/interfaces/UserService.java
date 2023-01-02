package br.com.user.usecases.service.interfaces;

import br.com.user.usecases.service.dto.UserDto;
import br.com.user.usecases.service.dto.UserSaveDto;

import java.util.List;

public interface UserService {
    public void save(UserSaveDto user);
    public UserDto findById(long id);
    public List<UserDto> find();
}
