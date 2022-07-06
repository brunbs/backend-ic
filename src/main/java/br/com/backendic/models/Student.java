package br.com.backendic.models;

import java.util.*;

public class Student {

    private Long registration;
    private String name;
    private List<IC> icParticipations = new ArrayList<>();

    public Student() {};

    public Student(Long registration, String name) {
        this.registration = registration;
        this.name = name;
    }

    public Long getRegistration() {
        return registration;
    }

    public void setRegistration(Long registration) {
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<IC> getIcParticipations() {
        return icParticipations;
    }

    public void setIcParticipations(List<IC> icParticipations) {
        this.icParticipations = icParticipations;
    }

    public void addIcParticipation(IC ic) {
        icParticipations.add(ic);
    }

    @Override
    public String toString() {
        return "Student{" +
                "registration=" + registration +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(registration, student.registration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registration);
    }
}
