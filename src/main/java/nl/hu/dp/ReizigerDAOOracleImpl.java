package nl.hu.dp;

import javax.persistence.EntityManager;

public class ReizigerDAOOracleImpl extends JPABase implements ReizigerDAO {

    EntityManager em = super.getConnection();

    public Reiziger get(int id) {
        return em.getReference(Reiziger.class, id);
    }

    public void save(Reiziger reiziger) {
        em.getTransaction().begin();
        em.persist(reiziger);
        em.getTransaction().commit();
    }

}
