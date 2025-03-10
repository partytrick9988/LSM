import java.util.ArrayList;
import java.util.Scanner;

public class User {
    String userid;
    String name;
    String role;
    String email;
    long citizenshipNumber;
    String password;
    boolean status;
    User(String userID,String name, String role, String email,long citizenshipNumber,String password){
        this.userid=userID;
        this.name=name;
        this.role=role;
        this.email=email;
        this.citizenshipNumber=citizenshipNumber;
        this.password=password;
    }
    public void usersDetails() {
        System.out.println("User ID: " + userid);
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Email: " + email);
    }
}
class NormalUser extends User{
    License license;

    NormalUser(String userID,String name, String role, String email,long citizenshipNumber,String password, boolean status) {
        super(userID, name, role, email, citizenshipNumber, password);
        this.status = status;
    }
    public boolean applyForLicense(){
        System.out.println("User ID: " + userid);
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Email: " + email);
        System.out.println("Citizenship Number: " + citizenshipNumber);
        System.out.println("You are pending");
        this.status=false;
        return status;
    }

    public void checkStatus(){
        super.usersDetails();
        System.out.println("License data:");
        license.displayLicenseDetails();

    }

 }
class Admin extends User {

        Admin(String userID, String name, String role, String email, long citizenshipNumber, String password) {
            super(userID, name, role, email, citizenshipNumber, password);
        }

        public void approveApplication(Application application, Scanner sc, ArrayList<User> users) {

            System.out.println("Approving application for User ID: " + application.userID);

            System.out.print("Enter a password for User ID " + application.userID + ": ");
            String newPassword = sc.nextLine();

            NormalUser approvedUser = new NormalUser(application.userID, application.appName, "normal", application.appEmail, application.appCtzn, newPassword, true);

            // Add the new user to the list of users
            users.add(approvedUser);
            System.out.println("User ID " + application.userID + " has been approved and a password has been set.");
        }

        public void rejectApplication(Application application) {
            System.out.println("Rejecting application for User ID: " + application.userID);
            System.out.println("Application ID " + application.applicationID + " is rejected.");
        }

        public void generateReport(ArrayList<User> users) {
            System.out.println("====== DoTM License Report ======");
            for (User user : users) {
                System.out.println("User ID: " + user.userid);
                System.out.println("Name: " + user.name);
                System.out.println("Role: " + user.role);
                System.out.println("Citizenship Number: " + user.citizenshipNumber);
                System.out.println("Password: " + user.password);
                System.out.println("");
            }
        }
    }


