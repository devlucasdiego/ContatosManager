package dssnet.contatosmanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Contato implements Serializable {
    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nome;
    private String circuito;
    private String cargo;
    private String numero;
    private String codContato;

    public Contato() {

    }

    public Contato(Long id, String nome, String circuito, String cargo, String numero, String codContato) {
        this.id = id;
        this.nome = nome;
        this.circuito = circuito;
        this.cargo = cargo;
        this.numero = numero;
        this.codContato = codContato;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodContato() {
        return codContato;
    }

    public void setCodContato(String codContato) {
        this.codContato = codContato;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", circuito='" + circuito + '\'' +
                ", cargo='" + cargo + '\'' +
                ", numero='" + numero + '\'' +
                ", codContato='" + codContato + '\'' +
                '}';
    }
}
