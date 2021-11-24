package com.example.Vacina.repository;

import com.example.Vacina.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("funcionarioRepository")
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

    @Query(value = "SELECT * FROM VACINA WHERE funcionario_id = ?1 limit 1", nativeQuery = true)
    Optional<Funcionario> getAllFuncionarioByVacina(Integer idvacina);

}
