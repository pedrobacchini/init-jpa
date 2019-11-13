package com.pedrobacchini.registerclient;

import com.pedrobacchini.registerclient.model.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Example {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Clients-PU");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        Client client = entityManager.find(Client.class, 1);
//        System.out.println(client);

//        Client clientNew = new Client("Pedro");
//        entityManager.getTransaction().begin();
//        entityManager.persist(clientNew);
//        entityManager.getTransaction().commit();

//        entityManager.getTransaction().begin();
//        entityManager.remove(entityManager.find(Client.class,2));
//        entityManager.getTransaction().commit();

//        Client clientPedro = entityManager.find(Client.class, 3);
//        entityManager.getTransaction().begin();
//        clientPedro.setName(clientPedro.getName() + " updated");
//        entityManager.getTransaction().commit();

        Client clientUpdated = new Client(3 , "Maria");
        entityManager.getTransaction().begin();
        entityManager.merge(clientUpdated);
        entityManager.getTransaction().commit();


        entityManager.close();

        entityManagerFactory.close();
    }
}
