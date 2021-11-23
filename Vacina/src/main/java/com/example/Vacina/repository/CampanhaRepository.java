package com.example.Vacina.repository;

import com.example.Vacina.model.Campanha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("campanhaRepository")
public interface CampanhaRepository extends JpaRepository<Campanha,Integer> {

}
