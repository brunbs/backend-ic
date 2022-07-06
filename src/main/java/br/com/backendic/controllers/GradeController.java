package br.com.backendic.controllers;

import br.com.backendic.models.Grade;
import br.com.backendic.services.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/grades")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @GetMapping
    public ResponseEntity<List<Grade>> getGrades() {
        return ResponseEntity.ok().body(gradeService.getAllGrades());
    }

    @PostMapping
    public ResponseEntity postGrade(@RequestBody Grade grade) {
        return new ResponseEntity<>(gradeService.createGrade(grade), HttpStatus.CREATED);
    }

}
