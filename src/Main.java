import Assignment1.Patient;
import Assignment1.Doctor;
import Assignment1.Hospital;

public class Main {
    public static void main(String[] args) {
        // Create hospital
        Hospital hospital = new Hospital("City Hospital");

        // Add patients
        hospital.addPatient(new Patient(1, "Alice", 30, "Flu"));
        hospital.addPatient(new Patient(2, "Bob", 45, "Broken Arm"));
        hospital.addPatient(new Patient(3, "Charlie", 25, "Allergy"));

        // Add doctors
        hospital.addDoctor(new Doctor(1, "Dr. Smith", "Cardiology"));
        hospital.addDoctor(new Doctor(2, "Dr. Brown", "Orthopedics"));
        hospital.addDoctor(new Doctor(3, "Dr. Taylor", "Dermatology"));

        // Display all patients and doctors
        System.out.println("All Patients:");
        hospital.getPatients().forEach(System.out::println);

        System.out.println("\nAll Doctors:");
        hospital.getDoctors().forEach(System.out::println);

        // Search patients by name
        System.out.println("\nSearching for patient 'Alice':");
        hospital.searchPatientsByName("Alice").forEach(System.out::println);

        // Search doctors by specialty
        System.out.println("\nSearching for doctors with specialty 'Orthopedics':");
        hospital.searchDoctorsBySpecialty("Orthopedics").forEach(System.out::println);

        // Sort patients by name and doctors by specialty
        System.out.println("\nSorting patients by name:");
        hospital.sortPatientsByName();
        hospital.getPatients().forEach(System.out::println);

        System.out.println("\nSorting doctors by specialty:");
        hospital.sortDoctorsBySpecialty();
        hospital.getDoctors().forEach(System.out::println);
    }
}
