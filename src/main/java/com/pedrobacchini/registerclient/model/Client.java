package com.pedrobacchini.registerclient.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
public class Client {

    @Id
    private Integer id;
    private String name;
}
