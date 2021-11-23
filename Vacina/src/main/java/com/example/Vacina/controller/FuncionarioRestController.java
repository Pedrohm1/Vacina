package com.example.Vacina.controller;

import com.example.Vacina.model.Funcionario;
import com.example.Vacina.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FuncionarioRestController {

    @Autowired
    private FuncionarioService funcionarioService;

    @RequestMapping(value = "rest/funcionario/getAll" , method = RequestMethod.GET)
    public List<Funcionario> getFuncionarios(){
        return funcionarioService.getAllFuncionarios();
    }


}
