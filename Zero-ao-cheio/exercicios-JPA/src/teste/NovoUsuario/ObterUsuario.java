package teste.NovoUsuario;

import modelo.base.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ObterUsuario {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-JPA");
        EntityManager em = emf.createEntityManager();


        Usuario usuario = em.find(Usuario.class, 7L);
        System.out.println(usuario.getNome());


        em.close();
        emf.close();
    }
}
