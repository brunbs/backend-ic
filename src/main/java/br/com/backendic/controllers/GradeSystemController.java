package br.com.backendic.controllers;

import br.com.backendic.models.Grade;
import br.com.backendic.models.GradeSystem;
import br.com.backendic.services.GradeSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/grade-systems")
public class GradeSystemController {

    @Autowired
    private GradeSystemService gradeSystemService;

    @PostMapping
    public void teste(@RequestBody List<Grade> grades) {
        System.out.println(grades);
        GradeSystem gradeSystem = new GradeSystem();
        gradeSystem.setName("Teste");
        gradeSystem.setDescription("descrição teste");
        gradeSystem.setGrades(grades.stream().collect(Collectors.toSet()));

        gradeSystemService.createGradeSystem(gradeSystem);

    }

    @GetMapping
    public List<GradeSystem> getAllGradeSystems() {
        return gradeSystemService.getAllGradeSystems();
    }

}
