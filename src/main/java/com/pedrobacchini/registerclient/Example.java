package com.pedrobacchini.registerclient;

import com.pedrobacchini.registerclient.model.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Example {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Clients-PU");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Client client = entityManager.find(Client.class, 1);

        System.out.println(client);

        entityManager.close();

        entityManagerFactory.close();
    }
}
