package com.outjected.demo;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

@RequestScoped
public class EventLogActions {

    @Inject
    private EntityManager em;

    @Transactional(TxType.MANDATORY)
    public void create() {
        EventLog e1 = new EventLog();
        e1.setMessage("Foo");
        em.persist(e1);
        EventLog e2 = new EventLog();
        e2.setMessage("Bar");
        em.persist(e2);
    }
}
