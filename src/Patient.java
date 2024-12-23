public class Patient {
    private String Name;
    private int Age;
    public Patient(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }
    public String toString(){
        return "Name: " + Name + ", Age: " + Age;
    }
}
