package com.example.Vacina.service;

import com.example.Vacina.model.Funcionario;;
import java.util.List;
import java.util.Optional;

public interface FuncionarioService {
    Optional<Funcionario> getFuncionarioById(Integer id);
    void deleteAllFuncionarios();
    void updateFuncionarioById(Integer id,Funcionario funcionario);
    void insertAluno(Funcionario funcionario);
    List<Funcionario> getAllFuncionarios();
    Optional<Funcionario> getAllFuncionarioByVacina(Integer IdVacina);
}
