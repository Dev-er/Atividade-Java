package org.soulcodeacademy.copa2022.domain.dto;

import javax.validation.constraints.*;
public class GrupoDTO {
   // Integer id, String nome, String continente, Number posClass, Perfil perfil
    @NotBlank(message = "Campo nome é obrigatório")
    private String nome;

    private String continente;
    @NotBlank(message = "Campo nome é obrigatório")
    private Number posClass;

    @NotBlank(message = "Campo nome é obrigatório")
    private String NomeGrupo;

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public java.lang.String getContinente() {
        return continente;
    }

    public void setContinente(java.lang.String continente) {
        this.continente = continente;
    }

    public java.lang.Number getPosClass() {
        return posClass;
    }

    public void setPosClass(java.lang.Number posClass) {
        this.posClass = posClass;
    }

    public java.lang.String getNomeGrupo() {
        return NomeGrupo;
    }

    public void setNomeGrupo(java.lang.String nomeGrupo) {
        NomeGrupo = nomeGrupo;
    }
}
