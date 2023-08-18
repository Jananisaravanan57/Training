package CabApplication;


import static CabApplication.Main.*;

public class Location {

	int LocationId;
	String LocationName;
	int distFromOrigin;

	Location(int id, String name, int dist) {
		
		this.LocationId = id;
		this.LocationName = name;
		this.distFromOrigin = dist;
	}

	public static int getDistance(int src, int dest) {
		
		int srcdist = 0;
		int destdist = 0;
		for (int i = 0; i < locList.size(); i++) {
			Location loc = (Location) locList.get(i);
			if (loc.LocationId == src) {
				srcdist = loc.distFromOrigin;
			}
			if (loc.LocationId == dest) {
				destdist = loc.distFromOrigin;
			}
		}
		return Math.abs((srcdist - destdist));
	}

	public static int getNearbyCab(int src) {

		int mindist = 9999;
		int cabId = 0;
		for (int i = 0; i < cabList.size(); i++) {
			Cab cab = (Cab) cabList.get(i);
			int temp = getDistance(src, cab.cabLocid);
			if (temp < mindist) {
				if (cab.lastRide != rideList.size()) {
					mindist = temp;
					cabId = cab.CabId;
				}

			}
		}
		return cabId;
	}

}
