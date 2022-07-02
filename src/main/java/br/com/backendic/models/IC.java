package br.com.backendic.models;

import java.util.*;

public class IC {

    private Integer id;
    private Integer year;
    private GradeSystem gradeSystem;
    private List<Student> students = new ArrayList<>();


    public IC() {};

    public IC(Integer id, Integer year, GradeSystem gradeSystem) {
        this.id = id;
        this.year = year;
        this.gradeSystem = gradeSystem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public GradeSystem getGradeSystem() {
        return gradeSystem;
    }

    public void setGradeSystem(GradeSystem gradeSystem) {
        this.gradeSystem = gradeSystem;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IC ic = (IC) o;
        return Objects.equals(id, ic.id) && Objects.equals(year, ic.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, year);
    }
}
