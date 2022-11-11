package org.soulcodeacademy.copa2022.repositories;

import org.soulcodeacademy.domain.Continente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContinenteRepository extends JpaRepository <Continente, Integer> {

}