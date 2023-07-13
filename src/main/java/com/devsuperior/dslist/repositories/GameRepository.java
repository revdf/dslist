package com.devsuperior.dslist.repositories;
//1hora e 31 minutos da aula
//camada de acesso a dados REPOSITORY FAZ CONSULTAS AO BANCO DE DADOS 
import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
