package com.lucas.ponto.controller;

import com.lucas.ponto.model.JornadaTrabalho;
import com.lucas.ponto.service.JornadaTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    private JornadaTrabalhoService jornadaTrabalhoService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.createJornadaTrabalho(jornadaTrabalho);
    }
}
