package com.bethehero.spring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String nameONG;

    @Column(length = 100, nullable = false, unique = true)
    private String email;

    @Column(length = 11, nullable = false)
    private int phoneNumber;

    @Column(length = 100, nullable = false)
    private String city;

    @Column(length = 2, nullable = false)
    private String uf;

    @Column(length = 30, nullable = false)
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Case> cases;

}
