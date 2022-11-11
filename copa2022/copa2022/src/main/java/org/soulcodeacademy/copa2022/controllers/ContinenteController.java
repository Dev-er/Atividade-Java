package org.soulcodeacademy.copa2022.controllers;

import org.soulcodeacademy.copa2022.domain.dto.ContinenteDTO;
import org.soulcodeacademy.copa2022.domain.Continente;
import org.soulcodeacademy.copa2022.services.ContinenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController // coletar as requisições
public class ContinenteController {
        @Autowired
        private ContinenteService ContinenteService;

        @GetMapping("/continentes")
        public List<Continente> mostrarLista() {
            return this.continenteService.listarTodos();
        }

        @GetMapping("/continentes/{idContinente}")
        public Continente getContinente(@PathVariable Integer idContinente){
            return this.continenteService.getContinente(idContinente);
        }

        @PostMapping("/continentes")
        public Continente salvarContinente(@Valid @RequestBody ContinenteDTO dto) {
            Continente continente = this.continenteService.salvar(dto);
            return continente;
        }

        // PUT = Representa substituição de dados
        @PutMapping("/continentes/{idContinente}")
        public Continente atualizar(@PathVariable Integer idContinente, @Valid @RequestBody ContinenteDTO dto) {
            Continente atualizado = this.continenteService.atualizar(idContinente, dto);
            return atualizado;
        }

        @DeleteMapping("/continentes/{idContinente}")
        public void deletar(@PathVariable Integer idContinente) {
            this.continenteService.deletar(idContinente);
        }
}

