package com.example.Vacina.service;


import com.example.Vacina.model.Vacina;

import java.util.List;
import java.util.Optional;


public interface VacinaService {
    Optional<Vacina> getVacinaById(Integer id);
    void deleteAllVacinas();
    void deleteVacinaById(Integer id);
    void updateVacinaById(Integer id, Vacina vacina);
    void insertVacina(Vacina vacina);
    List<Vacina> getAllVacinas();
}
