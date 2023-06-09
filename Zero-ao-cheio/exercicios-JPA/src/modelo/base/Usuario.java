package modelo.base;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long ID;
    private String nome;
    private String Email;

    public Usuario() {
    }

    public Usuario(String nome, String Email) {
        this.nome = nome;
        this.Email = Email;
    }

    public long getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
