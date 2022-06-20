package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf =Persistence.createEntityManagerFactory("hello");


        EntityManager em = emf.createEntityManager();
        EntityTransaction tx= em.getTransaction();

        tx.begin(); //Transaction start
        try{
//            Member findMember = em.find(Member.class,1L);
            Member member=em.find(Member.class,150L);

            member.setName("hhh");

            em.persist(member);

            tx.commit(); //Transaction commit
        } catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }

        emf.close(); //EntityManagerFactory close
    }
}
