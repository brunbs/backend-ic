package br.com.backendic.models;

import javax.persistence.*;
import java.util.*;
@Entity
@Table(name="grade_system")
public class GradeSystem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(
            name = "GradeSystem_Grade",
            joinColumns = { @JoinColumn(name = "grade_system_id") },
            inverseJoinColumns = { @JoinColumn(name = "grade_id") }
    )
    private Set<Grade> grades;

    public GradeSystem(){};

    public GradeSystem(Integer id, String name, String description, Set<Grade> grades) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.grades = grades;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Grade> getGrades() {
        return grades;
    }

    public void setGrades(Set<Grade> grades) {
        this.grades = grades;
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    @Override
    public String toString() {
        return "GradeSystem{" +
                "id=" + id +
                ", grades=" + grades +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GradeSystem that = (GradeSystem) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
