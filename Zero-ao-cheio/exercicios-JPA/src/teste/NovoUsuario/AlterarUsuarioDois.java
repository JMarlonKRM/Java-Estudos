package teste.NovoUsuario;

import modelo.base.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuarioDois {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-JPA");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 7L);
        usuario.setNome("Leonardo Alterado");
//        usuario.setEmail("Leonardo@lanche.com.br");

//        em.merge(usuario);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
