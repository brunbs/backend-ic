package br.com.backendic.controllers;

import br.com.backendic.models.Grade;
import br.com.backendic.models.GradeSystem;
import br.com.backendic.services.GradeSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(value="/grade-systems")
public class GradeSystemController {

    @Autowired
    private GradeSystemService gradeSystemService;

    @PostMapping
    public void teste() {
        GradeSystem gradeSystem = new GradeSystem();
        gradeSystem.setName("Teste");
        gradeSystem.setDescription("descrição teste");
        Grade grade1 = new Grade();

        grade1.setName("Ficha de Leitura 1");

        Grade grade2 = new Grade();

        grade2.setName("Ficha de Leitura 2");

        Set<Grade> grades = new HashSet<>();
        System.out.println(grades.add(grade1));
        System.out.println(grades.add(grade2));

        gradeSystem.setGrades(grades);

        System.out.println(gradeSystem.getGrades());

        gradeSystemService.createGradeSystem(gradeSystem);

    }

    @GetMapping
    public List<GradeSystem> getAllGradeSystems() {
        return gradeSystemService.getAllGradeSystems();
    }

}
