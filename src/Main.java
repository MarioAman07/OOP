import Assignment1.Patient;
import Assignment1.Doctor;
import Assignment1.Hospital;
public class Main {
    public static void main(String[] args) {
        //Creating hospital
        Hospital hospital = new Hospital("Mediker","st. Zhumabek Tashenov 20");
        //Creating doctors
        Doctor doctor1 = new Doctor("Asel", 32, "Neurologist");
        Doctor doctor2 = new Doctor("Aman", 34, "Cardiologist");

        //Creating patients
        Patient patient1 = new Patient("Inkar", 23, "Migraine");
        Patient patient2 = new Patient("Ernur", 24, "Heart Disease");

        //Adding doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        //output information
        System.out.println("Hospital name: " + hospital.getName());
        System.out.println("Address: " + hospital.getAddress());

        System.out.println("Doctors:");
        for (Doctor doctor : hospital.getDoctors()) {
            System.out.println("  " + doctor);  // Use toString method of Doctor
        }

        System.out.println("Patients:");
        for (Patient patient : hospital.getPatients()) {
            System.out.println("  " + patient);  // Use toString method of Patient
        }

        doctor1.treatPatient(patient1);
        doctor2.treatPatient(patient2);


    }
}