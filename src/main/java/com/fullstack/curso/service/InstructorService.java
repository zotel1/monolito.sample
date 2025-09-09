package com.fullstack.curso.service;

import com.fullstack.curso.entities.Instructor;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InstructorService {

    private List<Instructor> instructors = new ArrayList<>();

    @PostConstruct
    public void postConstruct(){
        instructors.add(new Instructor("Pepito", "Juan Perez"));
        instructors.add(new Instructor("Fulanito", "Juan Perez"));
        instructors.add(new Instructor("Menganito", "Juan Perez"));
        instructors.add(new Instructor("Luis", "Juan Perez"));
        instructors.add(new Instructor("Facu", "Juan Perez"));
        instructors.add(new Instructor("Jonatan", "Juan Perez"));
        instructors.add(new Instructor("Jorge", "Juan Perez"));
        instructors.add(new Instructor("Gustavo", "Juan Perez"));
        instructors.add(new Instructor("Harry", "Juan Perez"));
        instructors.add(new Instructor("Niall", "Juan Perez"));
        instructors.add(new Instructor("Taylor", "Juan Perez"));
        instructors.add(new Instructor("Jesus", "Juan Perez"));
    }

    public List<Instructor> listar() { return instructors;}
}
