package org.chase.springtimerecording.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Objects.requireNonNull;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = requireNonNull(userService, "userService");
    }

    @GetMapping
    public List<User> getAllUser() {
        return userService.getAll();
    }
}
