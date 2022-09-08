package com.bethehero.spring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "casehero")
@Entity
public class Case {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "casename",length = 10, nullable = false)
    private String caseName;

    @Column(name = "description",length = 100, nullable = false)
    private String description;

    @Column(name = "casevalue", length = 20, precision = 20, scale = 2, nullable = false)
    private Double caseValue;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
