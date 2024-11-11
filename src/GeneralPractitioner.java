public class GeneralPractitioner extends HealthProfessional {
    private String clinicName;

    // Default constructor
    public GeneralPractitioner() {
        super();
        this.clinicName = "";
    }

    // Parameterized constructor
    public GeneralPractitioner(int id, String name, String department, String clinicName) {
        super(id, name, department);
        this.clinicName = clinicName;
    }

    // Override printInfo() method
    @Override
    public void printInfo() {
        System.out.println("General Practitioner Info:");
        super.printInfo();
        System.out.println("Clinic Name: " + this.clinicName);
    }
}
public class Surgeon extends HealthProfessional {
    private String specialty;

    // Default constructor
    public Surgeon() {
        super();
        this.specialty = "";
    }

      // Constructor to initialize all variables
      public Surgeon(int id, String name, String department, String specialty) {
        super(id, name, department);
        this.specialty = specialty;
    }
    @Override
    public void printInfo() {
        System.out.println("Surgeon Info:");
        super.printInfo();
        System.out.println("Specialty: " + this.specialty);
    }
}