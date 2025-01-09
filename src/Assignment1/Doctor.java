package Assignment1;



public class Doctor extends Person {
    private String specialty;

    // Constructor
    public Doctor(int id, String name, String specialty) {
        super(id, name);
        this.specialty = specialty;
    }

    // Getter
    public String getSpecialty() {
        return specialty;
    }

    // Overridden methods
    @Override
    public String toString() {
        return String.format("Doctor{id=%d, name='%s', specialty='%s'}", getId(), getName(), specialty);
    }
}
