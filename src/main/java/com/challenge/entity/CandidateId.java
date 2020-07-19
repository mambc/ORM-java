package com.challenge.entity;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class CandidateId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user_id;

    @ManyToOne
    @JoinColumn(name = "acceleration_id")
    private Acceleration acceleration_id;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company_id;
}
