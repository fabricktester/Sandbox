/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cioruta.daniel.fabrickapiclient.core;

import it.cioruta.daniel.fabrickapiclient.artifacts.Transaction;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Daniel
 */
public class TransactionsRepository {

    private EntityManager entityManager;

    public TransactionsRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Optional<Transaction> findById(String id) {
        Transaction tr = entityManager.find(Transaction.class, id);
        return tr != null ? Optional.of(tr) : Optional.empty();
    }

    public List<Transaction> findAll() {
        return entityManager.createQuery("from Transaction").getResultList();
    }

    public Optional<Transaction> save(Transaction transaction) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(transaction);
            entityManager.getTransaction().commit();
            entityManager.clear();
            return Optional.of(transaction);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }


}
