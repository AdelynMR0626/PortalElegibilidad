package com.example.PortalElegibilidadDeDatos.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/base/api")
public class BaseController {

    @GetMapping(value = "/init")
    public Map<String, Object>init(){
        Map<String, Object> params = new HashMap<>();
        params.put("nombre","Adelyn");
        params.put("Apellido","Robles");

        return params;
    }

}