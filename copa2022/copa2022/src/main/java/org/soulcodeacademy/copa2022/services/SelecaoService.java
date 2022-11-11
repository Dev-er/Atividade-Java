package org.soulcodeacademy.copa2022.services;

import org.soulcodeacademy.copa2022.domain.Selecoes;
import org.soulcodeacademy.copa2022.domain.dto.SelecaoDTO;
import org.soulcodeacademy.copa2022.repositories.SelecaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

public class SelecaoService {

   @Autowired
   private SelecaoRepository selecaoRepository;

        // Listar todos
        public List<Selecoes> listar() {
            // Retorna os dados da tabela em forma de lista
            // SELECT * FROM cargo;
            return this.selecaoRepository.findAll();
        }

        // Listar um pelo ID
        public Selecoes getSelecao(Integer idSelecao) {
            // SELECT * FROM selecao WHERE idSelecao = ?
            // Optional = Pode haver selecao ou não
            Optional<Selecao> selecao = this.selecaoRepository.findById(idSelecao);

            if(selecao.isEmpty()) {
                // Não encontrou a selecao com id solicitado
                throw new RuntimeException("Esta selecão não foi encontrado!"); // Causa um erro com a mensagem
            } else {
                return selecao.get();
            }
        }
        // Salvar
        //public Selecoes(Integer id, String nome, String continente, Number posClass, String foto, Posicao posicao) {
        //            super(id, nome, continente, posClass, Perfil.JOGADOR); // Chamada do Construtor de Seleções
        public Selecoes salvar(SelecaoDTO dto) {
            // INSERT INTO cargo
            Selecao selecao = new Selecao(null, dto.getNome(), dto.getContinente(), dto.getPosClass(), dto.getFoto(), dto.getPosicao(), dto.getTecnico());
            Selecao selecaoSalvo = this.selecaoRepository.save(selecao);
            return selecaoSalvo;
        }
        // Atualizar
        // Precisa do ID do cargo e dos dados atualizados
        public Selecoes atualizar(Integer idSelecao, SelecaoDTO dto) {
            // Verificar se o cargo existe mesmo
            Selecao selecaoAtual = this.getSelecao(idSelecao);

            selecaoAtual.setNome(dto.getNome());
            selecaoAtual.setContinente(dto.getContinente());
            selecaoAtual.setPosClass(dto.getPosClass());
            selecaoAtual.setFoto(dto.getFoto());
            selecaoAtual.setPosicao(dto.getPosicao());
            selecaoAtual.setTecnico(dto.getTecnico());


            // Atualiza a entidade pois ela possui um ID diferente de nulo
            Selecao atualizado = this.selecaoRepository.save(selecaoAtual);
            return atualizado;
        }
        // Deletar
        public void deletar(Integer idSelecao) {
            Selecao selecao = this.getSelecao(idSelecao);
            // DELETE FROM selecao WHERE idSelecao = ?
            this.selecaoRepository.delete(selecao);
        }
}
