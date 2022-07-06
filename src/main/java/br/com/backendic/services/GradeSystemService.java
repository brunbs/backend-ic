package br.com.backendic.services;

import br.com.backendic.models.GradeSystem;
import br.com.backendic.repositories.GradeSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeSystemService {

    @Autowired
    private GradeSystemRepository gradeSystemRepository;


    public void createGradeSystem(GradeSystem gradeSystem) {
        gradeSystemRepository.save(gradeSystem);
    }

    public List<GradeSystem> getAllGradeSystems() {
        return gradeSystemRepository.findAll();
    }

}
