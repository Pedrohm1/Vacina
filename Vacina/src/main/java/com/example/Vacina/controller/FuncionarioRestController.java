package com.example.Vacina.controller;

import com.example.Vacina.model.Funcionario;
import com.example.Vacina.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FuncionarioRestController {

    @Autowired
    private FuncionarioService funcionarioService;

    @RequestMapping(value = "rest/funcionario/getAll" , method = RequestMethod.GET)
    public List<Funcionario> getFuncionarios(){
        return funcionarioService.getAllFuncionarios();
    }

    @RequestMapping(value = "/rest/funcionario/get/{id}", method = RequestMethod.GET)
    public Optional<Funcionario> getFuncionario(@PathVariable("id") Integer id) {
        return funcionarioService.getFuncionarioById(id);
    }

    @RequestMapping(value = "/rest/funcionario/getAllFuncionarioByVacina/{id}", method = RequestMethod.GET)
    public Optional<Funcionario> getAllFuncionarioByVacina(@PathVariable("id") Integer id) {
        return funcionarioService.getAllFuncionarioByVacina(id);
    }

    @RequestMapping(value = "/rest/funcionario/deleteAll", method = RequestMethod.DELETE)
    public void deleteFuncionario() {
        funcionarioService.deleteAllFuncionarios();
    }

    @RequestMapping(value = "/rest/funcionario/delete/{id}", method = RequestMethod.DELETE)
    public void deleteFuncionario(@PathVariable("id") Integer id) {
        funcionarioService.deleteFuncionarioById(id);
    }

    @RequestMapping(value = "/rest/funcionario/update/{id}", method = RequestMethod.POST)
    public void updateFuncionario(@RequestBody Funcionario funcionario, @PathVariable("id") Integer id) {
        funcionarioService.updateFuncionarioById(id, funcionario);
    }

    @RequestMapping(value = "/rest/funcionario/insert", method = RequestMethod.POST)
    public void insertFuncionario(@RequestBody Funcionario funcionario) {
        funcionarioService.insertFuncionario(funcionario);
    }
}
