package demo;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PersistenceResources {

    @PersistenceContext
    @Produces
    private EntityManager em;
}
