package com.example.Vacina.service;

import com.example.Vacina.model.Vacina;
import com.example.Vacina.repository.VacinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("vacinaService")
public class VacinaImpl implements VacinaService {

    @Autowired
    VacinaRepository vacinaRepository;

    @Override
    public Optional<Vacina> getVacinaById(Integer id) {
        return vacinaRepository.findById(id);
    }

    @Override
    public List<Vacina> getAllVacinas() {
        return vacinaRepository.findAll();
    }

    @Override
    public void deleteAllVacinas() {
        vacinaRepository.deleteAll();
    }

    @Override
    public void deleteVacinaById(Integer id) {
        vacinaRepository.deleteById(id);
    }

    @Override
    public void updateVacinaById(Integer id, Vacina vacina) {
        Optional<Vacina> getVacina = getVacinaById(id);
        getVacina.get().setNome(vacina.getNome());
        getVacina.get().setValidade(vacina.getValidade());
        getVacina.get().setFuncionarios(vacina.getFuncionarios());
        vacinaRepository.save(vacina);
    }

    @Override
    public void insertVacina(Vacina vacina) {
        vacinaRepository.save(vacina);
    }


}
