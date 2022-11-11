package org.soulcodeacademy.copa2022.controllers;

import org.soulcodeacademy.copa2022.domain.dto.GrupoDTO;
import org.soulcodeacademy.copa2022.services.GrupoService;
import org.soulcodeacademy.domain.Grupo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController // coletar as requisições
public class GrupoController {
    @Autowired
    private GrupoService grupoService;

    @GetMapping("/grupos")
    public List<Grupo> mostrarLista() {
        return this.grupoService.listarTodos();
    }

    @GetMapping("/grupos/{idGrupos}")
    public Grupo getGrupo(@PathVariable Integer idGrupo){
        return this.grupoService.getCliente(idGrupo);
    }

    @PostMapping("/grupos")
    public Grupo salvarGrupo(@Valid @RequestBody GrupoDTO dto) {
        Grupo grupo = this.grupoService.salvar(dto);
        return grupo;
    }

    // PUT = Representa substituição de dados
    @PutMapping("/grupos/{idGrupo}")
    public Grupo atualizar(@PathVariable Integer idGrupo, @Valid @RequestBody GrupoDTO dto) {
        Grupo atualizado = this.grupoService.atualizar(idGrupo, dto);
        return atualizado;
    }

    @DeleteMapping("/grupos/{idGrupo}")
    public void deletar(@PathVariable Integer idGrupo) {
        this.grupoService.deletar(idGrupo);
    }
}