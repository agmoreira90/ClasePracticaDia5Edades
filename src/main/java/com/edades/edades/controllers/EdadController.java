package com.edades.edades.controllers;

import com.edades.edades.services.EdadService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/edad")
public class EdadController {
    @GetMapping("/{dia}/{mes}/{anio}")
    public String calcularedad(@PathVariable String dia,@PathVariable String mes,@PathVariable String anio){
        return EdadService.calcularEdad(dia,mes,anio);
    }

}
