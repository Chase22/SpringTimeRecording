package org.chase.springtimerecording.recording;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity(name="recording")
@Table(name="recording")
public class RecordingEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "timestamp")
    private LocalDateTime timestamp;

    @Column(name="type")
    private String recordType;
}
