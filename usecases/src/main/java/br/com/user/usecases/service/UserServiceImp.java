package br.com.user.usecases.service;

import br.com.user.domain.User;
import br.com.user.repository.UserRepository;
import br.com.user.repository.entity.UserEntity;
import br.com.user.usecases.service.dto.UserDto;
import br.com.user.usecases.service.dto.UserSaveDto;
import br.com.user.usecases.service.interfaces.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(UserSaveDto user) {
        var userEntity = user.toEntity();
        userRepository.save(userEntity);
    }

    @Override
    public UserDto findById(long id) {
        return null;
    }

    @Override
    public List<UserDto> find() {
        var users = userRepository.findAll();
        var usersDto = new ArrayList<UserDto>();

        for(var user : users)
            usersDto.add(new UserDto(user));

        return usersDto;
    }
}
