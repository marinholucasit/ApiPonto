package com.lucas.ponto.service;

import com.lucas.ponto.model.JornadaTrabalho;
import com.lucas.ponto.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {

    private JornadaTrabalhoRepository jornadaRepository;

    @Autowired
    public JornadaTrabalhoService(JornadaTrabalhoRepository jornadaTrabalhoRepository){
        this.jornadaRepository = jornadaTrabalhoRepository;
    }

    public JornadaTrabalho createJornadaTrabalho(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public JornadaTrabalho updateJornadaTrabalho(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(long idJornada) {
        return jornadaRepository.findById(idJornada);
    }

    public void deleteJornada(long idJornada) {
        jornadaRepository.deleteById(idJornada);
    }
}
