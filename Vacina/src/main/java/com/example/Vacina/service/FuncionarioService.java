package com.example.Vacina.service;

import com.example.Vacina.model.Funcionario;;
import java.util.List;
import java.util.Optional;

public interface FuncionarioService {
    Optional<Funcionario> getFuncionarioById(Integer id);
    void deleteAllFuncionarios();
    void deleteFuncionarioById(Integer id);
    void updateFuncionarioById(Integer id,Funcionario funcionario);
    void insertFuncionario(Funcionario funcionario);
    List<Funcionario> getAllFuncionarios();
    Optional<Funcionario> getAllFuncionarioByVacina(Integer IdVacina);
}
