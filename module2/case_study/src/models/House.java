package models;

public class House extends Facility{
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String roomStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String id, String serviceName, double usableArea, double rentalCosts, int maxPeople, String rentalType, int numberOfUses ,String roomStandard, int numberOfFloors) {
        super(id, serviceName, usableArea, rentalCosts, maxPeople, rentalType, numberOfUses);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "id='" + getId() + '\'' +
                ", serviceName='" + getServiceName() + '\'' +
                ", usableArea=" + getUsableArea() + '\'' +
                ", rentalCosts=" + getRentalCosts() + '\'' +
                ", maxPeople=" + getMaxPeople() + '\'' +
                ", rentalType='" + getRentalType() + '\'' +
                ", numberOfUses=" + getNumberOfUses() + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    @Override
    public String showInfor() {
        return "Room: Id = " + getId() + ", service name = " + getServiceName() + ", rental cost = " + getRentalCosts()
                + ", usable area = " + getUsableArea() + ", maximum number of people = " + getMaxPeople() + ", rental type = "
                + getRentalType() + ", number of uses = " + getNumberOfUses()
                + ", room standard = " + getRoomStandard() + ", number of floors = " + getNumberOfFloors();
    }

    public String getInforToCSV() {
        return getId() + "," + getServiceName() + "," + getRentalCosts() + "," + getUsableArea()
                + "," + getMaxPeople() + "," + getRentalType() + "," + getNumberOfUses() + "," + getRoomStandard()
                + "," + getNumberOfFloors();
    }
}
