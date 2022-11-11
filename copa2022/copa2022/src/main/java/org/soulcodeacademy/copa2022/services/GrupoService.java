package org.soulcodeacademy.copa2022.services;

import org.soulcodeacademy.copa2022.domain.dto.GrupoDTO;
import org.soulcodeacademy.copa2022.repositories.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public class GrupoService {

    @Autowired
    private GrupoRepository grupoRepository;

    // Listar todos
    public List<Grupo> listar() {
        // Retorna os dados da tabela em forma de lista
        // SELECT * FROM cargo;
        return this.grupoRepository.findAll();
    }

    // Listar um pelo ID
    public Grupo getGrupo(Integer idGrupo) {
        // SELECT * FROM cargo WHERE idCargo = ?
        // Optional = Pode haver cargo ou não
        Optional<Grupo> grupo = this.grupoRepository.findById(idGrupo);

        if(grupo.isEmpty()) {
            // Não encontrou o cargo com id solicitado
            throw new RuntimeException("Este grupo não foi encontrado!"); // Causa um erro com a mensagem
        } else {
            return grupo.get();
        }
    }
    // Salvar
    public Grupo salvar(GrupoDTO dto) {
        // INSERT INTO cargo
        Grupo grupo = new Grupo(null, dto.getNome(), dto.getContinente(), dto.getPosClass(), dto.getNomeGrupo());
        Grupo grupoSalvo = this.grupoRepository.save(grupo);
        return grupoSalvo;
    }
    // Atualizar
    // Precisa do ID do cargo e dos dados atualizados
    public Grupo atualizar(Integer idGrupo, GrupoDTO dto) {
        // Verificar se o cargo existe mesmo
        Grupo grupotual = this.getGrupo(idGrupo);

        grupoAtual.setNome(dto.getNome());
        grupoAtual.setContinente(dto.getContinente());
        grupoAtual.setPosClass(dto.getPosClass());

        // Atualiza a entidade pois ela possui um ID diferente de nulo
        Grupo atualizado = this.grupoRepository.save(grupoAtual);
        return atualizado;
    }
    // Deletar
    public void deletar(Integer idGrupo) {
        Grupo grupo = this.getGrupo(idGrupo);
        // DELETE FROM cargo WHERE idCargo = ?
        this.grupoRepository.delete(grupo);
    }
}
