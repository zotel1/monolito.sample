package com.fullstack.curso.service;

import com.fullstack.curso.entities.Curso;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class CursoService {

    private List<Curso> cursos = new ArrayList<>();
    @PostConstruct
    public void postConstruct(){
        cursos.add(new Curso("Java", "Juan Perez"));
        cursos.add(new Curso("DevOps", "Jhon Smith"));
        cursos.add(new Curso("Facturación electronica", "Cristian Sigel"));
    }

    public List<Curso> listar(){
        return cursos;
    }

    public void eliminar(UUID id){
        log.info("Eliminando curso con ID {}", id);
        cursos.removeIf(curso -> curso.getId().equals(id));
    }

    public void agregar(Curso curso) {
        log.info("Guardando curso con datos = {}", curso);
        cursos.add(curso);
    }

    public void actualir(Curso cursoEditado){
        int index = 0;
        for (Curso curso : cursos) {
            if (curso.getId().equals(cursoEditado.getId())) {
                break;
            }
            ++index;
        }
        log.info("Actualizando curso en la posición {} con nuevos datos = {}", index, cursoEditado);
    }

    public Curso buscarPorId(UUID id){
        return cursos.stream()
                .filter(cursos -> cursos.getId().equals(id))
                .findFirst()
                .get();
    }


}
