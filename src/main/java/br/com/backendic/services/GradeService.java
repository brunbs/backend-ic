package br.com.backendic.services;

import br.com.backendic.models.Grade;
import br.com.backendic.repositories.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {

    @Autowired
    private GradeRepository gradeRepository;

    public Grade createGrade(Grade grade) {
        return gradeRepository.save(grade);
    }

    public Grade getOneGrade(Long id) {
        Grade foundGrade = gradeRepository.findById(id).orElse(null);
        if(foundGrade == null) {
            System.out.println("Implement exception");
        }
        return foundGrade;
    }

    public List<Grade> getAllGrades() {
        return gradeRepository.findAll();
    }

}
