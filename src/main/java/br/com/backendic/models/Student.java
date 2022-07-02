package br.com.backendic.models;

import java.util.Objects;
import java.util.Set;

public class Student {

    private Long registration;
    private String name;
    private Set<IC> icParticipations;

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

    public Set<IC> getIcParticipations() {
        return icParticipations;
    }

    public void setIcParticipations(Set<IC> icParticipations) {
        this.icParticipations = icParticipations;
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
