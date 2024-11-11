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
