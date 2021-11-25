package models;

public class Room extends Facility{
    private String freeServiceIncluded;

    public Room() {
    }

    public Room(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String id, String serviceName, double usableArea, double rentalCosts, int maxPeople, String rentalType, int numberOfUses, String freeServiceIncluded) {
        super(id, serviceName, usableArea, rentalCosts, maxPeople, rentalType, numberOfUses);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id='" + getId() + '\'' +
                ", serviceName='" + getServiceName() + '\'' +
                ", usableArea=" + getUsableArea() + '\'' +
                ", rentalCosts=" + getRentalCosts() + '\'' +
                ", maxPeople=" + getMaxPeople() + '\'' +
                ", rentalType='" + getRentalType() + '\'' +
                ", numberOfUses=" + getNumberOfUses() +
                ", freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }

    @Override
    public String showInfor() {
        return "Room: Id = " + getId() + ", service name = " + getServiceName() + ", rental cost = " + getRentalCosts()
                + ", usable area = " + getUsableArea() + ", maximum number of people = " + getMaxPeople() + ", rental type = "
                + getRentalType() + ", number of uses = " + getNumberOfUses() + ", free service included = " + getFreeServiceIncluded();
    }

    public String getInforToCSV() {
        return getId() + "," + getServiceName() + "," + getRentalCosts() + "," + getUsableArea()
                + "," + getMaxPeople() + "," + getRentalType() + "," + getNumberOfUses() + "," + getFreeServiceIncluded();
    }
}
