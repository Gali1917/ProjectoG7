package com.mintic.tienda.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mintic.tienda.domain.moduleclothes.impl.ManageClothesDomainImpl;
import com.mintic.tienda.service.DTO.PrendaDTO;

@Controller
public class DemoController {
    

    @Autowired
    private ManageClothesDomainImpl manageClothesDomainImpl;

    @GetMapping("/agregarPrenda")
    public String home(Model model) {
        
        // Esto va en Service, se hace de prueba para
        // guardar una prenda en tabla

        PrendaDTO prendaDTO = new PrendaDTO();
        prendaDTO.setIdPrenda(2L);
        prendaDTO.setNombre("Camisa");
        prendaDTO.setTalla("M");
        prendaDTO.setTipoPrenda("Superior");
        prendaDTO.setGenero("Masculino");
        prendaDTO.setPrecio(29000L);
        prendaDTO.setMarca("Nike");
        prendaDTO.setDetalle("Camisa en algodon para relajarse un domingo");
        prendaDTO.setCantidad(14);
        prendaDTO.setImagen("No disponible");

        prendaDTO = manageClothesDomainImpl.savePrenda(prendaDTO);
        System.out.println(" **** Prenda agregada ::  "+prendaDTO.getNombre());
        model.addAttribute("prenda: ", prendaDTO.getNombre());
        return "agregarPrenda";
    }

    //Lista de prendas en DB
    @GetMapping("/inventario")

    public String prendas(Model model) {
        System.out.println("************************* manageClothesDomainImpl.getAllPrendas() :: "+manageClothesDomainImpl.getAllPrendas());
        model.addAttribute("inventario", manageClothesDomainImpl.getAllPrendas());
        return "inventario";
    }

    @GetMapping("/")
    public String index(Model model){
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model){
        return "login";
    }

    @GetMapping("/nosotros")
    public String nosotros(Model model){
        return "/pages/nosotros/index";
    }

    @GetMapping("/editar")
    public String editar(Model model){
        return "formulario_editar";
    }

    @GetMapping("/crear")
    public String crear(Model model){
        return "formulario";
    }

    @GetMapping("/man")
    public String man(Model model){
        return "man";
    }

    @GetMapping("/woman")
    public String woman(Model model){
        return "woman";
    }
}
