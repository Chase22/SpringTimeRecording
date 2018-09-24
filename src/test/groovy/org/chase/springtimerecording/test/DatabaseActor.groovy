package org.chase.springtimerecording.test

import org.chase.springtimerecording.user.UserEntity
import org.chase.springtimerecording.user.UserRepository
import org.springframework.stereotype.Component

import static java.util.Objects.requireNonNull

@Component
class DatabaseActor {
    UserRepository userRepository;

    DatabaseActor(UserRepository userRepository) {
        this.userRepository = requireNonNull(userRepository)
    }

    public void insertUser(UserEntity userEntity) {
        userRepository.save(userEntity)
    }
}
