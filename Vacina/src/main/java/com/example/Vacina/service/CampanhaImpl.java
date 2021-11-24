package com.example.Vacina.service;

import com.example.Vacina.model.Campanha;
import com.example.Vacina.repository.CampanhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("campanhaService")
public class CampanhaImpl implements CampanhaService {

    @Autowired
    CampanhaRepository campanhaRepository;

    @Override
    public Optional<Campanha> getCampanhaById(Integer id) {
        return campanhaRepository.findById(id);
    }

    @Override
    public void deleteAllCampanhas() {
        campanhaRepository.deleteAll();
    }

    @Override
    public void deleteCampanhaById(Integer id) {
        campanhaRepository.deleteById(id);
    }

    @Override
    public void updateCampanhaById(Integer id, Campanha campanha) {
        Optional<Campanha> getCampanha = getCampanhaById(id);
        getCampanha.get().setNome(campanha.getNome());
        campanhaRepository.save(campanha);
    }

    @Override
    public void insertCampanha(Campanha campanha) {
        campanhaRepository.save(campanha);
    }

    @Override
    public List<Campanha> getAllCampanhas() {
        return campanhaRepository.findAll();
    }
}
