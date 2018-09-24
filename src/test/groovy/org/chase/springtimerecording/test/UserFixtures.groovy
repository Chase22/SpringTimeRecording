package org.chase.springtimerecording.test

import org.chase.springtimerecording.security.SecurityConfig
import org.chase.springtimerecording.user.UserEntity

enum UserFixtures {
    SomeUser("someEmail@example.com", "password"),
    AnotherUser("anotherEmail@example.com", "12345")

    private UserEntity userEntity

    UserFixtures(String email, String password) {
        userEntity = new UserEntity()
        userEntity.email = email
        userEntity.password = password
    }

    UserEntity getEntity() {
        return userEntity
    }
}