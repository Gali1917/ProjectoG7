package com.mintic.tienda.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mintic.tienda.domain.moduleclothes.impl.ManageClothesDomainImpl;
import com.mintic.tienda.repository.IClienteRepo;
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
        prendaDTO.setIdPrenda(16L);
        prendaDTO.setNombre("Otra Camisa");
        prendaDTO.setIdTalla(1L);
        prendaDTO.setIdTipoPrenda(1L);
        prendaDTO.setIdGenero(1L);
        prendaDTO.setPrecio(29000L);
        prendaDTO.setIdMarca(2L);
        prendaDTO.setDetalle("Camisa en algodon para relajarse un domingo");
        prendaDTO.setCantidad(14);
        prendaDTO.setImagen("No disponible");

        prendaDTO = manageClothesDomainImpl.savePrenda(prendaDTO);
        System.out.println(" **** Prenda agregada ::  "+prendaDTO.getNombre());
        model.addAttribute("prenda: ", prendaDTO.getNombre());
        return "agregarPrenda";
    }

    //Lista de prendas en DB
    @GetMapping("/prendas")
    public String prendas(Model model) {
        System.out.println("************************* manageClothesDomainImpl.getAllPrendas() :: "+manageClothesDomainImpl.getAllPrendas());
        model.addAttribute("prendas", manageClothesDomainImpl.getAllPrendas());
        return "prendas";
    }
}
