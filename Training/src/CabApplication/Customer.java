package CabApplication;

import static CabApplication.Main.*;

import java.util.*;

public class Customer {
	int CustomerId;
    String CustomerName;
    String pass;
    
    Customer(int custid, String custname, String pass)
    {
        this.CustomerId = custid;
        this.CustomerName = custname;
        this.pass = pass;
    }

    protected void startBooking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Location Available");
        for(int  i = 0; i < locList.size(); i++)
        {
            Location loc = (Location) locList.get(i);
            System.out.println("Loc id:" + loc.LocationId + "Location Name:" + loc.LocationName);
        }
        
        System.out.println("NearBy cabs:");
        
        for(int i = 0; i < cabList.size(); i++)
        {
            Cab cab = (Cab) cabList.get(i);
            System.out.println("Cab id: "+cab.CabId + "  Cab Location: " + cab.CabLoc);
        }
        
        
        System.out.println("Enter your source and dest Location id:");
        int src = sc.nextInt();
        int dest  = sc.nextInt();
        
        int distance = Location.getDistance(src, dest);
        double fare = distance * 10;
        int cabid = Location.getNearbyCab(src);
        
        System.out.println("Distance:"+distance);
        System.out.println("Fare:"+ fare);
        System.out.println("Your cab:"+ (cabid+1));
        
        System.out.println("Confirm your book??\n1.Confirm\n2.Cancel\n");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:
            {
                Ride ride = new Ride(rideList.size()+1, this.CustomerId, cabid, src, dest, fare, distance);
                rideList.add(ride);
                for(int i = 0; i < cabList.size(); i++)
                {
                    Cab cab = (Cab) cabList.get(i);
                    if(cabid == cab.CabId)
                    {
                        cab.cabLocid = dest;
                        for(int j = 0; j < locList.size(); j++)
                        {
                            Location loc = (Location) locList.get(j);
                            if(loc.LocationId == dest)
                            {
                                cab.CabLoc = loc.LocationName;
                                break;
                            }
                        }
                        break;
                    }
                }
                System.out.println("Booking successfull");
                break;
            }
            case 2:
            {
                System.out.println("Booking cancelled");
                break;
            }
        }
        
        
        
    }

    @Override
    public String toString() {
        return "CustomerId: "+ this.CustomerId + "\nCustomer Name: "+ this.CustomerName;
    }
}
