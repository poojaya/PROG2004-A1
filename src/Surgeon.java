
public class Surgeon extends HealthProfessional {
    private String specialty;

    // Default constructor
    public Surgeon() {
        super();
        this.specialty = "";
    }

    // Parameterized constructor
    public Surgeon(int id, String name, String department, String specialty) {
        super(id, name, department);
        this.specialty = specialty;
    }

    // Override printInfo() method
    @Override
    public void printInfo() {
        System.out.println("Surgeon Info:");
        super.printInfo();
        System.out.println("Specialty: " + this.specialty);
    }
}
