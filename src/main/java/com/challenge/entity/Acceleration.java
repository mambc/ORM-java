package com.challenge.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "acceleration")
@EntityListeners(AuditingEntityListener.class)
public class Acceleration {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @NotNull
        @Size(max = 100)
        @Column(name = "name", length = 100, nullable = false)
        private String name;

        @NotNull
        @Size(max = 50)
        @Column(name = "slug", length = 50, nullable = false)
        private String slug;

        @ManyToOne
        @JoinColumn(name = "challenge_id", nullable = false)
        private Challenge challenge_id;

        @CreatedDate
        @Column(name = "created_at", nullable = false)
        private LocalDateTime created_at;

        @OneToMany
        private List<Candidate> listCandidates;
}
