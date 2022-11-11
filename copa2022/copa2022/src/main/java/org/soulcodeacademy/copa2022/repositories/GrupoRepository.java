package org.soulcodeacademy.copa2022.repositories;

import org.soulcodeacademy.copa2022.domain.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoRepository extends JpaRepository <Grupo, Integer> {

}
