package br.com.backendic.repositories;

import br.com.backendic.models.GradeSystem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeSystemRepository extends JpaRepository<GradeSystem, Integer> {
}
