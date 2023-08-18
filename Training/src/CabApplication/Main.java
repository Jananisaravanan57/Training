package CabApplication;

import java.util.*;

public class Main {
	static ArrayList custList;
    static ArrayList cabList;
    static ArrayList locList;
    static ArrayList driverList;
    static ArrayList rideList;

    public static void main(String[] args) {
        initialize();
        System.out.println("\tWelcome to Zula Cab Booking\t\n");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Choice:\n1.Admin\n2.Customer\n");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter admin id and pass");
                    int id = 0;
					String pass = null;
                    try {
                    id = scanner.nextInt();
                    pass = scanner.next();
                    }
                    catch(InputMismatchException e) {
                    	System.out.println(e);
                    }
                    Admin admin = new Admin(id, pass);
                
                    break;
                }

                case 2: {
                    System.out.println("Enter your choice\n1.Login\n2.SignUp\n");
                    int ch = scanner.nextInt();
                    switch (ch) {
                        case 1: {
                        	
                            System.out.println("Enter customer id and pass");
                            int id = 0;
							String pass = null;
                            try {
                            id = scanner.nextInt();
                            pass = scanner.next();
                            }catch(InputMismatchException e) {
                            	System.out.println(e);
                            }
                            Customer cust;
                            int i;
                            for (i = 0; i < custList.size(); i++) {
                                cust = (Customer) custList.get(i);
                                if (id == cust.CustomerId && pass.equals(cust.pass)) {
                                    cust.startBooking();
                                    break;
                                }
                            }
                            if (i == custList.size()) {
                                System.out.println("Login unsuccess");
                            }
                            break;
                        	
                        	
                        }
                        case 2: {
                            System.out.println("Enter your name and password");
                            String name = scanner.next();
                            String pass = scanner.next();

                            System.out.println("Your Id is" + custList.size());

                            Customer cust = new Customer(custList.size(), name, pass);
                            custList.add(cust);

                            System.out.println("Register successfull!!!Please Login again");
                            break;
                        }
                    }
                }

            }

            System.out.println("Press y to continue");
            char ch = scanner.next().charAt(0);
            if (ch != 'y' && ch != 'Y') {
                System.exit(0);
            }
        }
    }

    private static void initialize() {
        custList = new ArrayList();
        Customer customer = new Customer(1, "abc", "xyz");
        custList.add(customer);

        driverList = new ArrayList();
        Driver driver = new Driver(1, "d1", "123");
        driverList.add(driver);
        driver = new Driver(2, "d2", "123");
        driverList.add(driver);
        driver = new Driver(3, "d3", "123");
        driverList.add(driver);
        driver = new Driver(4, "d4", "123");
        driverList.add(driver);

        locList = new ArrayList();
        Location location = new Location(1, "A", 0);
        locList.add(location);

        location = new Location(2, "B", 4);
        locList.add(location);

        location = new Location(3, "C", 7);
        locList.add(location);

        location = new Location(4, "D", 12);
        locList.add(location);

        location = new Location(5, "E", 15);
        locList.add(location);

        location = new Location(6, "F", 17);
        locList.add(location);

        location = new Location(7, "G", 18);
        locList.add(location);

        location = new Location(8, "H", 24);
        locList.add(location);

        location = new Location(9, "I", 31);
        locList.add(location);

        location = new Location(10, "j", 34);
        locList.add(location);

        cabList = new ArrayList();
        Cab cab = new Cab(1, "TN08LS5634", "A", 1);
        cabList.add(cab);

        cab = new Cab(2, "TN08LS5734", "D", 2);
        cabList.add(cab);

        cab = new Cab(3, "TN08LS5834", "G", 3);
        cabList.add(cab);

        cab = new Cab(4, "TN08LS5934", "A", 4);
        cabList.add(cab);
        
        rideList = new ArrayList();

    }

}
