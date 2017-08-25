/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Entity.Customer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Odie
 */
public class Main {
    public static void main(String[] args) {
        //Persistence.generateSchema("JpaPU", null);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaPU");
        EntityManager em = emf.createEntityManager();
        
//        try{
//            em.getTransaction().begin();
//            Customer c1 = new Customer();
//            em.persist(c1);
//            em.getTransaction().commit();} finally{
//            em.close();
//        }
    }
}
