import java.util.ArrayList;

public class Main {
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 - Using classes and objects
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Smith", "Family Dept.", "Health Clinic");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Harry", "Family Dept.", "Health Clinic");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Sam", "Family Dept.", "Health Clinic");

        Surgeon surgeon1 = new Surgeon(5, "John", "Surgery", "Heart");
        Surgeon surgeon2 = new Surgeon(6, "Lee", "Surgery", "Heart");

        // Printing GP and Surgeon Info
        gp1.printInfo();
        System.out.println("------------------------------");
        gp2.printInfo();
        System.out.println("------------------------------");
        gp3.printInfo();
        System.out.println("------------------------------");
        surgeon1.printInfo();
        System.out.println("------------------------------");
        surgeon2.printInfo();
        System.out.println("------------------------------");

        // Part 5 - Collection of appointments
        createAppointment("Smith", "0455222", "09:30", gp1);
        createAppointment("David", "0455222", "10:30", gp2);
        createAppointment("David", "0455222", "01:30", surgeon1);

        // Print all existing appointments initially
        printExistingAppointments();

        // Cancel an appointment
        cancelBooking("0455222");

        // Print appointments again to show updated list
        printExistingAppointments();
    }

    // Method to create appointments
    public static void createAppointment(String patientName, String mobileNumber, String appTime, HealthProfessional doctor) {
        if (patientName.isEmpty() || mobileNumber.isEmpty() || appTime.isEmpty() || doctor == null) {
            System.out.println("Error: Missing information, appointment not created.");
            return;
        }
        Appointment appointment1 = new Appointment(patientName, mobileNumber, appTime, doctor);
        appointments.add(appointment1);

        // Cancel one appointment and print remaining appointments
        cancelBooking("0455222");
        printExistingAppointments();
    }

    // Method to print all existing appointments
    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No Appointments");
        } else {
            for (Appointment app : appointments) {
                app.appointmentInfo();
                System.out.println("------------------------------");
            }
        }
    }
    // Method to cancel a booking
    public static void cancelBooking(String mobileNumber) {
        Appointment toRemove = null;
        for (Appointment app : appointments) {
            if (app.getMobileNumber().equals(mobileNumber)) {
                toRemove = app;
                break;
            }
        }
        if (toRemove != null) {
            appointments.remove(toRemove);
            System.out.println("Appointment canceled for mobile number: " + mobileNumber);
        } else {
            System.out.println("No appointment found for mobile number: " + mobileNumber);
        }
    }
}
