package org.soulcodeacademy.copa2022.domain.dto;

import javax.validation.constraints.*;

public class SelecaoDTO {

   // Integer id, String nome, String continente, Number posClass, String foto, Posicao posicao
    @NotBlank(message = "Campo nome é obrigatório")
    private String nome;

    private String continente;
    @NotBlank(message = "Campo nome é obrigatório")
    private Number posClass;

    private String foto;

    private Posicao posicao;

    private String tecnico;

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

    public Number getPosClass() {
        return posClass;
    }

    public void setPosClass(Number posClass) {
        this.posClass = posClass;
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

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }
}
