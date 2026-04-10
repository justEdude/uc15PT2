
package com.mycompany.uc15pt2.UI.funcionarios;

import com.mycompany.uc15pt2.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class funcionariosDAO {
    
    
    
    public void salvar (funcionario func) {
        
        EntityManager em = JPAUtil.getEntityManager();
        
        try{
        

        em.getTransaction().begin();
        em.persist(func);
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
               
      public List<funcionario> funcionario (String dados){
        
        
        EntityManager em = JPAUtil.getEntityManager();
        
        List<funcionario> lista = null;
        
        try{
            
            String TextoQuery = "select f from funcionario f where (:dados is null or f.nome like :dados)";
            Query consulta = em.createQuery(TextoQuery);
            
            consulta.setParameter("dados", dados.isEmpty()? null : "%" + dados + "%");
            
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
