package org.chase.springtimerecording.user;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.requireNonNull;

@Service
public class UserService {
    private UserRepository userRepository;

    UserService(final UserRepository userRepository) {
        this.userRepository = requireNonNull(userRepository, "userRepository");
    }


    public List<User> getAll() {
        return userRepository.findAll().stream().map(User::new).collect(Collectors.toList());
    }
}
