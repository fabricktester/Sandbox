/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cioruta.daniel.fabrickapiclient.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Daniel
 */
public class PersistenceUtil {

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FabrickTest");
    private static EntityManager entityManager = getEntityManagerFactory().createEntityManager();

    public static EntityManagerFactory getEntityManagerFactory() {
        if (!entityManagerFactory.isOpen()) {
            entityManagerFactory = Persistence.createEntityManagerFactory("FabrickTest");
        }
        return entityManagerFactory;
    }
    

    public static EntityManager getEntityManager() {
        if (!entityManager.isOpen()) {
            entityManager = getEntityManagerFactory().createEntityManager();
        }
        return entityManager;
    }
}
