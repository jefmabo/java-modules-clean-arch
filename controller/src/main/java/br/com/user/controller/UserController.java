package br.com.user.controller;

import br.com.user.usecases.service.dto.UserDto;
import br.com.user.usecases.service.dto.UserSaveDto;
import br.com.user.usecases.service.interfaces.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity saveUser(@RequestBody UserSaveDto user) {
        userService.save(user);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> findAll() {
        var user = userService.find();
        return ResponseEntity.ok(user);
    }
}
