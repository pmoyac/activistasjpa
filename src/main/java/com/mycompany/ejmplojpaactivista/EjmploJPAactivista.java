/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejmplojpaactivista;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import objetos.Activista;
import objetos.Cliente;
import objetos.Direccion;
import objetos.Problema;

/**
 *
 * @author Laboratorios
 */
public class EjmploJPAactivista {

    public static void main(String[] args) {
        
        EntityManagerFactory mf = Persistence.createEntityManagerFactory("unidadPersistencia");
        EntityManager em = mf.createEntityManager();
        em.getTransaction().begin();
                
        //Crear activista
//        Activista activista = new Activista("Pedro", "Moya", "Castro", "64412456", new GregorianCalendar(2020, 1, 15));
//        
//        em.persist(activista);
//        em.getTransaction().commit();
        
    //Buscar y Actualizar activista
//        Activista a = em.find(Activista.class, 2L);
//        
//        if(a!=null){
//            a.setAp_materno("Halpert");
//            a.setTelefono("64448452");
//            em.persist(a);
////            System.out.println(a.toString());
//        }else{
//            System.out.println("activista no encontrado");
//        }
//        em.getTransaction().commit();

// Eliminar activista
//        Activista a = em.find(Activista.class, 3L);
//        
//        if (a!=null) {
//            em.remove(a);
//            System.out.println("activista eliminado");
//        }else{
//            System.out.println("activista no encontrado");
//        }
//        
//        em.getTransaction().commit();
//  

//Consiiltar tabla
//        CriteriaQuery criteria = em.getCriteriaBuilder().createQuery();
//        
//        criteria.select(criteria.from(Activista.class));
//        Query query = em.createQuery(criteria);
//        List<Activista> activistas = query.getResultList();
//        
//        for (Activista activista: activistas) {
//            System.out.println(activista.toString());
//        }
//        em.getTransaction().commit();

//        Cliente c = new Cliente();
//        c.setNombres("juan");
//        c.setAp_materno("lopez");
//        c.setAp_paterno("rsamirezx");
//        Direccion d = new Direccion("wallby", "villa", 85000L, 548L, c);
//                
//        List<Direccion> ds = new ArrayList();
//
//        ds.add(d);
//        c.setDirecciones(ds);
//        em.persist(c);
//        em.getTransaction().commit();

//        Cliente c = new Cliente();
//        c.setNombres("jim");
//        c.setAp_materno("halpert");
//        c.setAp_paterno("rsamirezx");
//        Activista a = new Activista("pedro","moya","asdg","65465465",new GregorianCalendar(2020, 1, 15));
//        Problema p = new Problema(new GregorianCalendar(2020, 1, 15),new GregorianCalendar(2020, 1, 15),"pendiente");
//        
        
        
    }


}
