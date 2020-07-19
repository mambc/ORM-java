package com.challenge.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "candidate")
@EntityListeners(AuditingEntityListener.class)
public class Candidate {
    @EmbeddedId
    private CandidateId id;

    @NotNull
    @Column(name = "status", nullable = false)
    private int status;

    @CreatedDate
    @Column(name = "created_at", nullable = false)
    private LocalDateTime created_at;
}
