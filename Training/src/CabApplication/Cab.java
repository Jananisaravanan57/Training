package CabApplication;

import static CabApplication.Main.*;



public class Cab {
	int CabId;
    String CabName;
    String CabLoc;
    int cabLocid;
    int lastRide;
    int DriverId;

    Cab(int id, String name, String loc, int driverId) {
        this.CabId = id;
        this.CabName = name;
        this.CabLoc = loc;
        this.lastRide = 0;
        this.DriverId = driverId;
        
        for(int i = 0; i < locList.size(); i++)
        {
            Location location = (Location) locList.get(i);
            if(location.LocationName.equals(loc))
            {
                cabLocid = location.LocationId;
            }
        }
    }
}
