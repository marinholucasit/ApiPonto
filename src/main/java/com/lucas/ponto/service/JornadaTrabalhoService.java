package com.lucas.ponto.service;

import com.lucas.ponto.model.JornadaTrabalho;
import com.lucas.ponto.repository.JornadaTrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
