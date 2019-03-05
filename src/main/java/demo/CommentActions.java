package demo;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

@RequestScoped
public class CommentActions {

    @Inject
    private EntityManager em;

    @Transactional(TxType.MANDATORY)
    public void create() {
        Comment c1 = new Comment();
        c1.setMessage("Foo");
        em.persist(c1);
    }

    public List<Comment> comments() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Comment> cq = cb.createQuery(Comment.class);
        Root<Comment> root = cq.from(Comment.class);
        cq.where(cb.isNotNull(root.get(Comment_.message)));
        return em.createQuery(cq).getResultList();
    }
}
