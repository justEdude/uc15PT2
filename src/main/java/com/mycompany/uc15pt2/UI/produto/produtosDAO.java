
package com.mycompany.uc15pt2.UI.produto;


import com.mycompany.uc15pt2.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class produtosDAO {
    public void salvar (produto prod) {
        
        EntityManager em = JPAUtil.getEntityManager();
        
        try{
        

        em.getTransaction().begin();
        em.persist(prod);
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
               
      public List<produto> produtor (){
        
        
        EntityManager em = JPAUtil.getEntityManager();
        
        List<produto> lista = null;
        
        try{
            
            String TextoQuery = "select f from produto f ";
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
