/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.PoinMahasiswa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author HP
 */
public class PoinMahasiswaService {
    
    public void createPoinMahasiswa(PoinMahasiswa pm){
        this.createPoinMahasiswa(pm.getNim(), pm.getNama(), pm.getOmb(), pm.getProfesional(), pm.getKemanusiaan(), pm.getPenunjang());
    }
    
    //CreatePoinMahasiswa data
    public void createPoinMahasiswa(String nim, String nama, int omb, int profesional, int kemanusiaan, int penunjang){
        
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("PoinKKM");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        
        PoinMahasiswa pm = new PoinMahasiswa();
        pm.setNim(nim);
        pm.setNama(nama);
        pm.setOmb(omb);
        pm.setProfesional(profesional);
        pm.setKemanusiaan(kemanusiaan);
        pm.setPenunjang(penunjang);
        
        entitymanager.persist(pm);
        
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
        
    }
    
    //Display data on List
    public List<PoinMahasiswa> listPoinMahasiswa(){
        
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("PoinKKM");
        EntityManager entityManager = emfactory.createEntityManager();
        Query query = entityManager.createQuery("Select m from PoinMahasiswa m");
        List<PoinMahasiswa> listPM = (List<PoinMahasiswa>) query.getResultList();
        return listPM;
    }
    public List<PoinMahasiswa> listPoinMahasiswaSingle(String nim){
        
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("PoinKKM");
        EntityManager entityManager = emfactory.createEntityManager();
        Query query = entityManager.createQuery("Select m from PoinMahasiswa m Where nim="+nim);
        List<PoinMahasiswa> listPM = (List<PoinMahasiswa>) query.getResultList();
        return listPM;
    }
    
    //Delete data
    public void deletePoinMahasiswa(String nim){
        
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("PoinKKM");
        EntityManager entityManager = emfactory.createEntityManager();
        entityManager.getTransaction().begin();
        
        PoinMahasiswa pm = entityManager.find(PoinMahasiswa.class, nim);
        
        entityManager.remove(pm);
        entityManager.getTransaction().commit();
        
        entityManager.close();
        emfactory.close();
    }
    //Update Data
    public void updatePoinMahasiswa(PoinMahasiswa poinMahasiswa){
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("PoinKKM");
        EntityManager entityManager = emfactory.createEntityManager();
        entityManager.getTransaction().begin();
        
        PoinMahasiswa pm = entityManager.find(PoinMahasiswa.class, poinMahasiswa.getNim());
        pm.setNama(poinMahasiswa.getNama());
        pm.setOmb(poinMahasiswa.getOmb());
        pm.setProfesional(poinMahasiswa.getProfesional());
        pm.setKemanusiaan(poinMahasiswa.getKemanusiaan());
        pm.setPenunjang(poinMahasiswa.getPenunjang());
        
        entityManager.getTransaction().commit();
        
        entityManager.close();
        emfactory.close();
    }
}
