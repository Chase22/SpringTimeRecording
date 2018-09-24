package org.chase.springtimerecording.user;

import lombok.Data;

import java.util.UUID;

@Data
public class User {
    private UUID userid;

    private String email;

    public User(final UUID userid, final String email) {
        this.userid = userid;
        this.email = email;
    }

    public User(UserEntity userEntity) {
        this.userid = UUID.fromString(userEntity.getUserid());
        this.email = userEntity.getEmail();
    }
}
