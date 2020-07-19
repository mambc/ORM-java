package com.challenge.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "submission")
@EntityListeners(AuditingEntityListener.class)
public class Submission {

    @EmbeddedId
    private SubmissionId id;

    @NotNull
    @Column(name = "score", nullable = false)
    private Float score;
18050
    @CreatedDate
    @Column(name = "created_at", nullable = false)
    private LocalDateTime created_at;
}