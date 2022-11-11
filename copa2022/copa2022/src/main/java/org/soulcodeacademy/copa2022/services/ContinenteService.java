package org.soulcodeacademy.copa2022.services;

import org.soulcodeacademy.copa2022.domain.dto.ContinenteDTO;
import org.soulcodeacademy.copa2022.repositories.ContinenteRepository;

import java.util.List;
import java.util.Optional;

public class ContinenteService {

    @Autowired
    private ContinenteRepository continenteRepository;

    // Listar todos
    public List<Continente> listar() {
        // Retorna os dados da tabela em forma de lista
        // SELECT * FROM continente;
        return this.continenteRepository.findAll();
    }

    // Listar um pelo ID
    public Continente getContinente(Integer idContinente) {
        // SELECT * FROM continente WHERE idContinente = ?
        // Optional = Pode haver continente ou não
        Optional<Continente> continente = this.continenteRepository.findById(idContinente);

        if(continente.isEmpty()) {
            // Não encontrou o continente com id solicitado
            throw new RuntimeException("Este continente não foi encontrado!"); // Causa um erro com a mensagem
        } else {
            return continente.get();
        }
    }
    // Salvar
    public Continente salvar(ContinenteDTO dto) {
        // INSERT INTO continente
        Continente continente = new Continente(null, dto.getNome(), dto.getDescricao()) ;
        Continente continenteSalvo = this.continenteRepository.save(continente);
        return continenteSalvo;
    }
    // Atualizar
    // Precisa do ID do continente e dos dados atualizados
    public Continente atualizar(Integer idContinente, ContinenteDTO dto) {
        // Verificar se o cargo existe mesmo
        Continente continenteAtual = this.getContinente(idContinente);

        continenteAtual.setNome(dto.getNome());
        continenteAtual.setDescricao(dto.getDescricao());


        // Atualiza a entidade pois ela possui um ID diferente de nulo
        Continente atualizado = this.continenteRepository.save(continenteAtual);
        return atualizado;
    }
    // Deletar
    public void deletar(Integer idContinente) {
        Continente continente = this.getContinente(idContinente);
        // DELETE FROM cargo WHERE idCargo = ?
        this.continenteRepository.delete(continente);
    }
}
