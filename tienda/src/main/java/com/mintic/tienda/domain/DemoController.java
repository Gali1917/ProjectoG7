package com.mintic.tienda.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mintic.tienda.entity.Cliente;
import com.mintic.tienda.repository.IClienteRepo;

@Controller
public class DemoController {
    
    @Autowired
    private IClienteRepo clienteRepo;

    @GetMapping("/home")
    public String home(@RequestParam(name="name", required=false, defaultValue="xName") String name, Model model) {
        
        // Esto va en Service, se hace de prueba para
        // guardar un cliente en tabla
        Cliente cliente = new Cliente();
        cliente.setNombre("Jhon");

        clienteRepo.save(cliente);

        model.addAttribute("name", name);
        return "home";
    }

    //Lista de clientes en DB
    @GetMapping("/clientes")
    public String prendas(Model model) {
        model.addAttribute("clientes", clienteRepo.findAll());
        return "clientes";
    }
}
