package org.soulcodeacademy.copa2022.repositories;

import org.soulcodeacademy.copa2022.domain.Selecao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SelecaoRepository extends JpaRepository <Selecao, Integer> {

}