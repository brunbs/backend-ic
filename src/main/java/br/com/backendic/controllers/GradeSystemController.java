package br.com.backendic.controllers;

import br.com.backendic.models.Grade;
import br.com.backendic.models.GradeSystem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping(value="/grade-systems")
public class GradeSystemController {

    @GetMapping
    public Set<GradeSystem> getAllGradeSystems() {
        Grade g1 = new Grade(1l, "Ficha de Leitura 1");
        Grade g2 = new Grade(2l, "Ficha de Leitura 2");
        Grade g3 = new Grade(3l, "Presença Primeiro Encontro de IC");
        Set<Grade> grades = Stream.of(g1, g2, g3).collect(Collectors.toSet());
        Set<Grade> grades2 = Stream.of(g2, g3).collect(Collectors.toSet());
        GradeSystem gs1 = new GradeSystem(1, grades);
        GradeSystem gs2 = new GradeSystem(2, grades2);

        Set<GradeSystem> gradeSystems = Stream.of(gs1, gs2).collect(Collectors.toSet());

        return gradeSystems;

    }

}
