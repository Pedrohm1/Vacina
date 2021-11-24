package com.example.Vacina.service;

import com.example.Vacina.model.Campanha;

import java.util.List;
import java.util.Optional;

public interface CampanhaService {
    Optional<Campanha> getCampanhaById(Integer id);
    void deleteAllCampanhas();
    void deleteCampanhaById(Integer id);
    void updateCampanhaById(Integer id, Campanha campanha);
    void insertCampanha(Campanha campanha);
    List<Campanha> getAllCampanhas();

}
