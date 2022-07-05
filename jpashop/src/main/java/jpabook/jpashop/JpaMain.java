package jpabook.jpashop;

import jpabook.jpashop.domain.Book;
import jpabook.jpashop.domain.Item;
import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderItem;

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

            Book book=new Book();
            book.setName("JPA");
            book.setAuthor("김영한");

            em.persist(book);



            tx.commit(); //Transaction commit
        } catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }

        emf.close(); //EntityManagerFactory close
    }
}

