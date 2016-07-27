/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aguasclaras.marina.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author gustavo
 */
public class JPAUtil {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("SISMAC");
    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
}
