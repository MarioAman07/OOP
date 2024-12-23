package Assignment1;

import java.util.ArrayList;

public class Hospital {
    private String name;
    private String address;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital(String name, String address){
        this.name = name;
        this.address = address;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }
    public void addDoctor(Doctor doctor){
        this.doctors.add(doctor);
    }
    public ArrayList<Patient> getPatients(){
        return patients;
    }

    public void addPatient(Patient patient){
        this.patients.add(patient);
    }

    @Override
    public String toString(){
        return "Hospital name: " + name + ", address: " + address + ", doctors: " + doctors + ", patients: " + patients;
    }
}
