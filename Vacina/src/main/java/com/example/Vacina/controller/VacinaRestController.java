package com.example.Vacina.controller;

import com.example.Vacina.model.Vacina;
import com.example.Vacina.service.VacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VacinaRestController {

    @Autowired
    private VacinaService vacinaService;

    @RequestMapping(value = "/rest/vacina/getall", method = RequestMethod.GET)
    public List<Vacina> getVacinas(){
        return vacinaService.getAllVacinas();
    }

    @RequestMapping(value = "/rest/vacina/get/{id}", method = RequestMethod.GET)
    public Optional<Vacina> getVacina(@PathVariable("id") Integer id) {
        return vacinaService.getVacinaById(id);
    }

    @RequestMapping(value = "/rest/vacina/deleteAll", method = RequestMethod.DELETE)
    public void deletVacinas() {
        vacinaService.deleteAllVacinas();
    }

    @RequestMapping(value = "/rest/vacina/delete/{id}", method = RequestMethod.DELETE)
    public void delevacina(@PathVariable("id") Integer id) {
        vacinaService.deleteVacinaById(id);
    }

    @RequestMapping(value = "/rest/vacina/update/{id}", method = RequestMethod.POST)
    public void updateVacina(@RequestBody Vacina vacina, @PathVariable("id") Integer id) {
        vacinaService.updateVacinaById(id, vacina);
    }

    @RequestMapping(value = "/rest/vacina/insert", method = RequestMethod.POST)
    public void insertVacina(@RequestBody Vacina aluno) {
        vacinaService.insertVacina(aluno);
    }


}
