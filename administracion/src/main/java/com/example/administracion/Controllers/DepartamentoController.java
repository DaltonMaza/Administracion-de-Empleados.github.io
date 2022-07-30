package com.example.administracion.Controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.administracion.Services.DepartamentoService;
import com.example.administracion.Services.TrabajadorService;

@RestController
@RequestMapping("/departamento")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DepartamentoController {

    @Autowired
    TrabajadorService trabajadorService;
    @Autowired
    DepartamentoService departamentoService;

    @GetMapping("/{idDepartamento}")
    public ArrayList<Map<String, Object>> getEmpleadosByDepartamento(@PathVariable("idDepartamento") Long idDepartamento) {
        return trabajadorService.getTrabajadorByIdDepartamento(idDepartamento);
    }

    @GetMapping("/nombres")
    public ArrayList<HashMap<String, Object>> gett() {
        return departamentoService.getAllNombreDepartamentosSinRepetir();
    }
}