public class Appointment {
    private String patientName;
    private String mobileNumber;
    private String appTime;
    private HealthProfessional doctor;

    // Default constructor
    public Appointment() {
        this.appTime = "";
        this.doctor = null;
        this.mobileNumber = "";
        this.patientName = "";
    }

    // Parameterized constructor
    public Appointment(String patientName, String mobileNumber, String appTime, HealthProfessional doctor) {
        this.appTime = appTime;
        this.doctor = doctor;
        this.mobileNumber = mobileNumber;
        this.patientName = patientName;
    }

    // Method to print all class variables
    public void appointmentInfo() {
        System.out.println("Patient Name: " + this.patientName);
        System.out.println("Mobile Number: " + this.mobileNumber);
        System.out.println("Appointment Time: " + this.appTime);
        doctor.printInfo(); // prints doctor information
    }
}
