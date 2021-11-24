package com.example.Vacina.controller;

import com.example.Vacina.service.VacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VacinaRestController {

    @Autowired
    private VacinaService vacinaService;



}
