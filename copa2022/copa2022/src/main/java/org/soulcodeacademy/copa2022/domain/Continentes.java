package org.soulcodeacademy.copa2022.domain;

import javax.persistence.*; // JPA = JAVA PERSISTENCE API

// Transformar a classe em uma entidade/tabela no banco
@Entity
public class Continentes { // nome da tabela = cargo
    @Id // PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
    private Integer idContinente; // será a chave primária da tabela

    @Column(nullable = false, length = 50) // NOT NULL, e máximo de 50 caracteres
    private String nome;
    @Column(nullable = false, length = 120) // NOT NULL, e 120 caracteres
    private String descricao;


    // a ORM irá usar este construtor em conjunto dos getters/setters
    public Continentes() {}

    public Continentes(Integer idContinente, String nome, String descricao) {
        this.idContinente = idContinente;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Integer getIdContinente() {
        return idContinente;
    }

    public void setIdContinente(Integer idContinente) {
        this.idContinente = idContinente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
