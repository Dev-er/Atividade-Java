package org.soulcodeacademy.copa2022.domain;

import org.soulcodeacademy.copa2022.domain.enums.Perfil;

import javax.persistence.*;
    @Entity
    @Table(name = "grupos") // coloca um nome específico na tabela
    public abstract class Grupos { // Não será possível criar objetos desta classe
        @Id // torna o campo abaixo uma PRIMARY KEY
        @GeneratedValue(strategy = GenerationType.IDENTITY) // preenche o campo id com AUTO_INCREMENT
        protected Integer id;

        @Column(nullable = false, length = 10)
        protected String nome;

        @Column(nullable = false, unique = true, length = 30)
        protected String continente;

        @Column(nullable = false, unique = true, length = 10)
        protected Number posClass;


        // Representa os valores do ENUM como texto
        @Enumerated(EnumType.STRING)
        @Column(nullable = false)
        protected Perfil perfil; // Indica o que este usuário é no sistema

        public Grupos() {
        }

        public Grupos(Integer id, String nome, String continente, Number posClass, Perfil perfil) {
            this.id = id;
            this.nome = nome;
            this.continente = continente;
            this.posClass = posClass;
            this.perfil = perfil;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getContinente() {
            return continente;
        }

        public void setContinente(String continente) {
            this.continente = continente;
        }

        public String getPosClass() {
            return posClass;
        }

        public void setPosClass(String posClass) {
            this.posClass = posClass;
        }

        public Perfil getPerfil() {
            return perfil;
        }

        public void setPerfil(Perfil perfil) {
            this.perfil = perfil;
        }
    }
