package org.lessons.java.spring_la_mia_pizzeria_crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.lessons.java.spring_la_mia_pizzeria_crud.model.Pizza;
import org.lessons.java.spring_la_mia_pizzeria_crud.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/")
public class PageController {

    @Autowired
    private PizzaRepository repository;
    
    @GetMapping("/index")
    public String index(Model model) {
        List<Pizza> pizze = repository.findAll();
        model.addAttribute("pizze", pizze);
        return "/index";
    }
    
}
