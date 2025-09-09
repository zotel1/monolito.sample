package com.fullstack.curso.service;

import com.fullstack.curso.entities.Instructor;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class InstructorService {

    private List<Instructor> instructors = new ArrayList<>();

    @PostConstruct
    public void postConstruct() {
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

    public List<Instructor> listar() {
        return instructors;
    }

    public void modificar(Instructor instructor) {
        int indexArray = 0;
        for (Instructor unInstructor : instructors) {
            if (unInstructor.getId().equals(instructor.getId())) {
                break;
            }
            indexArray++;
        }
        instructors.set(indexArray, instructor);
    }

    public Instructor getInstructor(UUID id) {
        return instructors.stream().filter(instructor -> instructor.getId().equals(id)).findFirst().get();
    }

    public void agregar(Instructor instructor) {
        instructor.setId(UUID.randomUUID());
        instructors.add(instructor);
    }

    public void eliminar(UUID id){
        instructors.removeIf(instructor -> instructor.getId().equals(id));
    }
}
