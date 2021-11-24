package com.example.Vacina.service;
import com.example.Vacina.model.Funcionario;
import com.example.Vacina.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.Optional;

public class FuncionarioImpl implements FuncionarioService {

    @Qualifier("funcionarioRepository")
    @Autowired
    FuncionarioRepository funcionarioRepository;

    @Override
    public Optional<Funcionario> getFuncionarioById(Integer id) {
        return funcionarioRepository.findById(id);
    }

    @Override
    public void deleteAllFuncionarios() {
        funcionarioRepository.deleteAll();
    }

    @Override
    public void deleteFuncionarioById(Integer id){
        funcionarioRepository.deleteById(id);
    }

    @Override
    public void updateFuncionarioById(Integer id, Funcionario funcionario) {
        Optional<Funcionario> getFuncionario = getFuncionarioById(id);
        getFuncionario.get().setNome(funcionario.getNome());
        getFuncionario.get().setCpf(funcionario.getCpf());
        getFuncionario.get().setEmail(funcionario.getEmail());
        getFuncionario.get().setPermissao(funcionario.getPermissao());
        funcionarioRepository.save(funcionario);
    }

    @Override
    public void insertFuncionario(Funcionario funcionario) {funcionarioRepository.save(funcionario);
    }

    @Override
    public List<Funcionario> getAllFuncionarios() {
        funcionarioRepository.findAll();
        return null;
    }

    @Override
    public Optional<Funcionario> getAllFuncionarioByVacina(Integer IdVacina) {
                return funcionarioRepository.getAllFuncionarioByVacina(IdVacina);
    }
}
