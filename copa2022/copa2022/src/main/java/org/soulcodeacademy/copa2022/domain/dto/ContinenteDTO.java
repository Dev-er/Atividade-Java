package org.soulcodeacademy.copa2022.domain.dto;

import javax.validation.constraints.*;

public class ContinenteDTO {
    @NotBlank(message = "Campo nome é obrigatório")
    private String nome;

       private String descricao;

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
