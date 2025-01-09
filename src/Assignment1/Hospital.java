package Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Hospital {
    private String name;
    private List<Patient> patients;
    private List<Doctor> doctors;

    // Constructor
    public Hospital(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    // Methods to add entities
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Search methods
    public List<Patient> searchPatientsByName(String name) {
        return patients.stream()
                .filter(patient -> patient.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public List<Doctor> searchDoctorsBySpecialty(String specialty) {
        return doctors.stream()
                .filter(doctor -> doctor.getSpecialty().equalsIgnoreCase(specialty))
                .collect(Collectors.toList());
    }

    // Sorting methods
    public void sortPatientsByName() {
        Collections.sort(patients, (p1, p2) -> p1.getName().compareTo(p2.getName()));
    }

    public void sortDoctorsBySpecialty() {
        Collections.sort(doctors, (d1, d2) -> d1.getSpecialty().compareTo(d2.getSpecialty()));
    }

    // Overridden methods
    @Override
    public String toString() {
        return String.format("Hospital{name='%s', patients=%s, doctors=%s}", name, patients, doctors);
    }
}
