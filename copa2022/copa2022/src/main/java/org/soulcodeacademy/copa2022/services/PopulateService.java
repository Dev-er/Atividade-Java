package org.soulcodeacademy.copa2022.services;

import org.soulcodeacademy.copa2022.domain.Grupos;
import org.soulcodeacademy.copa2022.domain.Selecoes;
import org.soulcodeacademy.copa2022.repositories.GrupoRepository;
import org.soulcodeacademy.copa2022.repositories.SelecaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Torna o objeto de PopulateService disponível para toda a aplicação (global)
@Service // indica para o Spring que esta classe será gerenciada por ele
public class PopulateService {
    @Autowired // injetar o objeto direto na classe
    private GrupoRepository cargoRepository;

    @Autowired
    private SelecaoioRepository funcionarioRepository;

    public void populate() {
        // Grupos(Integer id, String nome, String continente, Number posClass, Perfil perfil)
        Grupo gr1 = new Grupo(null, "Qatar", "Ásia", 1, "A");
        Grupo gr2 = new Grupo(null, "Equador", "América do Sul", 2, "A");
        Grupo gr3 = new Grupo(null, "Senegal", "Áfricas", 3, "A");
        Grupo gr4 = new Grupo(null, "Holanda", "Europa", 4, "A");


        // Integer id, String nome, String continente, Number posClass, String foto, Posicao posicao
        Selecao s1 = new Selecao(null, "Qatar", "Ásia", 1, "Escudo.jpg", null);
        Selecao s2 = new Selecao(null, "Equador", "América do Sul", 2, "Escudo. jpg", null);

        Funcionario f2 = new Funcionario(null, "Victor Icoma", "victor.icoma@gmail.com", "51127383671", "12345", null, c2);

        // vamos persistir as entidades = salvar no banco
        this.grupoRepository.save(gr1); // INSERT INTO
        this.grupoRepository.save(gr2);
        this.grupoRepository.save(gr3);
        this.grupoRepository.save(gr4);

        this.selecaoRepository.save(s1);
        this.selecaoRepository.save(s2);
    }
}