package com.challenge.entity;

import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Data
@Entity
@Table(name = "user")
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @NotNull
    @Size(max = 100)
    @Column(name = "full_name", length = 100, nullable = false)
    private String full_name;

    @NotBlank
    @NotNull
    @Email
    @Size(max = 100)
    @Column(name = "email", nullable = false)
    private String email;

    @NotNull
    @NotBlank
    @Size(max = 50)
    @Column(name = "nickname", length = 50, nullable = false)
    private String nickname;

    @NotBlank
    @NotNull
    @Size(max = 255)
    @Column(name = "password", nullable = false)
    private String password;

    @NotBlank
    @NotNull
    @CreatedDate
    @Column(name = "created_at", nullable = false)
    private LocalDateTime created_at;

    @OneToMany
    private List<Submission> listSubmissions;

    @OneToMany
    private List<Candidate> listCandidates;

}

