package org.chase.springtimerecording.user;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Entity
@Table(name="user")
public class UserEntity {
    @Id
    @Column(name = "userid")
    private UUID userid;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password")
    private String password;

}
