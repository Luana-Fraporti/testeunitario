package com.hackerrank.stereotypes.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "People")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")

    private String name;
    @Column(name = "mobile")
    private String mobile;

    public Person (String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }
}
