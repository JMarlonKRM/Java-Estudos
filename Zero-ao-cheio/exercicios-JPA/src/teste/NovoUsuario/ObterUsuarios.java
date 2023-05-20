package teste.NovoUsuario;

import modelo.base.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ObterUsuarios {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-JPA");
        EntityManager em = emf.createEntityManager();

        String jpql = "SELECT u FROM Usuario u"; // perigoso pq pode derrubar o sistema dependendo dos tamaho da tabela
        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
        query.setMaxResults(5); //quandos resultados no maximo pode aparecer

        List<Usuario> usuarios = query.getResultList();

        
        //Fazendo de um jeito mais "sucinto"

        //List<Usuario> usuarios = em.createQuery("SELECT u FROM Usuario u", Usuario.class)
        //                           .setMaxResults(5)
        //                           .getResultList();

        for(Usuario usuario: usuarios){
            System.out.println("ID: " + usuario.getID() + " Nome: " + usuario.getNome() + " Email: " + usuario.getEmail());
        }

        em.close();
        emf.close();
    }
}
