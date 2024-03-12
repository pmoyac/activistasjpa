/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import interfaces.IProblema;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;
import objetos.Problema;

/**
 *
 * @author Pedro
 */
public class ProblemaDAO implements IProblema {

    @Override
    public List<Problema> buscarProblemasPorNombre() {
        EntityManagerFactory mf = Persistence.createEntityManagerFactory("unidadPersistencia");
        EntityManager em = mf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Problema> cq = cb.createQuery(Problema.class);
        Root<Problema> root = cq.from(Problema.class);
//        cq.select(root).where(cb.like(root.get(Problema.nombre), "%contaminacion%"));
        return em.createQuery(cq).getResultList();
    }

}
