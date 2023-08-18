package CabApplication;

public class Ride {
	int RideId;
    int CustomerId;
    int CabId;
    int SrcId;
    int DestId;
    double fare;
    double distance;

    Ride(int i, int CustomerId, int cabid, int src, int dest, double fare, int distance) {
        this.RideId = i;
        this.CustomerId = CustomerId;
        this.CabId = cabid+1;
        this.SrcId = src;
        this.DestId = dest;
        this.fare = fare;
        this.distance = distance;
    }

    @Override
    public String toString() {
       return "Rideid: "+this.RideId+"\nCustomerId: "+this.CustomerId+"\nCabId: "+ this.CabId +"\nSrcID: "+this.SrcId + "\nDestId: "+ this.DestId + "\nFare: "+ this.fare + "\nDistance: "+ this.distance;
    }
    
}
