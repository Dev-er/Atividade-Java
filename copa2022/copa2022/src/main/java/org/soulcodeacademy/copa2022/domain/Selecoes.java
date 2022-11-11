package org.soulcodeacademy.copa2022.domain;

import org.soulcodeacademy.copa2022.domain.enums.Perfil;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Selecoes extends Grupos{

        // Coluna foto não é obrigatória
        private String foto;

        @ManyToOne // MUITOS Selecões para UM Grupo
        @JoinColumn(name = "id_selecao") // Cria uma coluna nova que é a chave estrangeira de Grupos
        private Posicao posicao; // se eu quiser mudar a posicao do jogador ou substituí-lo basta mudar o objeto deste campo

        public Selecoes() {
        }

        public Selecoes(Integer id, String nome, String continente, Number posClass, String foto, Posicao posicao) {
            super(id, nome, continente, posClass, Perfil.JOGADOR); // Chamada do Construtor de Seleções
            this.foto = foto;
            this.posicao = posicao;
        }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }
}
