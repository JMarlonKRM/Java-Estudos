package teste.NovoUsuario;

import modelo.base.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuarioTres {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-JPA");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 7L);
        em.detach(usuario);
        usuario.setNome("Leonardo Souza");

//        em.merge(usuario);
        em.getTransaction().commit();

        emf.close();
        em.close();
    }
}
