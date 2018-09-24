package org.chase.springtimerecording.recording;

import org.chase.springtimerecording.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordingRepository extends JpaRepository<UserEntity, String> {
}
