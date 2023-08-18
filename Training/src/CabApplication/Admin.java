package CabApplication;


import static CabApplication.Main.*;

import java.util.Scanner;

// if we make constructor as private, can't create instance of class.
class Admin {
	
	private int AdminId;
    private String pass;

    Admin(int id, String pass) {
        this.AdminId = id;
        this.pass = pass;
        if (isLoginSuccess()) {
            System.out.println("Enter your choice\n1.RideSummary\n2.CustomerSummary\n");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                {
                    getRideSummary();
                    break;
                }
                case 2:
                {
                    getCustomerSummary();
                    break;
                }
            }
        }
    }
   
    

    

    boolean isLoginSuccess() {
        if(this.AdminId == 1 && this.pass.equals("123"))
        {
            return true;
        }
        return false;
    }

    void getRideSummary() {
        for(int i = 0; i < rideList.size(); i++)
        {
            System.out.println(rideList.get(i));
        }
    }

    void getCustomerSummary() {
        for(int i = 0; i < custList.size(); i++)
        {
            System.out.println(custList.get(i));
        }
    }

}
