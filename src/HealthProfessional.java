public class HealthProfessional {
    // Instance variables
    private int id;
    private String name;
    private String department;

    // Default constructor
    public HealthProfessional() {
        this.id = 0;
        this.name = "";
        this.department = "";
    }

    // Constructor to initialize all variables
    public HealthProfessional(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Method to print all instance variables
    public void printInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
    }

    // Getters for child classes
    public String getName() {
        return name;
    }
}
