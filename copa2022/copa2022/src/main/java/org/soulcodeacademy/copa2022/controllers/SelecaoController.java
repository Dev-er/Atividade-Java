package org.soulcodeacademy.copa2022.controllers;

import org.soulcodeacademy.copa2022.domain.dto.SelecaoDTO;
import org.soulcodeacademy.copa2022.services.SelecaoService;
import org.soulcodeacademy.copa2022.domain.Selecoes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public class SelecaoController {

    @RestController // coletar as requisições
    public class SelecaoController {
        @Autowired
        private SelecaoService selecaoService;

        @GetMapping("/selecoes")
        public List<Selecao> mostrarLista() {
            return this.selecaoService.listarTodos();
        }

        @GetMapping("/selecoes/{idSelecao}")
        public Selecao getSelecao(@PathVariable Integer idSelecao){
            return this.selecaoService.getSelecao(idSelecao);
        }

        @PostMapping("/selecoes")
        public Grupo salvarSelecao(@Valid @RequestBody SelecaoDTO dto) {
            Selecao selecao = this.selecaoService.salvar(dto);
            return selecao;
        }

        // PUT = Representa substituição de dados
        @PutMapping("/selecoes/{idSelecao}")
        public Selecao atualizar(@PathVariable Integer idSelecao, @Valid @RequestBody SelecaoDTO dto) {
            Selecao atualizado = this.selecaoService.atualizar(idSelecao, dto);
            return atualizado;
        }

        @DeleteMapping("/selecoes/{idSelecao}")
        public void deletar(@PathVariable Integer idSelecao) {
            this.selecaoService.deletar(idSelecao);
        }
    }
}
