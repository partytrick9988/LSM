import java.util.Scanner;
import java.util.ArrayList;

class Application{
    int applicationID;
    String userID;
    String requestedCategory;
    String appName;
    String appEmail;
    long appCtzn;


    Application(int applicationID, String userID, String requestedCategory){
        this.applicationID=applicationID;
        this.userID=userID;
        this.requestedCategory=requestedCategory;

    }
    Scanner appDetails =new Scanner(System.in);
    public void applicantDetails(){
        System.out.println("Enter your name: ");
        this.appName=appDetails.nextLine();
        System.out.println("Enter your Citizenship Number: ");
        this.appCtzn=appDetails.nextLong();
        appDetails.nextLine();
        System.out.println("Enter your email: ");
        this.appEmail=appDetails.nextLine();

    }

}

public class Lisense {
    public void Dashboard(User user, Scanner sc, ArrayList<User> users) {
        System.out.println("=====DASHBOARD=====");
        System.out.println("1) Check License Status");
        System.out.println("2) Log out");
        int choice = sc.nextInt();
        sc.nextLine();
        boolean gigachad = true;
        while (gigachad) {
            switch (choice) {
                case 1:
                    // Apply for a license
                    ((NormalUser) user).applyForLicense();
                    break;
                case 2:
                    ((NormalUser) user).checkStatus();
                    break;
                case 3:
                    System.out.println("Logging out...");
                    gigachad = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Application> applicants = new ArrayList<>();
        ArrayList<User> users = new ArrayList<>();


        Admin adminAccount = new Admin("admin", "admin", "admin", "admin@admin.com", 123, "admin");
        users.add(adminAccount);


        System.out.println("""  
                Press number;
                1)Sign up
                2)User Login
                """);
        int answer = sc.nextInt();
        switch (answer) {
            case 1:
                System.out.println("Enter application ID: ");
                int application = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter user ID: ");
                String userid = sc.nextLine();
                System.out.println("Enter role: ");
                String vechile1 = sc.nextLine();
                System.out.println("Your application is pending");
//
                Application app = new Application(application, userid, vechile1);
                applicants.add(app);

                break;

            case 2:


                // Taking user input
                System.out.print("Enter your User ID: ");
                String userID = sc.nextLine();

                System.out.print("Enter your Name: ");
                String name = sc.nextLine();

                System.out.print("Enter your Role: ");
                String role2 = sc.nextLine();

                System.out.print("Enter your Email: ");
                String email = sc.nextLine();

                System.out.print("Enter your Citizenship Number: ");
                long citizenshipNumber = sc.nextLong();
                sc.nextLine(); // Consume leftover newline

                System.out.print("Enter your Password: ");
                String password = sc.nextLine();

                User userFinal= new User(userID,name,role2,email,citizenshipNumber,password);
                NormalUser normalUser = new NormalUser(userID,name,role2,email,citizenshipNumber,password,true);
                users.add(normalUser);
                Admin admin=new Admin(userID,name,role2,email,citizenshipNumber,password);


                if (role2.equals("admin") && name.equals("admin") && password.equals("admin")) {

                        System.out.println("Welcome admin!");
                        if (applicants.isEmpty()) {
                            System.out.println("There is no applications");
                        } else {
                            for(Application apps: applicants){
                                System.out.println("Application ID: " + apps.applicationID);
                                System.out.println("User ID: " + apps.userID);
                                System.out.println("Requested Category: " + apps.requestedCategory);
                                System.out.println("Approval (yes/no): ");
                                String approval = sc.nextLine();

                                if ("yes".equalsIgnoreCase(approval)) {
                                    admin.approveApplication(apps,sc, users);
                                } else if ("no".equalsIgnoreCase(approval)) {
                                    admin.rejectApplication(apps);

                                }


                            }
                        }


                    }
                }


        }
    }


