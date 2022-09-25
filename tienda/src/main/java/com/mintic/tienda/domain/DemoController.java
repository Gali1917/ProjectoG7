package com.mintic.tienda.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mintic.tienda.domain.moduleclothes.impl.ManageClothesDomainImpl;
import com.mintic.tienda.service.DTO.PrendaDTO;

@Controller
public class DemoController {
    

    @Autowired
    private ManageClothesDomainImpl manageClothesDomainImpl;


    @GetMapping("/guardar/{id}")
    public String actualizar(@PathVariable("id") Long id, Model model) {
        if(id != null && id != 0) {
            model.addAttribute("prenda", manageClothesDomainImpl.getOnePrenda(id));
        } else {
            model.addAttribute("prenda", new PrendaDTO());
        }
        return "formulario_editar";
    }

    @PostMapping("/guardar")
    public String guardar(PrendaDTO prendaDTO, Model model) {
        prendaDTO = manageClothesDomainImpl.savePrenda(prendaDTO);
        return "redirect:/inventario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Long id, Model model) {
        manageClothesDomainImpl.deletePrendaById(id);
        return "redirect:/inventario";
    }

    @GetMapping("/inventario")
    public String prendas(Model model) {
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
