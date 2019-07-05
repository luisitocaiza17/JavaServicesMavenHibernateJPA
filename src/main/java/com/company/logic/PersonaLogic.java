/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.logic;

import com.mycompany.Entities.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author pc030
 */
public class PersonaLogic {
    public static Persona ConsultarPersona(int id){
        EntityManagerFactory emf =Persistence.createEntityManagerFactory("mavendbConnection");
        EntityManager em= emf.createEntityManager();
        Persona per= em.find(Persona.class, id);
        System.out.println(per);
        em.close();
        return per;
    }
}
