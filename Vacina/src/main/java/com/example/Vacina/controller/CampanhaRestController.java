package com.example.Vacina.controller;

import com.example.Vacina.model.Campanha;
import com.example.Vacina.service.CampanhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CampanhaRestController {

    @Autowired
    private CampanhaService campanhaService;

    @RequestMapping(value = "/rest/campanha/getall", method = RequestMethod.GET)
    public List<Campanha> getCampanhas(){
        return campanhaService.getAllCampanhas();
    }

    @RequestMapping(value = "/rest/campanha/get/{id}", method = RequestMethod.GET)
    public Optional<Campanha> getCampanha(@PathVariable("id") Integer id) {
        return campanhaService.getCampanhaById(id);
    }

    @RequestMapping(value = "/rest/campanha/deleteAll", method = RequestMethod.DELETE)
    public void deleteCampanhas() {
        campanhaService.deleteAllCampanhas();
    }

    @RequestMapping(value = "/rest/campanha/delete/{id}", method = RequestMethod.DELETE)
    public void deleteCampanha(@PathVariable("id") Integer id) {
        campanhaService.deleteCampanhaById(id);
    }

    @RequestMapping(value = "/rest/alunos/update/{id}", method = RequestMethod.POST)
    public void updateCampanha(@RequestBody Campanha campanha, @PathVariable("id") Integer id) {
        campanhaService.updateCampanhaById(id, campanha);
    }

    @RequestMapping(value = "/rest/alunos/insert", method = RequestMethod.POST)
    public void insertCampanha(@RequestBody Campanha campanha) {
        campanhaService.insertCampanha(campanha);
    }
}
