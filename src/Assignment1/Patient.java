package Assignment1;

import java.util.Objects;

public class Patient {
    private int id;
    private String name;
    private int age;
    private String ailment;

    // Constructor
    public Patient(int id, String name, int age, String ailment) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    // Overridden methods
    @Override
    public String toString() {
        return String.format("Patient{id=%d, name='%s', age=%d, ailment='%s'}", id, name, age, ailment);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id && age == patient.age && Objects.equals(name, patient.name) && Objects.equals(ailment, patient.ailment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, ailment);
    }
}
