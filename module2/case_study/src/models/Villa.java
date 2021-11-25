package models;

public class Villa extends Facility{
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String roomStandard, double poolArea, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String id, String serviceName, double usableArea, double rentalCosts, int maxPeople, String rentalType, int numberOfUses, String roomStandard, double poolArea, int numberOfFloors) {
        super(id, serviceName, usableArea, rentalCosts, maxPeople, rentalType, numberOfUses);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "id='" + getId() + '\'' +
                ", serviceName='" + getServiceName() + '\'' +
                ", usableArea=" + getUsableArea() + '\'' +
                ", rentalCosts=" + getRentalCosts() + '\'' +
                ", maxPeople=" + getMaxPeople() + '\'' +
                ", rentalType='" + getRentalType() + '\'' +
                ", numberOfUses=" + getNumberOfUses() +
                ", roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    @Override
    public String showInfor() {
        return "Room: Id = " + getId() + ", service name = " + getServiceName() + ", rental cost = " + getRentalCosts()
                + ", usable area = " + getUsableArea() + ", maximum number of people = " + getMaxPeople() + ", rental type = "
                + getRentalType() + ", number of uses = " + getNumberOfUses() + ", room standard = " + getRoomStandard()
                + ", pool area = " + getPoolArea() + ", number of floors = " + getNumberOfFloors();
    }

    public String getInforToCSV() {
        return getId() + "," + getServiceName() + "," + getRentalCosts()
                + "," + getUsableArea() + "," + getMaxPeople() + ","
                + getRentalType() + "," + getNumberOfUses() + "," + getRoomStandard()
                + "," + getPoolArea() + "," + getNumberOfFloors();
    }
}
