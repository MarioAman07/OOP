package Assignment1;

public class Doctor {
    private String name;
    private int age;
    private String speciality;

    public Doctor(String name, int age, String speciality){
        this.name = name;
        this.age = age;
        this.speciality = speciality;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getSpeciality(){
        return speciality;
    }
    public void setSpeciality(String speciality){
        this.speciality = speciality;
    }

    public void treatPatient(Patient patient){
        System.out.println("Doctor " + name + " is treating patient " + patient.getName() + patient.getDiagnosis());
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Age: " + age + ", Speciality: " + speciality;

    }

}