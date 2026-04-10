
package com.mycompany.uc15pt2.UI.vendas;


import com.mycompany.uc15pt2.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class vendasDAO {
    public void salvar (vendas vender) {
        
        EntityManager em = JPAUtil.getEntityManager();
        
        try{
        

        em.getTransaction().begin();
        em.persist(vender);
        em.getTransaction().commit();
        System.out.println("sucesso");
        
        }catch(Exception e){
            System.out.println("erro: " + e.getMessage());
            em.getTransaction().rollback();
            throw e;
        }
        
        finally{
            JPAUtil.closeEM();
        }
    }
               
      public List<vendas> listar (){
        
        
        EntityManager em = JPAUtil.getEntityManager();
        
        List<vendas> lista = null;
        
        try{
            
            String TextoQuery = "select f from vendas f ";
            Query consulta = em.createQuery(TextoQuery);
            
            lista = consulta.getResultList();
            
            
        }catch(Exception e){
            
        System.out.println("erro: " + e.getMessage());
        
    }
        finally{
            JPAUtil.closeEM();
        }
        
        return lista;
        
    }
}
