package dssnet.contatosmanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Contato implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nome;
    private String siglaComarca;
    private String nomeComarca;
    private String circuito;
    private String cargo;
    private String numero;
    @Column(nullable = false, updatable = false)
    private String codContato;

    // Construtor Padrão
    public Contato() {

    }

    // Construtor Especial
    public Contato(Long id, String nome, String siglaComarca, String nomeComarca, String circuito, String cargo, String numero, String codContato) {
        this.id = id;
        this.nome = nome;
        this.siglaComarca = siglaComarca;
        this.nomeComarca = nomeComarca;
        this.circuito = circuito;
        this.cargo = cargo;
        this.numero = numero;
        this.codContato = codContato;
    }

    // Getters e Setters
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

    public String getSiglaComarca() {
        return siglaComarca;
    }

    public void setSiglaComarca(String siglaComarca) {
        this.siglaComarca = siglaComarca;
    }

    public String getNomeComarca() {
        return nomeComarca;
    }

    public void setNomeComarca(String nomeComarca) {
        this.nomeComarca = nomeComarca;
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

    // Método ToString
    @Override
    public String toString() {
        return "Contato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", siglaComarca='" + siglaComarca + '\'' +
                ", nomeComarca='" + nomeComarca + '\'' +
                ", circuito='" + circuito + '\'' +
                ", cargo='" + cargo + '\'' +
                ", numero='" + numero + '\'' +
                ", codContato='" + codContato + '\'' +
                '}';
    }
}
