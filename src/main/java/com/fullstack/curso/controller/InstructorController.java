package com.fullstack.curso.controller;

import com.fullstack.curso.service.InstructorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/instructores")
public class InstructorController {

    private final InstructorService instructorService;

    public InstructorController(InstructorService instructorService){
        this.instructorService = instructorService;
    }

    //@RequestMapping
  //  public String listar(Model modelo)

}
