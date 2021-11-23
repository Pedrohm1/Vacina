package com.example.Vacina.repository;
import com.example.Vacina.model.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository("vacinaRepository")
    public interface VacinaRepository extends JpaRepository<Vacina, Integer> {

}
