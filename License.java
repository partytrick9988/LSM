//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//public class License {
//    public static String Regi(String a, int b, long c, String d,Map<String,Boolean> status) {
//        if (b < 18) {
//            return "You are not eligible";
//        }
//        System.out.println("Name: "+a);
//        System.out.println("Age: "+b);
//        System.out.println("Citizen no: "+c);
//        System.out.println("Password: "+d);
//        System.out.println("");
//        status.put(a,false);
//        return "Registration submitted for " + a;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Map<String,Boolean> status = new HashMap<>();
//        ArrayList<Number> a= new ArrayList<>();
//        ArrayList<String> b= new ArrayList<>();
//        String name = "";
//        String pass = "";
//        String adminname="admin";
//        String adminpass="123";
//
//        boolean pro=true;
//        while(pro){
//        System.out.println("""
//                Press no
//                1)Register
//                2)Login
//                3)Admin
//                4)Exit
//                """);
//        int input = sc.nextInt();
//        sc.nextLine();
//
//            switch (input) {
//                case 1:
//
//                    System.out.println("Enter your age: ");
//                    int age = sc.nextInt();
//                    sc.nextLine();
//
//                    System.out.println("Enter your name: ");
//                    name = sc.nextLine();
//
//
//                    System.out.println("Enter citizenship number: ");
//                    long ctzn = sc.nextLong();
//                    sc.nextLine();
//
//                    System.out.println("Create a password: ");
//                    pass = sc.nextLine();
//                    String result = Regi(name, age, ctzn, pass,status);
//                    System.out.println(result);
//                    b.add(name);
//                    a.add(age);
//                    a.add(ctzn);
//                    b.add(pass);
//
//                    break;
//
//                case 2:
//                    System.out.println("Enter name: ");
//                    String name2 = sc.nextLine();
//                    System.out.println("Enter Password: ");
//                    String pas = sc.nextLine();
//                    if (a.contains(name2)){
//                        if(b.get(0).equals(name2) && b.get(1).equals(pas)){
//
//                    }
//                    }
//                case 3:
//                    System.out.println("Enter admin name: ");
//                    String adnam=sc.nextLine();
//                    System.out.println("Enter password: ");
//                    String adpas= sc.nextLine();
//                    if(adnam.equals(adminname) && adpas.equals(adminpass)){
//                        System.out.println("Welcome admin");
//                        if(b.isEmpty()){
//                            System.out.println("No resignation have been made");
//                            continue;
//                        }
//                        for(int i=0;i<b.size();i++){
//                            String user = b.get(i);
//                            if(!status.get(user)){
//                                System.out.println("Name: "+user);
//                                System.out.println("Age: "+a.get(i*2));
//                                System.out.println("Citizen no: "+a.get(i*2+1));
//                                System.out.println("Approve(yes/no): ");
//                                String ans=sc.nextLine();
//                                if(ans.equalsIgnoreCase("yes")){
//                                    status.put(user,true);
//                                    System.out.println(user+" is approved");
//                                }else if(ans.equalsIgnoreCase("no")){
//                                    status.put(user,false);
//                                    System.out.println(user+" is disapproved");
//                                }
//
//                                }
//                            }
//                        }
//                    case 4:
//                    pro=false;
//                    break;
//
//
//
//            }
//        }
//    }
//}
import java.time.LocalDateTime;
public class License{
    String licenseID;
    String category;
    LocalDateTime issueDate = LocalDateTime.now();
    LocalDateTime expiryDate = issueDate.plusYears(5);
    License(String licenseID, String category, LocalDateTime issueDate, LocalDateTime expiryDate){
        this.licenseID=licenseID;
        this.category=category;
        this.issueDate=issueDate;
        this.expiryDate=expiryDate;

    }
    public void displayLicenseDetails() {
        System.out.println("License ID: " + licenseID);
        System.out.println("Category: " + category);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Expiry Date: " + expiryDate);
    }
}
