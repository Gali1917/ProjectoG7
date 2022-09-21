package com.proyecto.tienda.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.proyecto.tienda.Entity.FacturaPrenda;
import com.proyecto.tienda.Repository.IFacturaPrendaRepository;
import com.proyecto.tienda.service.PrendaService;

@Controller
public class PrendaController {
    
    @Autowired
    private PrendaService prendaService;

    @Autowired
    private IFacturaPrendaRepository facturaPrendaRepository;

    private List<FacturaPrenda> facturaPrendaList = new ArrayList<>();

    public PrendaController(PrendaService prendaService, IFacturaPrendaRepository facturaPrendaRepository){
        this.prendaService = prendaService;
        this.facturaPrendaRepository = facturaPrendaRepository;
        this.facturaPrendaList = this.facturaPrendaRepository.findAllFacturaPrenda();
    }

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("prenda", prendaService.getAllPrenda());
        return "prenda";
    }
}
