package br.com.backendic.models;

import java.util.*;

public class GradeSystem {

    private Integer id;
    private List<Grade> grades = new ArrayList<>();

    public GradeSystem(){};

    public GradeSystem(Integer id, List<Grade> grades) {
        this.id = id;
        this.grades = grades;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
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
